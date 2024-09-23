package com.wiproworkspan.db2.service;

import java.util.ArrayList;
import java.util.List;

public class MonitorJobsDTO {

private int schedule_id;
private String scheduleName;
private Integer executionId;
private String executionStatus;
private String executionStartDate;
private String executionEndDate;
private String nextExecutionDate;
private List<MonitorDTO> subRows;

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


// Constructor
public MonitorJobsDTO() {
subRows = new ArrayList<>();
}
public void addSubRow(MonitorDTO subRow1) {
subRows.add(subRow1);
}
public List<MonitorDTO> getSubRows() {
return subRows;
}
public void setSubRows(List<MonitorDTO> subRows) {
this.subRows = subRows;
}
public int getSchedule_id() {
return schedule_id;
}
public void setSchedule_id(int schedule_id) {
this.schedule_id = schedule_id;
}
public String getNextExecutionDate() {
return nextExecutionDate;
}
public void setNextExecutionDate(String nextExecutionDate) {
this.nextExecutionDate = nextExecutionDate;
}

}
