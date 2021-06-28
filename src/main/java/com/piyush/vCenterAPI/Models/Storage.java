package com.piyush.vCenterAPI.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Storage {
	@Id
	@Column
	private int id;
	@Column
	private String storage_name;
	@Column
	private String storage_username;
	@Column
	private String storage_password;
	
	public Storage() {
		super();
	}
	
	public Storage(int id, String storage_name, String storage_username, String storage_password) {
		super();
		this.id = id;
		this.storage_name = storage_name;
		this.storage_username = storage_username;
		this.storage_password = storage_password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStorageName() {
		return storage_name;
	}
	public void setStorageName(String storage_name) {
		this.storage_name = storage_name;
	}
	public String getStorageUsername() {
		return storage_username;
	}
	public void setStorageUsername(String storage_username) {
		this.storage_username = storage_username;
	}
	public String getStoragePassword() {
		return storage_password;
	}
	public void setStoragePassword(String storage_password) {
		this.storage_password = storage_password;
	}


}
