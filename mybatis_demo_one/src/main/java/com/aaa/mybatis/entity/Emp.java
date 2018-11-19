package com.aaa.mybatis.entity;

/**
 * className:Emp
 * discription:
 * author:panjing
 * createTime:2018-11-05 15:47
 */

public class Emp {
    private int empNo;
    private String ename;
    private  String job;
    private  double salary;


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getComm() {
        return comm;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    private  double comm;

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
