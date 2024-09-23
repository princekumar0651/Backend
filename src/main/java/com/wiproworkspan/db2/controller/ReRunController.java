package com.wiproworkspan.db2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ReRun")
@CrossOrigin(origins = "http://localhost:3000")
public class ReRunController {

	@Autowired
	private com.wiproworkspan.db2.service.ReRunService ser;
	
	@GetMapping("/{exec_id}/{username}")
	 public void getSchedule(@PathVariable int exec_id, @PathVariable String username) {
	         ser.getAllReRun(exec_id,username);
	    }
	
}
