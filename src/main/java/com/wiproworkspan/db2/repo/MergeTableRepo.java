package com.wiproworkspan.db2.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wiproworkspan.db2.entity.MaintainJobs;

@Repository
public interface MergeTableRepo extends JpaRepository<MaintainJobs, Integer>{

	@Query(value="SELECT DISTINCT xjs.schedule_id,xjs.schedule_name,hold_flag, IFNULL(xjs.next_scheduled_run_date,CONCAT(DATE(xjs.schedule_start_date), ' ', TIME(resubmit_time))) AS next_scheduled_run_date,xj.reference_group_id FROM xxws_job_schedules xjs, xxws_jobs xj WHERE xjs.job_id = xj.job_id order by xjs.schedule_name", nativeQuery = true)
	List<Object[]> findAllMaintainJobs();
	
	@Query(value="select execution_id,execution_start_date,execution_end_date,execution_status,execution_message from xxws_schedule_execution_history y where y.schedule_id= :sch_id", nativeQuery = true)
	List<Object[]> findAllDependentJobs(@Param("sch_id") int sch_id);
}
