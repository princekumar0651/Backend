package com.wiproworkspan.db1.service;

import java.util.List; 

import org.springframework.stereotype.Service;

import com.wiproworkspan.db1.entity.DefineGroupProgram;

@Service
public interface DefineGroupProgramService {

	public List<DefineGroupProgram> getAllDGProgram();
	public List<DefineGroupProgram> searchByProgramGroupId(int prog_grp_id);
	public String addGroupProgram(DefineGroupProgram DGPrg);
	public String  updateGroupProgram(List<DefineGroupProgram> DGPrg);
	public int deleteGroupProgram(int prg_grp_id);
}
