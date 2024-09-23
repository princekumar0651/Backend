package com.wiproworkspan.db1.repo;

import java.sql.Timestamp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wiproworkspan.db1.entity.DefinePrograms;

import jakarta.transaction.Transactional;
@Repository
public interface DefineProgramsRepo extends JpaRepository<DefinePrograms, Integer> {
	@Modifying
    @Transactional
    @Query(value = "insert into WS_CISCO_DB.WS_CISCO_FUND_STG.XXWS_PROGRAMS (program_id, program_name,active_flag,config_id, program_category , extract_method , publish_query ,sql_query , inc_src_query, temp_table ,final_table, history_table,cut_off_date, incremental_column, incremental_column_data_type , integration_name) values(WS_CISCO_FUND_STG.XXWS_PROGRAMS_SEQ.nextval,:name, :flag, :c_id, :p_cat, :e_met, :p_que, :s_que, :inc_que, :t_table, :f_table, :h_table, :c_data, :inc_col, :inc_dataType, :int_name)", nativeQuery = true)
    public int insertData(@Param("name") String name, @Param("flag") String flag, @Param("c_id") int c_id,@Param("p_cat") String p_cat, @Param("e_met") String e_met, @Param("p_que") String p_que, @Param("s_que") String s_que, @Param("inc_que") String inc_que, @Param("t_table") String t_table,  @Param("f_table") String f_table,  @Param("h_table") String h_table, @Param("c_data") Timestamp timestamp, @Param("inc_col") String inc_col, @Param("inc_dataType") String inc_dataType, @Param("int_name") String int_name);

	

}
