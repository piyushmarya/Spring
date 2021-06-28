package com.piyush.vCenterAPI.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.piyush.vCenterAPI.Models.Volume;

@Service
public class VolumeService {
     public List<Volume> getVolumes(){
    	 Random rand = new Random();
    	 String[] volumeType = new String[] {"iSCSI", "NFS", "FC"};
    	 List<Volume> volumeList = new ArrayList<>();
    	 for(int i=0; i<5000; i++) {
    		 Volume volumeObj = new Volume();
    		 volumeObj.setVolumeName("Volume-"+i);
    		 int size=rand.nextInt(5000);
    		 volumeObj.setSizeGb(size);
    		 volumeObj.setSizeTb(Float.valueOf(size)/1024);
    		 volumeObj.setVolumeType(volumeType[rand.nextInt(3)]);
    		 volumeList.add(volumeObj);
    	 }
    	 return volumeList;
     } 
}
