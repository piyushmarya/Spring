package com.piyush.vCenterAPI.Models;



public class Routes {
    private String url;
    public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	private String method;
    private String description;
	
    public Routes() {
	}

	public Routes(String url, String method, String description) {
		this.url = url;
		this.method = method;
		this.description = description;
	}
    
}
