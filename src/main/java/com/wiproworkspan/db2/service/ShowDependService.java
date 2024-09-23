package com.wiproworkspan.db2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wiproworkspan.db2.repo.ShowDependRepo;

@Service
public class ShowDependService {
	
	 @Autowired
	 private ShowDependRepo repo;
	 
	 public List<Object[]> getAllShowDepend(int val)
	 {
		 return repo.findByShowdependencies(val);
	 }

}
