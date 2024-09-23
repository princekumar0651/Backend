package com.wiproworkspan.db1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wiproworkspan.db1.entity.DefineGroupProgram;
import com.wiproworkspan.db1.service.DefineGroupProgramServiceImpl;

@RestController
@RequestMapping("/defineGroupProgram")
@CrossOrigin(origins = "http://localhost:3000")
public class DefineGroupProgramController {
	
	@Autowired
	private DefineGroupProgramServiceImpl ser;
	
	@GetMapping("/getAll")
	public List<DefineGroupProgram> getAllDefineGroupProgram(){
		
		return ser.getAllDGProgram();
		
	}
	
	@GetMapping("/getByPGId/{id}")
	public List<DefineGroupProgram> searchByPGId(@PathVariable int id){
		return ser.searchByProgramGroupId(id);
	}
	
	@PatchMapping("/update")
	public String updateDefineGroupName(@RequestBody List<DefineGroupProgram> DPGrp){
		return ser.updateGroupProgram(DPGrp);
	}
	
	@DeleteMapping("/delete/{id}")
	public int deleteDefineGroupName(@PathVariable int id) {
		return ser.deleteGroupProgram(id);
	}
}
