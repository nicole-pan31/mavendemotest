package com.aaa.ssm.service;

import com.aaa.ssm.dao.EmpDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * className:EmpServiceImpl
 * discription:
 * author:panjing
 * createTime:2018-11-07 15:16
 */
@Service
@Transactional //加上事务后如果有异常，整个事务回滚
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpDao empDao;
    @Override
    public List<Map> getPage(Map map) {

        int pageNo = map.get("pageNo") == null ? 1 : Integer.valueOf(map.get("pageNo") + "");
        int pageSize =  map.get("pageSize") == null ? 10 : Integer.valueOf(map.get("pageSize") + "");
         map.put("start",(pageNo-1)*pageSize);
         map.put("end",pageNo*pageSize+1);
        return empDao.getPage(map);
    }

    @Override
    public int getPageCount(Map map) {
        return empDao.getPageCount(map);
    }

    @Override
    public List<Map> getById(Map map) {
        int id= Integer.valueOf(map.get("empNo") + "");
        System.out.println(id);
        map.put("aa",id);

        return empDao.getById(map);

    }

    @Override
    public int insert(Map map) {
        int insert = empDao.insert(map);
//        System.out.println(1/0);
        System.out.println("返回ID:"+map.get("empNo"));
        System.out.println("士大夫更健康");
        return  insert;
    }

    @Override
    public int updata(Map map) {
        System.out.println("更新service："+map);
        return empDao.updata(map);
    }

    @Override
    public int delete(Map map) {
        return empDao.delete(map);
    }
}
