package com.wiproworkspan.db1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="XXWS_PROGRAM_GROUPS")
public class DefineGroups {
	
	@Id
	private Integer program_group_id;
	
	@Column(name = "program_group_name")
	private String programGroupName;
	
	private String load_type;
	
	private String active_flag;

	public DefineGroups() {
		super();
		
	}

	public DefineGroups(Integer program_group_id, String programGroupName, String load_type, String active_flag) {
		super();
		this.program_group_id = program_group_id;
		this.programGroupName = programGroupName;
		this.load_type = load_type;
		this.active_flag = active_flag;
	}

	public Integer getProgram_groupId() {
		return program_group_id;
	}

	public void setProgram_groupId(Integer program_groupId) {
		this.program_group_id = program_groupId;
	}

	public String getProgramGroupName() {
		return programGroupName;
	}

	public void setProgramGroupName(String programGroupName) {
		this.programGroupName = programGroupName;
	}

	public String getLoad_type() {
		return load_type;
	}

	public void setLoad_type(String load_type) {
		this.load_type = load_type;
	}

	public String getActive_flag() {
		return active_flag;
	}

	public void setActive_flag(String active_flag) {
		this.active_flag = active_flag;
	}

	
}