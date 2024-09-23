package com.wiproworkspan.db1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wiproworkspan.db1.entity.DefineGroups;
import com.wiproworkspan.db1.entity.DefinePrograms;

@Service
public interface DefineGroupsService {

	
	public List<DefineGroups> getDefineGroups();
	public String addDefineGroups(DefineGroups defineGroups);
	public String updateDefineGroups(DefineGroups dgroups);
	
	public DefineGroups getByName(String program_group_name);
	
	
}
