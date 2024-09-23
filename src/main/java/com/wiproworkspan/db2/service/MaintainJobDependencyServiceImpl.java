package com.wiproworkspan.db2.service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wiproworkspan.db1.repo.JobSeqRepo;
import com.wiproworkspan.db2.entity.MaintainJobDependency;
import com.wiproworkspan.db2.repo.MaintainJobDependencyRepo;

@Service
public class MaintainJobDependencyServiceImpl implements MaintainJobDependencyService {

	@Autowired
	MaintainJobDependencyRepo repo;
	
	@Autowired
	JobSeqRepo repoSeq;

	@Override
	public List<MaintainJobDependency> getAllMaintainJobDependency() {
		return repo.findAll();
	}

	@Override
	public String updateMaintainJobDependency(MaintainJobDependency mDep) {
		try {
			Optional op = repo.findById(mDep.getDependency_id());
			MaintainJobDependency mJobDep;
			if(op.isPresent()) {
				System.out.println();
				mJobDep = (MaintainJobDependency) op.get();
				if(mDep.getSchedule_id() != 0) {mJobDep.setSchedule_id(mDep.getSchedule_id());}
				if(mDep.getParent_schedule_id() != 0) {mJobDep.setParent_schedule_id(mDep.getParent_schedule_id());}
				if(mDep.getCreated_by() != null) {mJobDep.setCreated_by(mDep.getCreated_by());}
				if(mDep.getLast_updated_date() !=null) {mJobDep.setLast_updated_date(mDep.getLast_updated_date());}
				if(mDep.getLast_updated_by() != null) {mJobDep.setLast_updated_by(mDep.getLast_updated_by());}
				repo.save(mJobDep);
				return "Updated succeesfully ...!";
			}
			return "can't update false data...!"; 
			
		}
			
		catch(Exception e) {
			return e.getMessage();
		}
		
	}

	@Override
	public String addMaintainJobDependency(MaintainJobDependency mDep) {
		try {	
			mDep.setDependency_id(repoSeq.getNextSnowflakeSequenceValue());
			long currentTimeMillis = System.currentTimeMillis();
	        Timestamp currentTimestamp = new Timestamp(currentTimeMillis);
	        mDep.setCreation_date(currentTimestamp);
	        mDep.setLast_updated_date(currentTimestamp);
			repo.save(mDep);
			return "Added successfully...!";
		}catch(Exception e) {
			return e.getMessage();
		}
		 	
	}
	
	

}
