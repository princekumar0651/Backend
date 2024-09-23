package com.wiproworkspan.db1.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wiproworkspan.db1.entity.DefineGroups;

import jakarta.transaction.Transactional;

@Repository
public interface DefineGroupsRepo extends JpaRepository<DefineGroups, Integer> {

	
	public DefineGroups findByProgramGroupName(String name);
	
	@Modifying
    @Transactional
    @Query(value = "insert into WS_CISCO_DB.WS_CISCO_FUND_STG.XXWS_PROGRAM_GROUPS (program_group_id, program_group_name,active_flag, load_type) values(WS_CISCO_FUND_STG.XXWS_PROGRAM_GROUPS_SEQ.nextval,:value1, :value2, :value3)", nativeQuery = true)
    public int insertData(@Param("value1") String value1, @Param("value2") String value2, @Param("value3") String value3);
}
