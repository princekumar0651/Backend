package com.wiproworkspan.db2.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wiproworkspan.db2.repo.ReRunRepo;

@Service
public class ReRunService {

	@Autowired
	private ReRunRepo repo;
	
    @Transactional
	public void getAllReRun(int exec_id,String username) {
		repo.updateExecutionHistory(exec_id,username);
	}
	
}
