package com.wiproworkspan.db1.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wiproworkspan.db1.entity.SchProgExec;

@Repository
public interface SchProgExecRepo extends JpaRepository<SchProgExec, Integer>{
	
	@Query(value="select execution_id,\r\n"
			+ "						program_execution_id,\r\n"
			+ "						program_name,\r\n"
			+ "						start_date,\r\n"
			+ "						end_date,\r\n"
			+ "						datediff('minute',start_date,end_date)||' Minutes '||round(abs((datediff('minute',start_date,end_date)-(datediff('second',start_date,end_date)/60))*60))||' Seconds' total_execution_Time,\r\n"
			+ "						decode(status,'C','Completed','E','Failed','R','Running') status,\r\n"
			+ "						message \r\n"
			+ "					from XXWS_SCHEDULE_PROGRAM_EXECUTIONS xspe,\r\n"
			+ "						XXWS_PROGRAMS xp\r\n"
			+ "					where xp.program_id=xspe.program_id\r\n"
			+ "					AND   xspe.program_id= :prog_id\r\n"
			+ "					order by start_date desc",nativeQuery=true)
	
	 List<Object[]> getSchProgExec(@Param("prog_id") int prog_id );

}

