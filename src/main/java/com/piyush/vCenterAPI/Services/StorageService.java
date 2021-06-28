package com.piyush.vCenterAPI.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.piyush.vCenterAPI.Models.Storage;
import com.piyush.vCenterAPI.Repository.StorageRepository;

@Service
public class StorageService {
	
	@Autowired
	StorageRepository storageRepository;
	
	public List<Storage> getAllStorage(){
		List<Storage> storage_list = new ArrayList<>();
		storageRepository.findAll().forEach(storage -> storage_list.add(storage));
		return storage_list;
	}
	
	public void createStorage(Storage s) {
		storageRepository.save(s);
	}
	
	public void deleteStorage(int id) {
		storageRepository.deleteById(id);
	}

}
