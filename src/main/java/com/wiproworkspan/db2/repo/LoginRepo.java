package com.wiproworkspan.db2.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wiproworkspan.db2.entity.Login;


@Repository

public interface LoginRepo extends JpaRepository<Login, Integer>{
	
}
