package com.piyush.vCenterAPI.Models;

public class Volume {
	
	private String volumne_name;
	private String volume_type;
	private int size_GB;
	private double size_TB;
		
	public Volume() {
		super();
	}
	
	public Volume(String volumne_name, String volume_type, int size, Float sizeTb) {
		super();
		this.volumne_name = volumne_name;
		this.volume_type = volume_type;
		this.size_GB = size;
		this.size_TB = sizeTb;
	}
	
	public String getVolumeName() {
		return volumne_name;
	}
	
	public void setVolumeName(String volumne_name) {
		this.volumne_name = volumne_name;
	}
	
	public String getVolumeType() {
		return volume_type;
	}
	
	public void setVolumeType(String volume_type) {
		this.volume_type = volume_type;
	}
	
	public int getSizeGb() {
		return size_GB;
	}
	
	public void setSizeGb(int size) {
		this.size_GB = size;
	}
	
	public double getSizeTb() {
		return size_TB;
	}

	public void setSizeTb(Float size_TB) {
		this.size_TB = Math.floor(size_TB * 100) / 100;
	}

}
