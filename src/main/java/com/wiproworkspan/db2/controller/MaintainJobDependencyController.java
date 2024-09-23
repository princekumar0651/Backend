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

import com.wiproworkspan.db2.entity.MaintainJobDependency;
import com.wiproworkspan.db2.service.MaintainJobDependencyServiceImpl;

@RestController
@RequestMapping("/maintainJobDependency")
@CrossOrigin(origins = "http://localhost:3000")
public class MaintainJobDependencyController {
	
	@Autowired
	MaintainJobDependencyServiceImpl ser;
	
	@GetMapping("/getAll")
	public List<MaintainJobDependency> getAll() {
		return ser.getAllMaintainJobDependency();
	}
	
	@PatchMapping("/update")
	public String updateMaintainJobDependency(@RequestBody MaintainJobDependency mDep) {
		return ser.updateMaintainJobDependency(mDep);
	}
	
	@PostMapping("/add")
	public String addMaintainJobDependency(@RequestBody MaintainJobDependency mDep) {
		return ser.addMaintainJobDependency(mDep);
	}
	
}
