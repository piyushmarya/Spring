package com.piyush.vCenterAPI.Models;

public class EsxiHost {
	private String host_connection_state;
	private String host_name;
	private String host_ip;
	private int number_of_datastores;
	private int number_of_vm;
	
	public EsxiHost() {
		super();
	}

	public EsxiHost(String host_connection_state, 
			        String host_name, 
			        String host_ip, 
			        int number_of_datastores,
			        int number_of_vm) {
		super();
		this.host_connection_state = host_connection_state;
		this.host_name = host_name;
		this.host_ip = host_ip;
		this.number_of_datastores = number_of_datastores;
		this.number_of_vm = number_of_vm;
	}

	public String getHostConnectionState() {
		return host_connection_state;
	}

	public void setHostConnectionState(String host_connection_state) {
		this.host_connection_state = host_connection_state;
	}

	public String getHostName() {
		return host_name;
	}

	public void setHostName(String host_name) {
		this.host_name = host_name;
	}

	public String getHostIp() {
		return host_ip;
	}

	public void setHostIp(String host_ip) {
		this.host_ip = host_ip;
	}

	public int getNumberOfDatastores() {
		return number_of_datastores;
	}

	public void setNumberOfDatastoress(int number_of_datastores) {
		this.number_of_datastores = number_of_datastores;
	}

	public int getNumberOfVm() {
		return number_of_vm;
	}

	public void setNumberOfVm(int number_of_vm) {
		this.number_of_vm = number_of_vm;
	}
}