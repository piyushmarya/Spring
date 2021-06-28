package com.piyush.vCenterAPI.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.piyush.vCenterAPI.Models.Datastore;
import com.piyush.vCenterAPI.Services.DatastoreService;

@RestController
@RequestMapping("/datastore")
public class DatastoreController {
	
	private final DatastoreService datastoreService;
	
	@Autowired
	public DatastoreController(DatastoreService datastoreService) {
		this.datastoreService = datastoreService;
	}

	@GetMapping
	public List<Datastore> fetchDatastores() {
		return datastoreService.fetchDatastores();
	}
}
