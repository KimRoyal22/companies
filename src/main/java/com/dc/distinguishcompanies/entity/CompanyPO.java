package com.dc.distinguishcompanies.entity;

import java.io.Serializable;

/**
 * 公司实体类
 */
public class CompanyPO implements Serializable {

    //公司名称
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
