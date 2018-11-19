package com.aaa.mybatis.entity;

import java.util.List;

/**
 * className:Dept
 * discription:
 * author:panjing
 * createTime:2018-11-03 16:09
 */

public class Dept {
    private int  deptNO;
    private  String dname;
    private  String loc;


    //员工的集合属性

    private List<Emp> empList;

    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }




    public int getDeptNO() {
        return deptNO;
    }

    public void setDeptNO(int deptNO) {
        this.deptNO = deptNO;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}
