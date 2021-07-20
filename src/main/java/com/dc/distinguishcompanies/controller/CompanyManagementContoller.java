package com.dc.distinguishcompanies.controller;

import com.dc.distinguishcompanies.entity.CompanyPO;
import com.dc.distinguishcompanies.service.CompanyManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyManagementContoller {

    @Autowired
    CompanyManagementService companyManagementService;

    @GetMapping("/companies")
    public List<CompanyPO> findAllCompanies(){
        return companyManagementService.findAllCompanies();
    }

}
