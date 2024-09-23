package com.wiproworkspan.db1.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wiproworkspan.db1.entity.DefineGroupProgram;
import com.wiproworkspan.db1.entity.DefinePrograms;
import com.wiproworkspan.db1.repo.DefineProgramsRepo;

@Service
public class DefineProgramsServiceImpl implements DefineProgramsService {
    
    @Autowired
   private DefineProgramsRepo repo;

    
    
    @Override
    public List<DefinePrograms> getAllDefinePrograms() {
    	List<DefinePrograms> data = repo.findAll();
        // TODO Auto-generated method stub
		Collections.sort(data, Comparator.comparingInt(DefinePrograms::getProgram_id));

        return data;
    }

    @Override
    public String updateDefineGroup( DefinePrograms program) {
        try {
            Optional opt = repo.findById(program.getProgram_id());
            DefinePrograms dProgm;
            if(opt.isPresent()) {
                dProgm = (DefinePrograms) opt.get();
                
                if(program.getActive_flag() != null) {dProgm.setActive_flag(program.getActive_flag());}
                if(program.getConfig_id() != null) {dProgm.setConfig_id(program.getConfig_id());};
                if(program.getCut_off_date() != null){dProgm.setCut_off_date(program.getCut_off_date());}
                if(program.getExtract_method() != null) {dProgm.setExtract_method(program.getExtract_method());}
                if(program.getFinal_table() != null)   {dProgm.setFinal_table(program.getFinal_table());}
                if(program.getHistory_table() != null) {dProgm.setHistory_table(program.getHistory_table());}
                if(program.getInc_src_query() != null){dProgm.setInc_src_query(program.getInc_src_query());}
                if(program.getIncremental_column() != null){dProgm.setIncremental_column(program.getIncremental_column());}
                if(program.getIncremental_column_data_type() != null) {dProgm.setIncremental_column_data_type(program.getIncremental_column_data_type());}
                if(program.getIntegration_name() != null){dProgm.setIntegration_name(program.getIntegration_name());}
                if(program.getProgram_category() != null){dProgm.setProgram_category(program.getProgram_category());}
                if(program.getProgram_id() != 0){dProgm.setProgram_id(program.getProgram_id());}
                if(program.getProgram_name() != null){dProgm.setProgram_name(program.getProgram_name());}
                if(program.getPublish_query() != null){dProgm.setPublish_query(program.getPublish_query());}
                if(program.getSql_query() != null){dProgm.setSql_query(program.getSql_query());}
                if(program.getTemp_table() != null){dProgm.setTemp_table(program.getTemp_table());}
                
                repo.save(dProgm);
                return "Data Updated Successfully";
            }
            return "No data exist for given id...";
        }
        catch(Exception e) {
            return e.getMessage();
        }

    }

	@Override
	public int addDefinePrograms(DefinePrograms definePrograms) {
		try {
			int res = repo.insertData(definePrograms.getProgram_name(), definePrograms.getActive_flag(), definePrograms.getConfig_id(), definePrograms.getProgram_category() ,definePrograms.getExtract_method(), definePrograms.getPublish_query(), definePrograms.getSql_query(), definePrograms.getInc_src_query(), definePrograms.getTemp_table(), definePrograms.getFinal_table(), definePrograms.getHistory_table(), definePrograms.getCut_off_date(), definePrograms.getIncremental_column(), definePrograms.getIncremental_column_data_type(), definePrograms.getIntegration_name());
			return res;
		}catch(Exception e) {
            return 0;
		}
	}

    
    
}