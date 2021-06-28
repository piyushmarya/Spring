package com.piyush.vCenterAPI.Models;

public class Datastore {
	
	private String datastore_name;
    private long datastore_size_gb;
	private int number_of_vm;
    private String host;
      
    public Datastore() {
    	super();
	}
    
	public Datastore(String datastore_name, 
			        long datastore_size, 
			        int number_of_vm, 
			        String host) {
		super();
		this.datastore_name = datastore_name;
		this.datastore_size_gb = datastore_size;
		this.number_of_vm = number_of_vm;
		this.host = host;
	}
	
	public String getDatastoreName() {
		return datastore_name;
	}
	
	public void setDatastoreName(String datastore_name) {
		this.datastore_name = datastore_name;
	}
	
    public long getDatastoreSizeGb() {
		return datastore_size_gb;
	}
    
	public void setDatastoreSizeGb(long datastore_size_gb) {
		this.datastore_size_gb = datastore_size_gb;
	}
	
	public int getNumberOfVm() {
		return number_of_vm;
	}
	
	public void setNumberOfVm(int number_of_vm) {
		this.number_of_vm = number_of_vm;
	}
	
	public String getHost() {
		return host;
	}
	
	public void setHost(String host) {
		this.host = host;
	}   
}
