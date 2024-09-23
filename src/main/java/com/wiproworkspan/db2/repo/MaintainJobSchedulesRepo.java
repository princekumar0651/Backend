package com.wiproworkspan.db2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wiproworkspan.db2.entity.MaintainJobSchedules;

@Repository
public interface MaintainJobSchedulesRepo extends JpaRepository<MaintainJobSchedules, Integer> {

	
}
