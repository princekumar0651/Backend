package com.wiproworkspan.db2.service;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wiproworkspan.db1.repo.MJobsRepo1;
import com.wiproworkspan.db2.repo.RefreshRepo;

@Service
public class RefreshService {
	
	@Autowired
	private RefreshRepo MTRepo;
	
	@Autowired
	private MJobsRepo1 repo;

/******************************* FUNCTION ******************************************************************/	
	
	public List<MonitorJobsDTO> MonitorService(int sch_id) {

/******************************* SCHEDULE ******************************************************************/
		
	List<Object[]> schedules1=  MTRepo.findAllMaintainJobs(sch_id);
	List<MonitorJobsDTO> result = new ArrayList<>();
	
	for (Object[] sch1 : schedules1) {

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		List<Object[]> data1=MTRepo.findAllDependentJobs((Integer)sch1[0]);
		MonitorJobsDTO dto = new MonitorJobsDTO();
		
		dto.setSchedule_id((Integer)sch1[0]);
		dto.setScheduleName((String)sch1[1]);
		dto.setExecutionStatus("Scheduled");
//		System.out.println(sch1[3]);
//		dto.setExecutionStartDate((String)dateFormat2.format((String)sch1[3]));
		for (Object[] d1 : data1) {

			
			dto.setExecutionId((Integer)d1[0]);
			dto.setExecutionStartDate(dateFormat.format(d1[1]));
//			System.out.println("start date"+dto.getExecutionStartDate());
//			System.out.println("End date"+dto.getExecutionEndDate());
			dto.setExecutionEndDate(dateFormat.format(d1[2]));
			dto.setExecutionStatus((String)d1[3]);
		}
     	
     	if(dto.getExecutionStatus().equals("Scheduled") && sch1[2].toString().equals("Y")) {
     		dto.setExecutionStatus("On Hold");	
     	}
     	else if(dto.getExecutionStatus().equals("RUNNING")) {
     		dto.setExecutionStatus("Running");	
     	}
     	else if(dto.getExecutionStatus().equals("COMPLETED")) {
     		dto.setExecutionStatus("Completed");	
     	}
     	else if(dto.getExecutionStatus().equals("FAILED")) {
     		dto.setExecutionStatus("Failed");	
     	}
     	else if(dto.getExecutionStatus().equals("RERUN")) {
     		dto.setExecutionStatus("Marked for Re-Run");	
     	}

     	
/************************************ IF PROGRAMS *************************************************************/  
//       System.out.println("EXEC_ID"+ dto.getExecutionId());
       
         if (dto.getExecutionId()!=null) {
        	 
        	 System.out.println("Inside If Programs condition");
        	 Integer execId= dto.getExecutionId();
        	 Integer groupId = (Integer) sch1[4]; 
     	    List<Object[]> schedules3=repo.programDetailQuery1(groupId,execId);
     	    
     	    
     	   if (schedules3.isEmpty()) {
   	        
   	        MonitorDTO subRow1 = new MonitorDTO();
   		    System.out.println("No Programs Exist");
   			subRow1.setScheduleName("No Programs Exist");
   			dto.addSubRow(subRow1);
   			
	   	    } 
	   	    else
	   	    {
	   	    	
	   	    for (Object[] sch2 : schedules3)
	   	    {

	   		    MonitorDTO subRow1 = new MonitorDTO();
	   		    
	   		    Long longValue =(long)sch2[0] ;
	   		    int val = longValue.intValue();
	   		    subRow1.setProgram_id(val);
	   		    
	   			subRow1.setScheduleName((String)sch2[1]);
	   			
	   			Object schValue = sch2[3]; 
	   			if (schValue==null) {
	   			    subRow1.setExecutionId(null);
	   			}
	   			else
	   			{
	   				String schValueStr = (String) schValue;
	   			    try {
	   			        Integer executionId = Integer.parseInt(schValueStr);
	   			        subRow1.setExecutionId(executionId);
	   			    }
	   				catch (NumberFormatException e) {
		   		        System.err.println("Error parsing EXEC_ID as Integer: " + e.getMessage());
		   		    }
	   			}
	   	    
	   			
	   			subRow1.setExecutionStatus(sch2[4].toString());
	
	   			Object sch2Value = sch2[5]; 
	   			if (sch2Value==null ) {
	   			    subRow1.setExecutionStartDate(null);
	   			} 
	   		    else {
	   		    	try {
	   				subRow1.setExecutionStartDate((String)sch2[5]);
	   				}
	   		    	catch (NumberFormatException e) {
		   		        System.err.println("Error parsing EXEC_ID as Integer: " + e.getMessage());
		   		    }
	   			}
	   			
	   			Object sch2Val = sch2[6]; 
	   			if (sch2Val == null) {	 
	   			    subRow1.setExecutionEndDate(null);
	   			} 
	   		    else {
	   		    	try {
	   		    		subRow1.setExecutionEndDate((String)sch2[6]);
	   		    	}
	   		    	catch (NumberFormatException e) {
		   		        System.err.println("Error parsing EXEC_ID as Integer: " + e.getMessage());
		   		    }
	   			
	   			}
	   			
	   			Object sch2Values = sch2[7]; 
				if (sch2Values instanceof Character) {
				    Character chr1 = (Character) sch2Values;
				    String str1 = chr1.toString();
				    subRow1.setNextExecutionDate(str1);
				} else if (sch2Value instanceof String) {
				    String str2 = (String) sch2Value;
				    subRow1.setNextExecutionDate(str2);
				} 
			    else {
					subRow1.setNextExecutionDate((String)sch2[7]);
				}
	   			
	   			dto.addSubRow(subRow1);


	   	    }
	   	    }
         }
         
         
/************************************ ELSE PROGRAMS *************************************************************/ 
         else {
//        	 System.out.println("start date"+dto.getScheduleName());
// 			System.out.println("End date"+dto.getExecutionEndDate());
//        	    System.out.println("Inside Else Programs condition");
			    Integer groupId = (Integer) sch1[4]; 
			    List<Object[]> schedules2=repo.programDetailQuery2(groupId);
			
			    if (schedules2.isEmpty()) {
			        
			        MonitorDTO subRow1 = new MonitorDTO();
				    
					subRow1.setScheduleName("No Programs Exist");
					dto.addSubRow(subRow1);
			    } 
			    else
			    {
			    	
			    for (Object[] sch2 : schedules2)
			    {
				    MonitorDTO subRow1 = new MonitorDTO();
				    
				    Long longValue =(long)sch2[0] ;
				    int val = longValue.intValue();
				    subRow1.setProgram_id(val);
				    
					subRow1.setScheduleName((String)sch2[1]);
					
					Object schValue = sch2[3]; 
					if (schValue instanceof Character) {
					    subRow1.setExecutionId(null);
					}
					else
					{
						subRow1.setExecutionId((Integer)sch2[3]);
					}
					
					
					subRow1.setExecutionStatus((String)sch2[4]);
		
					Object sch2Value = sch2[5]; 
					if (sch2Value instanceof Character) {
					    Character chr1 = (Character) sch2Value;
					    String str1 = chr1.toString();
					    subRow1.setExecutionStartDate(str1);
					} else if (sch2Value instanceof String) {
					    String str2 = (String) sch2Value;
					    subRow1.setExecutionStartDate(str2);
					} 
				    else {
						subRow1.setExecutionStartDate((String)sch2[5]);
					}
					
					Object sch2Val = sch2[6]; 
					if (sch2Val instanceof Character) {
					    Character chr1 = (Character) sch2Val;
					    String str1 = chr1.toString();
					    subRow1.setExecutionEndDate(str1);
					} else if (sch2Value instanceof String) {
					    String str2 = (String) sch2Value;
					    subRow1.setExecutionEndDate(str2);
					} 
				    else {
						subRow1.setExecutionEndDate((String)sch2[6]);
					}
					
					Object sch2Values = sch2[7]; 
					if (sch2Values instanceof Character) {
					    Character chr1 = (Character) sch2Values;
					    String str1 = chr1.toString();
					    subRow1.setNextExecutionDate(str1);
					} else if (sch2Value instanceof String) {
					    String str2 = (String) sch2Value;
					    subRow1.setNextExecutionDate(str2);
					} 
				    else {
						subRow1.setNextExecutionDate((String)sch2[7]);
					}
		
					
					dto.addSubRow(subRow1);
			    }
			    }
         }
            System.out.println("start date"+dto.getExecutionStartDate());
			System.out.println("End date"+dto.getExecutionEndDate());
 /******************************************* END ELSE PROGRAMS **************************************************/
        
	    result.add(dto);
	}
	return result;
}
}
	


