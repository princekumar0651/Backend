package com.wiproworkspan.db2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wiproworkspan.db2.entity.MaintainJobDependency;

@Repository
public interface MaintainJobDependencyRepo extends JpaRepository<MaintainJobDependency, Integer> {
	

}
