package com.aaa.aop.test;

import com.aaa.mybatis.Dao.Emp;
import com.aaa.mybatis.until.SqlSessionFactoryUntil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class EmpTest {

    @Test
    public void getList() {
        SqlSession sqlSession=null;
        try {
           sqlSession = SqlSessionFactoryUntil.createSqlSession();
            Emp empDao = sqlSession.getMapper(Emp.class);
            /*配合动态sql使用
            Map paramMap= new HashMap();
            paramMap.put("job","CLERK");*/


            List<Map> list = empDao.getList(null);
            for (Map map:
                 list) {
                System.out.println("名称："+map.get("ENAME"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
    @Test
    public void getListByParam() {
        SqlSession sqlSession=null;

            sqlSession = SqlSessionFactoryUntil.createSqlSession();
            Emp empDao = sqlSession.getMapper(Emp.class);
            //配合动态sql使用
            Map paramMap= new HashMap();
            paramMap.put("empNo","7369");
            paramMap.put("job","CLERK");


            List<Map> list = empDao.getListByParam(paramMap);
            for (Map map:
                    list) {
                System.out.println("名称："+map.get("ENAME"));
            }

    }
    @Test
    public void getListByList() {
        SqlSession sqlSession=null;

        sqlSession = SqlSessionFactoryUntil.createSqlSession();
        Emp empDao = sqlSession.getMapper(Emp.class);
        //配合动态sql使用
        List paramList= new ArrayList();
       paramList.add(7369);
       paramList.add(7499);


        List<Map> list = empDao.getListByList(paramList);
        for (Map map:
                list) {
            System.out.println("名称："+map.get("ENAME"));
        }

    }
}