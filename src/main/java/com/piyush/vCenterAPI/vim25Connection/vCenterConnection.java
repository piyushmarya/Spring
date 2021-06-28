package com.piyush.vCenterAPI.vim25Connection;

import java.net.URL;
import com.vmware.vim25.mo.ServiceInstance;

public class vCenterConnection {
	private static ServiceInstance vimService;
	static final String SERVER_NAME = "";
	static final String USER_NAME = "";
	static final String PASSWORD = "";
	static
	{
		try
		{
			String url = "https://" + SERVER_NAME + "/sdk/vimService";
	        vimService = new ServiceInstance(new URL(url), USER_NAME, PASSWORD, true);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public static ServiceInstance getConnection()
	{
		return vimService;
	}
	
}

