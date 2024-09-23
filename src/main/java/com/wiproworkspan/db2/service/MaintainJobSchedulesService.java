package com.wiproworkspan.db2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wiproworkspan.db2.entity.MaintainJobSchedules;

@Service
public interface MaintainJobSchedulesService {
	
	public List<MaintainJobSchedules> getAllJobSchedules();
	
	public String updateMaintainJobSchedule(MaintainJobSchedules mJobSch);
	
	public String addMaintainJobSchedule(MaintainJobSchedules mJobSch);
	
	public String updateHoldFlagForAllEntities(boolean type);
}
