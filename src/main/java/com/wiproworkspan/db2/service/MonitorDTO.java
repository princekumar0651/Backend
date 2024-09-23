package com.wiproworkspan.db2.service;

public class MonitorDTO {

	private int program_id;
	private String scheduleName;
    private Integer executionId;
    private String executionStatus;
    private String executionStartDate;
    private String executionEndDate;
    private String nextExecutionDate;

	public MonitorDTO() {
		super();
		
	}
	
	public MonitorDTO(int program_id, String scheduleName, Integer executionId, String executionStatus,
			String executionStartDate, String executionEndDate, String nextExecutionDate) {
		super();
		this.program_id = program_id;
		this.scheduleName = scheduleName;
		this.executionId = executionId;
		this.executionStatus = executionStatus;
		this.executionStartDate = executionStartDate;
		this.executionEndDate = executionEndDate;
		this.nextExecutionDate = nextExecutionDate;
	}


	public int getProgram_id() {
		return program_id;
	}
	public void setProgram_id(int program_id) {
		this.program_id = program_id;
	}
	public String getScheduleName() {
		return scheduleName;
	}
	public void setScheduleName(String scheduleName) {
		this.scheduleName = scheduleName;
	}
	public Integer getExecutionId() {
		return executionId;
	}
	public void setExecutionId(Integer executionId) {
		this.executionId = executionId;
	}
	public String getExecutionStatus() {
		return executionStatus;
	}
	public void setExecutionStatus(String executionStatus) {
		this.executionStatus = executionStatus;
	}
	public String getExecutionStartDate() {
		return executionStartDate;
	}
	public void setExecutionStartDate(String executionStartDate) {
		this.executionStartDate = executionStartDate;
	}
	public String getExecutionEndDate() {
		return executionEndDate;
	}
	public void setExecutionEndDate(String executionEndDate) {
		this.executionEndDate = executionEndDate;
	}
	public String getNextExecutionDate() {
		return nextExecutionDate;
	}
	public void setNextExecutionDate(String nextExecutionDate) {
		this.nextExecutionDate = nextExecutionDate;
	}
	
}
