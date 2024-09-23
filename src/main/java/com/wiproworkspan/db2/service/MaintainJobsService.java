package com.wiproworkspan.db2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wiproworkspan.db2.entity.MaintainJobs;

@Service
public interface MaintainJobsService {
	
	public List<MaintainJobs> getJobs();
	
	public String updateMaintainJobs(MaintainJobs mJobs);
	
	public String addMaintain(MaintainJobs mJobs);
	


}
