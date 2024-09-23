package com.wiproworkspan.db2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wiproworkspan.db2.service.MergeTableService;
import com.wiproworkspan.db2.service.MonitorJobsDTO;

@RestController
@RequestMapping("/mergeTable")
@CrossOrigin(origins = "http://localhost:3000")
public class MergeTableController {

	@Autowired
	private MergeTableService ser;
	
	@GetMapping("/getAll")
    public List<MonitorJobsDTO> getAllJobs(){
        return ser.MonitorService();
    }
}
