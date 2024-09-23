package com.wiproworkspan.db1.service;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wiproworkspan.db1.entity.DefineGroupProgram;
import com.wiproworkspan.db1.repo.DefineGroupProgramRepo;
import com.wiproworkspan.db1.repo.JobSeqRepo;

@Service
public class DefineGroupProgramServiceImpl implements DefineGroupProgramService {

	@Autowired
	private DefineGroupProgramRepo repo;
	
	@Autowired
	private JobSeqRepo jrepo;

	@Override
	public List<DefineGroupProgram> getAllDGProgram() {
		
		return repo.findAll();
	}

	@Override
	public List<DefineGroupProgram> searchByProgramGroupId(int prog_grp_id) {
		List<DefineGroupProgram> data = repo.findByProgramGroupId(prog_grp_id);
		Collections.sort(data, Comparator.comparingInt(DefineGroupProgram::getExecution_sequence));
		
		return data;
	}

	@Override
	public String addGroupProgram(DefineGroupProgram DGPrg) {	
		try {
			repo.save(DGPrg);
			return "Added Successfully...!";
		}catch(Exception e) {
			return (e.getMessage());

	}
	}

	@Override
	public String updateGroupProgram(List<DefineGroupProgram> DGPrg) {
		try {
		for(DefineGroupProgram dgroup : DGPrg) {
			if(dgroup.getGrouping_id() != 0) {
				Optional op = repo.findById(dgroup.getGrouping_id());
				DefineGroupProgram dgrp;
				if(op.isPresent()) {
					dgrp = (DefineGroupProgram) op.get();
					if(dgroup.getExecution_sequence() != 0) {dgrp.setExecution_sequence(dgroup.getExecution_sequence());}
					if(dgroup.getProgram_group_id() != 0) {dgrp.setProgram_group_id(dgroup.getProgram_group_id());}
					if(dgroup.getActive_flag() != null) {dgrp.setActive_flag(dgroup.getActive_flag());
					repo.save(dgrp);
					
					}	
				}
			}else {
				dgroup.setGrouping_id(jrepo.getProgramGroupSeq());
				repo.save(dgroup);
			}
		}
	return "updated Succcessfully...!";
		}catch(Exception e) {
			return e.getMessage();
		}
	}

	@Override
	public int deleteGroupProgram(int prg_grp_id) {
		try {
			repo.deleteById(prg_grp_id);
			return 1;
		}catch(Exception e) {
			System.out.println("Error : " + e);
			
		}
		return 0;
	}
	

}
