package com.dc.distinguishcompanies.service;

import com.dc.distinguishcompanies.entity.CompanyPO;
import com.dc.distinguishcompanies.mapper.CompanyManagementMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CompanyManagementService {

    @Resource
    CompanyManagementMapper companyManagementMapper;

    public List<CompanyPO> findAllCompanies() {
        return companyManagementMapper.selectAllCompanies();
    }
}
