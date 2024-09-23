package com.wiproworkspan.db1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wiproworkspan.db1.repo.SchProgExecRepo;

@Service
public class SchProgExecService {

	@Autowired
	private SchProgExecRepo repo;
	
	public List<Object[]> getAllSchProgExec(int val){
		return repo.getSchProgExec(val);
	}
}

