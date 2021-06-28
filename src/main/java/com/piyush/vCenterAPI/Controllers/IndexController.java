package com.piyush.vCenterAPI.Controllers;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.piyush.vCenterAPI.Models.Routes;

@RestController
public class IndexController {
	
	@GetMapping("/")
	public List<Routes> displayRoutes() {
		return List.of(new Routes("/host", "Get", "Returns host info"),
				       new Routes("/datstore", "Get", "Returns datastore info"),
				       new Routes("/volume", "Get", "Returns 5000 volumes"),
				       new Routes("/storage", "Get", "List all storage entities"),
				       new Routes("/storage", "Post", "Create a storage entity"),
				       new Routes("/storage/{id}", "Delete", "Remove a storage entity"));
	}
}
