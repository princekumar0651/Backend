package com.wiproworkspan.db2.entity;

import java.sql.Timestamp;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="xxws_schedule_execution_history")
public class MonitorJobs2 {

	@Id
	private int execution_id;
	
	private int schedule_id;
	private Timestamp execution_start_date;
	private Timestamp execution_end_date;
	private String execution_status;
	private String execution_message;
	private Timestamp creation_date;
	private String created_by;
	private Timestamp last_update_date;
	private String last_updated_by;
	private char trial941;
	public MonitorJobs2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MonitorJobs2(int execution_id, int schedule_id, Timestamp execution_start_date, Timestamp execution_end_date,
			String execution_status, String execution_message, Timestamp creation_date, String created_by,
			Timestamp last_update_date, String last_updated_by, char trial941) {
		super();
		this.execution_id = execution_id;
		this.schedule_id = schedule_id;
		this.execution_start_date = execution_start_date;
		this.execution_end_date = execution_end_date;
		this.execution_status = execution_status;
		this.execution_message = execution_message;
		this.creation_date = creation_date;
		this.created_by = created_by;
		this.last_update_date = last_update_date;
		this.last_updated_by = last_updated_by;
		this.trial941 = trial941;
	}
	public int getExecution_id() {
		return execution_id;
	}
	public void setExecution_id(int execution_id) {
		this.execution_id = execution_id;
	}
	public int getSchedule_id() {
		return schedule_id;
	}
	public void setSchedule_id(int schedule_id) {
		this.schedule_id = schedule_id;
	}
	public Timestamp getExecution_start_date() {
		return execution_start_date;
	}
	public void setExecution_start_date(Timestamp execution_start_date) {
		this.execution_start_date = execution_start_date;
	}
	public Timestamp getExecution_end_date() {
		return execution_end_date;
	}
	public void setExecution_end_date(Timestamp execution_end_date) {
		this.execution_end_date = execution_end_date;
	}
	public String getExecution_status() {
		return execution_status;
	}
	public void setExecution_status(String execution_status) {
		this.execution_status = execution_status;
	}
	public String getExecution_message() {
		return execution_message;
	}
	public void setExecution_message(String execution_message) {
		this.execution_message = execution_message;
	}
	public Timestamp getCreation_date() {
		return creation_date;
	}
	public void setCreation_date(Timestamp creation_date) {
		this.creation_date = creation_date;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public Timestamp getLast_update_date() {
		return last_update_date;
	}
	public void setLast_update_date(Timestamp last_update_date) {
		this.last_update_date = last_update_date;
	}
	public String getLast_updated_by() {
		return last_updated_by;
	}
	public void setLast_updated_by(String last_updated_by) {
		this.last_updated_by = last_updated_by;
	}
	public char getTrial941() {
		return trial941;
	}
	public void setTrial941(char trial941) {
		this.trial941 = trial941;
	}

	
	
}
