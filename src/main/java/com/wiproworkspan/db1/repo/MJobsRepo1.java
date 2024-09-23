 package com.wiproworkspan.db1.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.wiproworkspan.db1.entity.DefinePrograms;

public interface MJobsRepo1 extends JpaRepository<DefinePrograms, Integer>{

@Query(value="SELECT xp.program_id,\r\n"
+ " xp.program_name,\r\n"
+ " xpgi.execution_sequence,\r\n"
+ " nvl(to_char(xspe.program_execution_id),'') program_execution_id,\r\n"
+ " decode(xspe.status,'C','Completed','R','Running','E','Failed','Not Started') status,\r\n"
+ " nvl(to_char(xspe.start_date,'YYYY-MM-DD HH24:MI:SS'),'') start_date,\r\n"
+ " nvl(to_char(xspe.end_date,'YYYY-MM-DD HH24:MI:SS'),'') end_date,\r\n"
+ " '' next_scheduled_run_date,\r\n"
+ " nvl(MESSAGE,'') message\r\n"
+ " FROM XXWS_PROGRAMS xp,\r\n"
+ " XXWS_PROGRAM_GROUPS xpg,\r\n"
+ " XXWS_PROGRAM_GROUPING xpgi,\r\n"
+ " XXWS_SCHEDULE_PROGRAM_EXECUTIONS xspe\r\n"
+ " WHERE xp.program_id = xpgi.program_id\r\n"
+ " AND xpgi.program_group_id = xpg.program_group_id\r\n"
+ " AND xpgi.program_group_id = :group_Id\r\n"
+ " AND xspe.program_id(+) = xp.program_id\r\n"
+ " AND xspe.execution_id(+) = :exec_id\r\n"
+ " ORDER BY xpgi.execution_sequence",nativeQuery=true)
List<Object[]> programDetailQuery1(@Param("group_Id") int group_Id, @Param("exec_id") int exec_id);


@Query(value="SELECT xp.program_id,\r\n"
+ " xp.program_name,\r\n"
+ " xpgi.execution_sequence,\r\n"
+ " '' program_execution_id,\r\n"
+ " 'Not Started' status,\r\n"
+ " '' start_date,\r\n"
+ " '' end_date,\r\n"
+ " '' next_scheduled_run_date,\r\n"
+ " '' message\r\n"
+ " FROM XXWS_PROGRAMS xp,\r\n"
+ " XXWS_PROGRAM_GROUPS xpg,\r\n"
+ " XXWS_PROGRAM_GROUPING xpgi\r\n"
+ " WHERE xp.program_id = xpgi.program_id\r\n"
+ " AND xpgi.program_group_id = xpg.program_group_id\r\n"
+ " AND xpgi.program_group_id = :group_Id \r\n"
+ " AND nvl(xpgi.active_flag,'N')='Y' \r\n"
+ " ORDER BY xpgi.execution_sequence", nativeQuery=true)
List<Object[]> programDetailQuery2(@Param("group_Id") int group_Id);
}
