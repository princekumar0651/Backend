package com.wiproworkspan.db1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="xxws_program_grouping")
public class DefineGroupProgram {

	@Id
	private int grouping_id;
	private int execution_sequence;
	@Column(name="program_group_id")
	private int programGroupId;
	private int program_id;
	private String active_flag;
	public DefineGroupProgram() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DefineGroupProgram(int grouping_id, int execution_sequence, int programGroupId, int program_id,
			String active_flag) {
		super();
		this.grouping_id = grouping_id;
		this.execution_sequence = execution_sequence;
		this.programGroupId = programGroupId;
		this.program_id = program_id;
		this.active_flag = active_flag;
	}
	public int getGrouping_id() {
		return grouping_id;
	}
	public void setGrouping_id(int grouping_id) {
		this.grouping_id = grouping_id;
	}
	public int getExecution_sequence() {
		return execution_sequence;
	}
	public void setExecution_sequence(int execution_sequence) {
		this.execution_sequence = execution_sequence;
	}
	public int getProgram_group_id() {
		return programGroupId;
	}
	public void setProgram_group_id(int programGroupId) {
		this.programGroupId = programGroupId;
	}
	public int getProgram_id() {
		return program_id;
	}
	public void setProgram_id(int program_id) {
		this.program_id = program_id;
	}
	public String getActive_flag() {
		return active_flag;
	}
	public void setActive_flag(String active_flag) {
		this.active_flag = active_flag;
	}
	
	
	
}
