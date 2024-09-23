package com.wiproworkspan.db1.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.wiproworkspan.db1.entity.SchExecHist;

public interface SchExecHistRepo extends JpaRepository<SchExecHist, Integer>{

	@Query(value="select execution_id,\r\n"
			+ "							xpg.PROGRAM_GROUP_NAME,\r\n"
			+ "							decode(xpg.load_type,'I','Incremental','F','Full Load') load_type,\r\n"
			+ "							to_char(execution_start_date,'DD-MM-YYYY HH24:MI:SS') start_date,\r\n"
			+ "							to_char(execution_end_date,'DD-MM-YYYY HH24:MI:SS') end_date,\r\n"
			+ "							datediff('minute',execution_start_date,execution_end_date)||' Minutes '||round(abs((datediff('minute',execution_start_date,execution_end_date)-(datediff('second',execution_start_date,execution_end_date)/60))*60))||' Seconds' total_execution_Time,\r\n"
			+ "							execution_status,\r\n"
			+ "							execution_message \r\n"
			+ "						from \r\n"
			+ "							XXWS_PROGRAM_GROUPS xpg,\r\n"
			+ "							xxws_schedule_execution_history xseh\r\n"
			+ "						where xseh.group_id=xpg.program_group_id\r\n"
			+ "						AND   xseh.schedule_id= :schedule_id\r\n"
			+ "						order by 4 desc" ,nativeQuery = true)
	List<Object[]> findAllExecHist(@Param("schedule_id") int schedule_id );
}
