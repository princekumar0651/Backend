package com.wiproworkspan.db2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wiproworkspan.db2.service.MonitorJobsDTO;
import com.wiproworkspan.db2.service.RefreshService;

@RestController
@RequestMapping("/Refresh")
@CrossOrigin(origins = "http://localhost:3000")
public class RefreshController {

	@Autowired
	private RefreshService ser;
	
	@GetMapping("/getAll/{sch_id}")
    public List<MonitorJobsDTO> getAllJobs(@PathVariable int sch_id){
        return ser.MonitorService(sch_id);
    }
}
