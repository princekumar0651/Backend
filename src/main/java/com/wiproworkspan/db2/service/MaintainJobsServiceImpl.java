package com.wiproworkspan.db2.service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wiproworkspan.db1.repo.JobSeqRepo;
import com.wiproworkspan.db2.entity.MaintainJobs;
import com.wiproworkspan.db2.repo.MaintainJobsRepo;

@Service
public class MaintainJobsServiceImpl implements MaintainJobsService{
	
	
	@Autowired
	private MaintainJobsRepo repo;
	
	@Autowired
	private JobSeqRepo repoSeq;
	
	
	@Override
	public List<MaintainJobs> getJobs() {
		// TODO Auto-generated method stub
		return repo.findAll();
		}


	@Override
	public String updateMaintainJobs(MaintainJobs mJobs) {
		try {
			Optional op = repo.findById(mJobs.getJob_id());
			MaintainJobs maintainJobs;
			if(op.isPresent()) {
				maintainJobs = (MaintainJobs)op.get();
				if(mJobs.getJob_name() != null) {maintainJobs.setJob_name(mJobs.getJob_name());}
				if(mJobs.getReference_group_id() !=0) {maintainJobs.setReference_group_id(mJobs.getReference_group_id());}
				System.out.println(mJobs.getReference_group_id());
				repo.save(mJobs);
				return "successfully Updated....";
				
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return "can't update... try with correct data..";
	}


	@Override
	public String addMaintain(MaintainJobs mJobs) {
		try {
			mJobs.setJob_id(repoSeq.getNextSnowflakeSequenceValue());
			Timestamp tmp = new Timestamp(System.currentTimeMillis());
			mJobs.setCreation_date(tmp);	
			mJobs.setLast_update_date(tmp);
			
			repo.save(mJobs);
			return "Added Successfully...!";
		}catch(Exception e) {
			System.out.println(e);
		}
		return "Can't add false data..!";
	}
}
