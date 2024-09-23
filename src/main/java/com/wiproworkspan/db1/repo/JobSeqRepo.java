package com.wiproworkspan.db1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.wiproworkspan.db1.entity.MaintainJobSeq;


public interface JobSeqRepo extends JpaRepository<MaintainJobSeq, Integer> {
	
	
    @Query(value = "select ws_cisco_fund_stg.xxws_jobId_seq.nextVal", nativeQuery = true)
	public int getNextSnowflakeSequenceValue();
    
    @Query(value ="select ws_cisco_fund_stg.xxws_program_groups_seq.nextval" , nativeQuery = true)
    public int getProgramGroupSeq();
 

}
