package com.piyush.vCenterAPI.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.piyush.vCenterAPI.Models.Volume;
import com.piyush.vCenterAPI.Services.VolumeService;

@RestController
@RequestMapping("/volume")
public class VolumeController {
    private final VolumeService volumeService;
 
    @Autowired
	public VolumeController(VolumeService volumeService) {
		this.volumeService = volumeService;
	}
    
    @GetMapping
    public List<Volume> getVolumes(){
    	return volumeService.getVolumes();
    }
    
    
}
