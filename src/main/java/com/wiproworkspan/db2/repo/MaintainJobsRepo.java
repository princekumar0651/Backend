package com.wiproworkspan.db2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.wiproworkspan.db2.entity.MaintainJobs;

import jakarta.transaction.Transactional;

public interface MaintainJobsRepo extends JpaRepository<MaintainJobs, Integer> {

	
	
}
