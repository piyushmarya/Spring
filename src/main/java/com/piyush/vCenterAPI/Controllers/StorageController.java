package com.piyush.vCenterAPI.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.piyush.vCenterAPI.Services.StorageService;
import com.piyush.vCenterAPI.Models.Storage;

@RestController
@RequestMapping("/storage")
public class StorageController {
    private final StorageService storageService;
    
    @Autowired
	public StorageController(StorageService storageService) {
		super();
		this.storageService = storageService;
	}
    
    @GetMapping()
    public List<Storage> getStorages(){
    	return storageService.getAllStorage();
    }
    
    @PostMapping()
    public int createStorage(@RequestBody Storage s) {
    	storageService.createStorage(s);
    	return s.getId();
    }
    
    @DeleteMapping("{id}")
    public void deleteStorage(@PathVariable("id")int id) {
    	storageService.deleteStorage(id);
    }    
}
