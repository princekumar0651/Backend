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

import com.wiproworkspan.db1.entity.DefinePrograms;
import com.wiproworkspan.db1.service.DefineProgramsServiceImpl;

@RestController
@RequestMapping("/definePrograms")
@CrossOrigin(origins = "http://localhost:3000")
public class DefineProgramsController {
    
    @Autowired
   private DefineProgramsServiceImpl ser;
    
   
    
    @GetMapping("/getAll")
    public List<DefinePrograms> getAllGroups(){
        return ser.getAllDefinePrograms();
    }
    
    @PatchMapping("/update")
    public String updateGroup( @RequestBody DefinePrograms dProg) {
        
            return ser.updateDefineGroup(dProg);
        
    }
    
    @PostMapping("/addDefineProgram")
    public String addDefinePrograms(@RequestBody DefinePrograms dProg) {
    	if(ser.addDefinePrograms(dProg) == 1) {
    		return "Added Successfully";
    	}
    	return "Unable to add false data!";
    }
     
}
