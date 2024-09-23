package com.wiproworkspan.db2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wiproworkspan.db2.entity.MaintainJobSchedules;
import com.wiproworkspan.db2.service.MaintainJobSchedulesServiceImpl;

@RestController
@RequestMapping("/maintainJobSchedules")
@CrossOrigin(origins = "http://localhost:3000")
public class MaintainJobSchedulesController {

	@Autowired
	private MaintainJobSchedulesServiceImpl ser;
	
	@GetMapping("/hello")
	public String hello() {
	 	return "Deva is here!";	
		
	}
	
	@GetMapping("/getAll")
	public List<MaintainJobSchedules> getAllJobSchedules(){
		return ser.getAllJobSchedules();
	}
	
	@PatchMapping("/updateMaintainJobSchedule")
	public String updateMaintainJobSchedule(@RequestBody MaintainJobSchedules mJobs) {
		return ser.updateMaintainJobSchedule(mJobs);
	}
	
	@PostMapping("/addMaintainJobSchedule")
	public String addMaintainJobSchedule(@RequestBody MaintainJobSchedules mJobs) {
		return ser.addMaintainJobSchedule(mJobs);
	}
	
	@PostMapping("/updateHoldFlag")
	public String updateHoldFlag(@RequestBody boolean type) {
		return ser.updateHoldFlagForAllEntities(type);
	}
	
}
