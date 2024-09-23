package com.wiproworkspan.db1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MaintainJobSeq {
	
	@Id
	private int jobId;

	public MaintainJobSeq() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MaintainJobSeq(int jobId) {
		super();
		this.jobId = jobId;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	
	

}
