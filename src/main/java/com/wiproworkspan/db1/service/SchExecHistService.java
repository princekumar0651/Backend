package com.wiproworkspan.db1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wiproworkspan.db1.repo.SchExecHistRepo;

@Service
public class SchExecHistService {
	
	@Autowired
	SchExecHistRepo repo;

	public List<Object[]> getAllExecHist(int val){
		return repo.findAllExecHist(val);
		
	}
}
