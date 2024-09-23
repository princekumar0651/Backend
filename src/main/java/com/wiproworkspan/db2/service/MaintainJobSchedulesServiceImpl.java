package com.wiproworkspan.db2.service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wiproworkspan.db1.repo.JobSeqRepo;
import com.wiproworkspan.db2.entity.MaintainJobSchedules;
import com.wiproworkspan.db2.repo.MaintainJobSchedulesRepo;

@Service
public class MaintainJobSchedulesServiceImpl implements MaintainJobSchedulesService {

	@Autowired
	private MaintainJobSchedulesRepo repo;
	
	@Autowired
	private JobSeqRepo repoSeq;
	
	@Override
	public List<MaintainJobSchedules> getAllJobSchedules() {
		
		return repo.findAll();
	}

	@Override
	public String updateMaintainJobSchedule(MaintainJobSchedules mJobSch) {
		try {
			Optional op = repo.findById(mJobSch.getSchedule_id());
			MaintainJobSchedules mJSch;
			if(op.isPresent()) {
				mJSch = (MaintainJobSchedules) op.get();
				if(mJobSch.getSchedule_name() != null) {mJSch.setSchedule_name(mJobSch.getSchedule_name());}
				if(mJobSch.getJob_id() != 0) {mJSch.setJob_id(mJobSch.getJob_id());}
				if(mJobSch.getActive_flag() != null) {mJSch.setActive_flag(mJobSch.getActive_flag());}
				if(mJobSch.getSchedule_start_date() != null) {mJSch.setSchedule_start_date(mJobSch.getSchedule_start_date());}
				if(mJobSch.getSchedule_end_date() != null) {mJSch.setSchedule_end_date(mJobSch.getSchedule_end_date());}
				if(mJobSch.getSchedule_type() != null) {mJSch.setSchedule_type(mJobSch.getSchedule_type());}
				if(mJobSch.getResubmit_interval() != 0) {mJSch.setResubmit_interval(mJobSch.getResubmit_interval());}
				if(mJobSch.getResubmit_interval_unit_code() != null) {mJSch.setResubmit_interval_unit_code(mJobSch.getResubmit_interval_unit_code());}
				if(mJobSch.getResumbit_time() != null) {mJSch.setResumbit_time(mJobSch.getResumbit_time());}
				if(mJobSch.getNext_scheduled_run_date() != null) {mJSch.setNext_scheduled_run_date(mJobSch.getNext_scheduled_run_date());}
				if(mJobSch.getHold_flag() != null) {mJSch.setHold_flag(mJobSch.getHold_flag());}
				if(mJobSch.getCreation_date() != null) {mJSch.setCreation_date(mJobSch.getCreation_date());}
				if(mJobSch.getCreated_by() != null) {mJSch.setCreated_by(mJobSch.getCreated_by());}
				if(mJobSch.getLast_update_date() != null) {mJSch.setLast_update_date(mJobSch.getLast_update_date());}
				if(mJobSch.getLast_updated_by() != null) {mJSch.setLast_updated_by(mJobSch.getLast_updated_by());}
				repo.save(mJSch);
				return "Updated Successfully....!";
			}
			return "can't update false data...!";
		}catch(Exception e) {
			return e.getMessage();
		}
		
	}
	
	@Override
	public String updateHoldFlagForAllEntities(boolean type) {
		 try {
			 String holdFlag = type ? "Y" : "N";
			 List<MaintainJobSchedules> entities = repo.findAll();
		        for (MaintainJobSchedules entity : entities) {
		        	 
		        	
		            entity.setHold_flag(holdFlag);
		        	
		        }
		        repo.saveAll(entities);
		        return "Hold flag updated successfully!";
	        } catch (Exception e) {
	            
	            return "Error occurred while updating hold flag: ";
	        }
		
	}
	

	@Override
	public String addMaintainJobSchedule(MaintainJobSchedules mJobSch) {
		try {
			long currentTimeMillis = System.currentTimeMillis();
	        Timestamp currentTimestamp = new Timestamp(currentTimeMillis);
			mJobSch.setSchedule_id(repoSeq.getNextSnowflakeSequenceValue());
			mJobSch.setCreation_date(currentTimestamp);
			mJobSch.setLast_update_date(currentTimestamp);
			
			repo.save(mJobSch);
			return "Added successfully...!";
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return "can't add false data...!";
	}

}
