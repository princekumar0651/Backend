package com.wiproworkspan.db2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wiproworkspan.db2.service.ShowDependService;

@RestController
@RequestMapping("/ShowDepend")
@CrossOrigin(origins = "http://localhost:3000")
public class ShowDependController {
	
	@Autowired
	private ShowDependService ser;
	
	@GetMapping("/{sch_id}")
    public List<Object[]> getProgram(@PathVariable int sch_id) {
        return  ser.getAllShowDepend(sch_id);
    }
	

}
