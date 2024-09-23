package com.wiproworkspan.db1.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wiproworkspan.db1.entity.DefineGroupProgram;
@Repository
public interface DefineGroupProgramRepo extends JpaRepository<DefineGroupProgram, Integer> {
	public List<DefineGroupProgram> findByProgramGroupId(int prog_grp_id);
}
