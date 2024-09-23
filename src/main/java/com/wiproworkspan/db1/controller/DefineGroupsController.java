package com.wiproworkspan.db1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wiproworkspan.db1.entity.DefineGroups;
import com.wiproworkspan.db1.service.DefineGroupsService;
import com.wiproworkspan.db1.service.DefineGroupsServiceImpl;

@RestController
@RequestMapping("/defineGroups")
@CrossOrigin(origins = "http://localhost:3000")
public class DefineGroupsController {

	@Autowired
	private DefineGroupsServiceImpl dSer;
	@GetMapping("/getAll")
	public List<DefineGroups> getAllGroups(){
		return dSer.getDefineGroups();
	}
	
	@PostMapping("/addDefineGroup")
	public String addDGroups(@RequestBody DefineGroups dgroup) {
		return dSer.addDefineGroups(dgroup);
	}
	
	@PatchMapping("/update")
	public String updateDefineGroups(@RequestBody DefineGroups dGroups) {
		return dSer.updateDefineGroups(dGroups);
	}
	
	@GetMapping("/name/{name}")
	public DefineGroups getName(@PathVariable String name) {
		return dSer.getByName(name);
	}
	
}
