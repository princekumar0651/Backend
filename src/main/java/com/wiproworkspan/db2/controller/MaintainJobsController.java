package com.wiproworkspan.db2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wiproworkspan.db2.entity.MaintainJobs;
import com.wiproworkspan.db2.service.MaintainJobsServiceImpl;

@RestController
@RequestMapping("/maintainJobs")
@CrossOrigin(origins = "http://localhost:3000")
public class MaintainJobsController {
    
    @Autowired
    private MaintainJobsServiceImpl ser;
    
   
    
    @GetMapping("/getAll")
    public List<MaintainJobs> getAllMaintainJobs(){
        return ser.getJobs();
    }
    
    @PatchMapping("/updateMaintainJobs")
    public String updateMaintainJobss(@RequestBody MaintainJobs mJobs) {
    	return  ser.updateMaintainJobs(mJobs);
    }
    
    @PostMapping("/addMaintainJobs")
    public String addMaintainJobs(@RequestBody MaintainJobs mJobs) {
    	return ser.addMaintain(mJobs);
    }
    
    
}