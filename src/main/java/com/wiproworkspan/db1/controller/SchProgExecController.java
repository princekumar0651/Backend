package com.wiproworkspan.db1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wiproworkspan.db1.service.SchProgExecService;

@RestController
@RequestMapping("/SchProgExec")
@CrossOrigin(origins = "http://localhost:3000")
public class SchProgExecController {
	
	@Autowired 
	SchProgExecService ser;
	
	@GetMapping("/{prog_id}")
    public List<Object[]> getProgram(@PathVariable int prog_id) {
        return  ser.getAllSchProgExec(prog_id);
    }

}
