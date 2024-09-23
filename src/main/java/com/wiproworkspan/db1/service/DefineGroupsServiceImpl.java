package com.wiproworkspan.db1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.wiproworkspan.db1.entity.DefineGroups;
import com.wiproworkspan.db1.repo.DefineGroupsRepo;

@Service
public class DefineGroupsServiceImpl implements DefineGroupsService {
	
	@Autowired
	private DefineGroupsRepo repo;
	

	@Override
	public List<DefineGroups> getDefineGroups() {
		
		return repo.findAll();
	}

	@Override
	public String addDefineGroups(DefineGroups defineGroups) {
		try {
			int res = repo.insertData(defineGroups.getProgramGroupName(), defineGroups.getActive_flag(), defineGroups.getLoad_type());
			if(res ==1) {
				return "Group created!";
			}else {
				return "There is some problem,please try later.";
			}
		}catch(Exception e) {
			return e.getMessage();
		}

	}

	@Override
	public String updateDefineGroups(DefineGroups dgroups) {
		try {
			Optional opt = repo.findById(dgroups.getProgram_groupId());
			DefineGroups dGrps;
			if(opt.isPresent()) {
				dGrps = (DefineGroups) opt.get();
				if(dgroups.getProgramGroupName() != null) {dGrps.setProgramGroupName(dgroups.getProgramGroupName());}
				if(dgroups.getActive_flag() != null) {
					dGrps.setActive_flag(dgroups.getActive_flag());};
				if(dgroups.getLoad_type() != null) {dGrps.setLoad_type(dgroups.getLoad_type());};
				repo.save(dGrps);
				return "Updated Successfully...";
			}
			return "No data exist for given id...";
			
		}catch(Exception e) {
			return e.getMessage();
		}

	}

	@Override
	public DefineGroups getByName(String program_group_name) {
	
		return repo.findByProgramGroupName(program_group_name);
	}


}
