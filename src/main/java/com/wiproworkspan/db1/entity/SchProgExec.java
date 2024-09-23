package com.wiproworkspan.db1.entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="XXWS_SCHEDULE_PROGRAM_EXECUTIONS")
public class SchProgExec {

	@Id
	private int Program_execution_id;
	
	private int Execution_id;
	private int Program_id;
	private Timestamp Start_date;
	private Timestamp End_date;
	private String Incremental_low;
	private String High_value;
	private String Status;
	private String Message;
	public SchProgExec() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SchProgExec(int program_execution_id, int execution_id, int program_id, Timestamp start_date,
			Timestamp end_date, String incremental_low, String high_value, String status, String message) {
		super();
		Program_execution_id = program_execution_id;
		Execution_id = execution_id;
		Program_id = program_id;
		Start_date = start_date;
		End_date = end_date;
		Incremental_low = incremental_low;
		High_value = high_value;
		Status = status;
		Message = message;
	}
	public int getProgram_execution_id() {
		return Program_execution_id;
	}
	public void setProgram_execution_id(int program_execution_id) {
		Program_execution_id = program_execution_id;
	}
	public int getExecution_id() {
		return Execution_id;
	}
	public void setExecution_id(int execution_id) {
		Execution_id = execution_id;
	}
	public int getProgram_id() {
		return Program_id;
	}
	public void setProgram_id(int program_id) {
		Program_id = program_id;
	}
	public Timestamp getStart_date() {
		return Start_date;
	}
	public void setStart_date(Timestamp start_date) {
		Start_date = start_date;
	}
	public Timestamp getEnd_date() {
		return End_date;
	}
	public void setEnd_date(Timestamp end_date) {
		End_date = end_date;
	}
	public String getIncremental_low() {
		return Incremental_low;
	}
	public void setIncremental_low(String incremental_low) {
		Incremental_low = incremental_low;
	}
	public String getHigh_value() {
		return High_value;
	}
	public void setHigh_value(String high_value) {
		High_value = high_value;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	
	
	
	
}
