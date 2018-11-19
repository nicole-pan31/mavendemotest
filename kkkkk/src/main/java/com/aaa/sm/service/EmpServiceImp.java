package com.aaa.sm.service;

import com.aaa.sm.dao.EmpDao;
import com.aaa.sm.entity.Emp;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * className:EmpServiceImp
 * discription:
 * author:panjing
 * createTime:2018-11-09 16:15
 */
@Service
@Transactional //事务管理
public class EmpServiceImp implements EmpService{
    @Autowired
    private EmpDao empDao;

    @Override
    public List<Emp> getList(Map map) {
        map.put("sort",map.get("sort")==null?"empno":map.get("sort"));

        map.put("order",map.get("order")==null?"asc":map.get("order"));
        return empDao.getList(map);
    }

    @Override
    public int add(Emp emp) {

        return empDao.add(emp);
    }



    @Override
    public int delete(int empNo) {
        return empDao.delete(empNo);

    }

    @Override
    public List<Emp> getById(int empNo) {
        return empDao.getById(empNo);
    }

    @Override
    public int update(Map map) {
        return empDao.update(map);
    }


    @Override
    public List<Emp> getProListBydeptNo(int deptNo) {
        Map map = new HashMap();
         map.put("deptNo",deptNo);
         //调用了根据存储过程获取列表方法之后
         empDao.getProListBydeptNo(map);
         //调用返回值结果
        List<Emp> csrEmp = (List<Emp>) map.get("csrEmp");
        return csrEmp;
    }

}
