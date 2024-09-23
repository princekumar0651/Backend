package com.wiproworkspan.db1.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wiproworkspan.db1.entity.DefinePrograms;

@Repository
public interface MJobsRepo2 extends JpaRepository<DefinePrograms, Integer>{

	@Query(value="SELECT xp.program_id,xp.program_name,xpgi.execution_sequence,'' program_execution_id,'Not Started' status,'' start_date,'' end_date,'' next_scheduled_run_date,'' message FROM XXWS_PROGRAMS xp,XXWS_PROGRAM_GROUPS xpg,XXWS_PROGRAM_GROUPING xpgi WHERE xp.program_id = xpgi.program_id AND xpgi.program_group_id = xpg.program_group_id AND xpgi.program_group_id = :groupId AND nvl(xpgi.active_flag,'N')='Y' ORDER BY xpgi.execution_sequence",nativeQuery=true)
	List<Object[]> programDetailQuery(@Param("groupId") int groupId);
}

//xpgi.program_group_id = \"\"\"+str(groupId)+\"\"\" AND