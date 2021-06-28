package com.piyush.vCenterAPI.Controllers;

import java.rmi.RemoteException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.piyush.vCenterAPI.Models.EsxiHost;
import com.piyush.vCenterAPI.Services.HostService;
import com.vmware.vim25.InvalidProperty;
import com.vmware.vim25.RuntimeFault;


@RestController
@RequestMapping("/host")
public class HostController {
    private final HostService hostService;
 
    @Autowired
	public HostController(HostService hostService) {
		this.hostService = hostService;
	}
    
    @GetMapping
    public List<EsxiHost> getHosts() throws InvalidProperty, RuntimeFault, RemoteException{
    	return hostService.getHostInfo();
    }
}
