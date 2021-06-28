package com.piyush.vCenterAPI.Services;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.vmware.vim25.mo.HostSystem;
import com.vmware.vim25.mo.InventoryNavigator;
import com.vmware.vim25.mo.ManagedEntity;
import com.vmware.vim25.mo.ServiceInstance;

import com.piyush.vCenterAPI.Models.Datastore;
import com.piyush.vCenterAPI.vim25Connection.vCenterConnection;

@Service
public class DatastoreService {
	public List<Datastore> fetchDatastores() {
		List<Datastore> datastore_list = new ArrayList<>(); 
		ServiceInstance serviceInstance=vCenterConnection.getConnection();
    	try {
			ManagedEntity[] managedEntities = new InventoryNavigator(serviceInstance.getRootFolder()).searchManagedEntities("HostSystem");
			for (ManagedEntity managedEntity : managedEntities) {
	    		HostSystem host = (HostSystem) managedEntity;
	    		com.vmware.vim25.mo.Datastore[] server_datastores= host.getDatastores();
	    		for (com.vmware.vim25.mo.Datastore ds: server_datastores) {
	    			Datastore datastore_obj = new Datastore();
	    			datastore_obj.setDatastoreName(ds.getName());
	    			datastore_obj.setDatastoreSizeGb((ds.getSummary().capacity)/(1024*1024*1024));
	    			datastore_obj.setHost(host.getName());
	    			datastore_obj.setNumberOfVm(ds.getVms().length);
	    			datastore_list.add(datastore_obj);
	    		}
	    		}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return datastore_list;
	}    
}
