package com.wiproworkspan.db1.entity;

import java.sql.Timestamp;

import org.springframework.boot.context.properties.ConfigurationProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="XXWS_PROGRAMS")
public class DefinePrograms {
    @Id
    private int program_id;
    
    private String program_name;
    private String active_flag;
    private Integer config_id;
    private String program_category;
    private String extract_method;
    private String publish_query;
    private String sql_query;
    private String inc_src_query;
    private String temp_table;
    private String final_table;
    private String history_table;
    private Timestamp cut_off_date;
    private String incremental_column;
    private String incremental_column_data_type;
    private String integration_name;
    
    
    public DefinePrograms() {
        super();
        // TODO Auto-generated constructor stub
    }


    public DefinePrograms(int program_id, String program_name, String active_flag, Integer config_id, String program_category,
            String extract_method, String publish_query, String sql_query, String inc_src_query, String temp_table,
            String final_table, String history_table, Timestamp cut_off_date, String incremental_column,
            String incremental_column_data_type, String integration_name) {
        super();
        this.program_id = program_id;
        this.program_name = program_name;
        this.active_flag = active_flag;
        this.config_id = config_id;
        this.program_category = program_category;
        this.extract_method = extract_method;
        this.publish_query = publish_query;
        this.sql_query = sql_query;
        this.inc_src_query = inc_src_query;
        this.temp_table = temp_table;
        this.final_table = final_table;
        this.history_table = history_table;
        this.cut_off_date = cut_off_date;
        this.incremental_column = incremental_column;
        this.incremental_column_data_type = incremental_column_data_type;
        this.integration_name = integration_name;
    }


    public int getProgram_id() {
        return program_id;
    }


    public void setProgram_id(int program_id) {
        this.program_id = program_id;
    }


    public String getProgram_name() {
        return program_name;
    }


    public void setProgram_name(String program_name) {
        this.program_name = program_name;
    }


    public String getActive_flag() {
        return active_flag;
    }


    public void setActive_flag(String active_flag) {
        this.active_flag = active_flag;
    }


    public Integer getConfig_id() {
        return config_id;
    }


    public void setConfig_id(Integer config_id) {
        this.config_id = config_id;
    }


    public String getProgram_category() {
        return program_category;
    }


    public void setProgram_category(String program_category) {
        this.program_category = program_category;
    }


    public String getExtract_method() {
        return extract_method;
    }


    public void setExtract_method(String extract_method) {
        this.extract_method = extract_method;
    }


    public String getPublish_query() {
        return publish_query;
    }


    public void setPublish_query(String publish_query) {
        this.publish_query = publish_query;
    }


    public String getSql_query() {
        return sql_query;
    }


    public void setSql_query(String sql_query) {
        this.sql_query = sql_query;
    }


    public String getInc_src_query() {
        return inc_src_query;
    }


    public void setInc_src_query(String inc_src_query) {
        this.inc_src_query = inc_src_query;
    }


    public String getTemp_table() {
        return temp_table;
    }


    public void setTemp_table(String temp_table) {
        this.temp_table = temp_table;
    }


    public String getFinal_table() {
        return final_table;
    }


    public void setFinal_table(String final_table) {
        this.final_table = final_table;
    }


    public String getHistory_table() {
        return history_table;
    }


    public void setHistory_table(String history_table) {
        this.history_table = history_table;
    }


    public Timestamp getCut_off_date() {
        return cut_off_date;
    }


    public void setCut_off_date(Timestamp cut_off_date) {
        this.cut_off_date = cut_off_date;
    }


    public String getIncremental_column() {
        return incremental_column;
    }


    public void setIncremental_column(String incremental_column) {
        this.incremental_column = incremental_column;
    }


    public String getIncremental_column_data_type() {
        return incremental_column_data_type;
    }


    public void setIncremental_column_data_type(String incremental_column_data_type) {
        this.incremental_column_data_type = incremental_column_data_type;
    }


    public String getIntegration_name() {
        return integration_name;
    }


    public void setIntegration_name(String integration_name) {
        this.integration_name = integration_name;
    }
    
    
    
}