package com.wiproworkspan.db2.entity;


import java.sql.Timestamp; 
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "xxws_jobs")
public class MaintainJobs {
    
    @Id
    private int job_id;
    private int reference_group_id;
    private String job_name;
    private Timestamp creation_date;
    private String created_by;
    private Timestamp last_update_date;
    private String last_updated_by;
    public MaintainJobs() {
        super();
        // TODO Auto-generated constructor stub
    }
    public MaintainJobs(int job_id, int reference_group_id, String job_name, Timestamp creation_date, String created_by,
            Timestamp last_update_date, String last_updated_by) {
        super();
        this.job_id = job_id;
        this.reference_group_id = reference_group_id;
        this.job_name = job_name;
        this.creation_date = creation_date;
        this.created_by = created_by;
        this.last_update_date = last_update_date;
        this.last_updated_by = last_updated_by;
    }
    public int getJob_id() {
        return job_id;
    }
    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }
    public int getReference_group_id() {
        return reference_group_id;
    }
    public void setReference_group_id(int reference_group_id) {
        this.reference_group_id = reference_group_id;
    }
    public String getJob_name() {
        return job_name;
    }
    public void setJob_name(String job_name) {
        this.job_name = job_name;
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
