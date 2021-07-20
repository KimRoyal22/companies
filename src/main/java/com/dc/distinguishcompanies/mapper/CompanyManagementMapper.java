package com.dc.distinguishcompanies.mapper;

import com.dc.distinguishcompanies.entity.CompanyPO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CompanyManagementMapper {

    @Select("select name from company")
    public List<CompanyPO> selectAllCompanies();

}
