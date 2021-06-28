package com.piyush.vCenterAPI.Repository;

import org.springframework.data.repository.CrudRepository; 

import com.piyush.vCenterAPI.Models.Storage;

public interface StorageRepository extends CrudRepository<Storage, Integer>
{
}
