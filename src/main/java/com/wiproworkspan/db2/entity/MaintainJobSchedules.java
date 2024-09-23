package com.wiproworkspan.db2.entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="xxws_job_schedules")
public class MaintainJobSchedules {
	
	@Id
	private int schedule_id;
	private String schedule_name;
	private int job_id;
	private String active_flag;
	private Timestamp schedule_start_date;
	private Timestamp schedule_end_date;
	private String schedule_type;
	private int resubmit_interval;
	private String resubmit_interval_unit_code;
	private String resubmit_time;
	private Timestamp next_scheduled_run_date;
	private String hold_flag;
	private Timestamp creation_date;
	private String created_by;
	private Timestamp last_update_date;
	private String last_updated_by;
	
	public MaintainJobSchedules() {
		super();
		
	}

	public MaintainJobSchedules(int schedule_id, String schedule_name, int job_id, String active_flag,
			Timestamp schedule_start_date, Timestamp schedule_end_date, String schedule_type, int resubmit_interval,
			String resubmit_interval_unit_code, String resubmit_time, Timestamp next_scheduled_run_date,
			String hold_flag, Timestamp creation_date, String created_by, Timestamp last_update_date,
			String last_updated_by) {
		super();
		this.schedule_id = schedule_id;
		this.schedule_name = schedule_name;
		this.job_id = job_id;
		this.active_flag = active_flag;
		this.schedule_start_date = schedule_start_date;
		this.schedule_end_date = schedule_end_date;
		this.schedule_type = schedule_type;
		this.resubmit_interval = resubmit_interval;
		this.resubmit_interval_unit_code = resubmit_interval_unit_code;
		this.resubmit_time = resubmit_time;
		this.next_scheduled_run_date = next_scheduled_run_date;
		this.hold_flag = hold_flag;
		this.creation_date = creation_date;
		this.created_by = created_by;
		this.last_update_date = last_update_date;
		this.last_updated_by = last_updated_by;
	}

	public int getSchedule_id() {
		return schedule_id;
	}

	public void setSchedule_id(int schedule_id) {
		this.schedule_id = schedule_id;
	}

	public String getSchedule_name() {
		return schedule_name;
	}

	public void setSchedule_name(String schedule_name) {
		this.schedule_name = schedule_name;
	}

	public int getJob_id() {
		return job_id;
	}

	public void setJob_id(int job_id) {
		this.job_id = job_id;
	}

	public String getActive_flag() {
		return active_flag;
	}

	public void setActive_flag(String active_flag) {
		this.active_flag = active_flag;
	}

	public Timestamp getSchedule_start_date() {
		return schedule_start_date;
	}

	public void setSchedule_start_date(Timestamp schedule_start_date) {
		this.schedule_start_date = schedule_start_date;
	}

	public Timestamp getSchedule_end_date() {
		return schedule_end_date;
	}

	public void setSchedule_end_date(Timestamp schedule_end_date) {
		this.schedule_end_date = schedule_end_date;
	}

	public String getSchedule_type() {
		return schedule_type;
	}

	public void setSchedule_type(String schedule_type) {
		this.schedule_type = schedule_type;
	}

	public int getResubmit_interval() {
		return resubmit_interval;
	}

	public void setResubmit_interval(int resubmit_interval) {
		this.resubmit_interval = resubmit_interval;
	}

	public String getResubmit_interval_unit_code() {
		return resubmit_interval_unit_code;
	}

	public void setResubmit_interval_unit_code(String resubmit_interval_unit_code) {
		this.resubmit_interval_unit_code = resubmit_interval_unit_code;
	}

	public String getResumbit_time() {
		return resubmit_time;
	}

	public void setResumbit_time(String resumbit_time) {
		this.resubmit_time = resumbit_time;
	}

	public Timestamp getNext_scheduled_run_date() {
		return next_scheduled_run_date;
	}

	public void setNext_scheduled_run_date(Timestamp next_scheduled_run_date) {
		this.next_scheduled_run_date = next_scheduled_run_date;
	}

	public String getHold_flag() {
		return hold_flag;
	}

	public void setHold_flag(String hold_flag) {
		this.hold_flag = hold_flag;
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
	
	
	
	
}
