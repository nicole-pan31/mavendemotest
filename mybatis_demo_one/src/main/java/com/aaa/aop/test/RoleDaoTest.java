package com.aaa.aop.test;

import com.aaa.mybatis.Dao.NewsDao;
import com.aaa.mybatis.Dao.RoleDao;
import com.aaa.mybatis.entity.Power;
import com.aaa.mybatis.entity.Role;
import com.aaa.mybatis.until.SqlSessionFactoryUntil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class RoleDaoTest {

    @Test
    public void manyTomany() {
        SqlSession sqlSession =null;
        sqlSession = SqlSessionFactoryUntil.createSqlSession();
        RoleDao roleDao = sqlSession.getMapper(RoleDao.class);
        List<Role> roles = roleDao.manyTomany();
        if(roles!=null&&roles.size()>0){
            for (Role r :
                    roles) {
                System.out.println("角色："+r.getName());
                List<Power> powerList = r.getPowerList();
                if(powerList!=null&&powerList.size()>0){
                    System.out.println("角色看到的权限："+powerList.size()+"个，分别为：");
                    for (Power p :
                            powerList) {

                        System.out.println("----权限名称："+p.getName()+",url:"+p.getUrl()+",父ID:"+p.getPid());

                    }

                }else {
                    System.out.println("该角色看不到任何权限");
                }

            }

        }

    }
}