package com.wiproworkspan.db1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wiproworkspan.db1.service.SchExecHistService;

@RestController
@RequestMapping("/SchExecHist")
@CrossOrigin(origins = "http://localhost:3000")
public class SchExecHistController {

	@Autowired
	SchExecHistService ser;
	
	@GetMapping("/{sch_id}")
    public List<Object[]> getSchedule(@PathVariable int sch_id) {
        return ser.getAllExecHist(sch_id);
    }
}
