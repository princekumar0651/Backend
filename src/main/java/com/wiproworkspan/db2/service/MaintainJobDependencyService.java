package com.wiproworkspan.db2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wiproworkspan.db2.entity.MaintainJobDependency;

@Service
public interface MaintainJobDependencyService {

	public List<MaintainJobDependency> getAllMaintainJobDependency();
	
	public String updateMaintainJobDependency(MaintainJobDependency mDep);
	
	public String addMaintainJobDependency(MaintainJobDependency mDep);
}
