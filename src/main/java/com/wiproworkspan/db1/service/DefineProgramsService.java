package com.wiproworkspan.db1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wiproworkspan.db1.entity.DefinePrograms;


@Service
public interface DefineProgramsService {
    
    public List<DefinePrograms> getAllDefinePrograms();
    
    public String updateDefineGroup(DefinePrograms program);
    
    public int addDefinePrograms(DefinePrograms definePrograms);
    
}

