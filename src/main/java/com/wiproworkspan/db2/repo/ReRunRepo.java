package com.wiproworkspan.db2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wiproworkspan.db2.entity.MonitorJobs2;

@Repository
public interface ReRunRepo extends JpaRepository<MonitorJobs2, Integer>{

@Modifying
@Transactional
@Query(value="UPDATE xxws_schedule_execution_history SET execution_status = 'RERUN',last_update_date = CURRENT_TIMESTAMP, execution_message = null, last_updated_by = :username WHERE execution_id = :exec_id",nativeQuery=true)
void updateExecutionHistory(@Param("exec_id") int exec_id, @Param("username") String username);

// @Query(value="select * from xxws_schedule_execution_history where execution_id= :exec_id and created_by= :loggedUserName",nativeQuery=true)
// List<Object[]> updateExecutionHistory(@Param("exec_id") int exec_id, @Param("loggedUserName") String loggedUserName);
}
