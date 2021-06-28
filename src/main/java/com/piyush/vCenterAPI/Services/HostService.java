package com.piyush.vCenterAPI.Services;

import com.vmware.vim25.HostRuntimeInfo;
import com.vmware.vim25.HostSystemPowerState;
import com.vmware.vim25.InvalidProperty;
import com.vmware.vim25.RuntimeFault;
import com.vmware.vim25.mo.HostSystem;
import com.vmware.vim25.mo.InventoryNavigator;
import com.vmware.vim25.mo.ManagedEntity;
import com.vmware.vim25.mo.ServiceInstance;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.piyush.vCenterAPI.vim25Connection.vCenterConnection;
import com.piyush.vCenterAPI.Models.EsxiHost;

@Service
public class HostService {
    public List<EsxiHost> getHostInfo() throws InvalidProperty, RuntimeFault, RemoteException{
    	List<EsxiHost> HostList = new ArrayList<>();
    	ServiceInstance serviceInstance=vCenterConnection.getConnection();
    	ManagedEntity[] managedEntities = new InventoryNavigator(serviceInstance.getRootFolder()).searchManagedEntities("HostSystem");
    	for (ManagedEntity managedEntity : managedEntities) {
    		EsxiHost host_obj = new EsxiHost();
    		HostSystem host = (HostSystem) managedEntity;
			HostRuntimeInfo hostRuntimeInfo=host.getRuntime();
			HostSystemPowerState powerState =host.getRuntime().getPowerState();
			if(HostSystemPowerState.poweredOn==hostRuntimeInfo.powerState)
				host_obj.setHostConnectionState("Powered On");
			else if(HostSystemPowerState.poweredOff==hostRuntimeInfo.powerState)
				host_obj.setHostConnectionState("Powered Off");
			else if(HostSystemPowerState.standBy==hostRuntimeInfo.powerState)
				host_obj.setHostConnectionState("Stand by");
			else if(HostSystemPowerState.unknown==hostRuntimeInfo.powerState)
                host_obj.setHostConnectionState("Unknown");
			host_obj.setHostIp(host.getName());
    		host_obj.setHostName(host.getName());
    		host_obj.setNumberOfDatastoress(host.getDatastores().length);
    	    host_obj.setNumberOfVm(host.getVms().length);
    	    HostList.add(host_obj);
    	}
    	return HostList;
    }
}
