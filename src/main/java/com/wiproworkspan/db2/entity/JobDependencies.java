package com.wiproworkspan.db2.entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="xxws_job_dependencies")
public class JobDependencies {

	@Id
	private int dependency_id;
	
	private int schedule_id;
	private int parent_schedule_id;
	private Timestamp creation_date;
	private String created_by;
	private Timestamp last_update_date;
	private String last_updated_by;
	private char trial941;
	
	public JobDependencies() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JobDependencies(int dependency_id, int schedule_id, int parent_schedule_id, Timestamp creation_date,
			String created_by, Timestamp last_update_date, String last_updated_by, char trial941) {
		super();
		this.dependency_id = dependency_id;
		this.schedule_id = schedule_id;
		this.parent_schedule_id = parent_schedule_id;
		this.creation_date = creation_date;
		this.created_by = created_by;
		this.last_update_date = last_update_date;
		this.last_updated_by = last_updated_by;
		this.trial941 = trial941;
	}

	public int getDependency_id() {
		return dependency_id;
	}

	public void setDependency_id(int dependency_id) {
		this.dependency_id = dependency_id;
	}

	public int getSchedule_id() {
		return schedule_id;
	}

	public void setSchedule_id(int schedule_id) {
		this.schedule_id = schedule_id;
	}

	public int getParent_schedule_id() {
		return parent_schedule_id;
	}

	public void setParent_schedule_id(int parent_schedule_id) {
		this.parent_schedule_id = parent_schedule_id;
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
