package com.aaa.aop.test;

import com.aaa.mybatis.Dao.DeptDao;
import com.aaa.mybatis.entity.Dept;
import com.aaa.mybatis.entity.Emp;
import com.aaa.mybatis.until.SqlSessionFactoryUntil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * className:DeptDaoTest
 * discription:
 * author:panjing
 * createTime:2018-11-03 16:50
 */

public class DeptDaoTest {
    @Test
    public  void test2() {
        //添加
        SqlSession sqlSession=null;
        try {
            //使用工具类获取SqlSession

            sqlSession = SqlSessionFactoryUntil.createSqlSession();

            //利用SqlSession提供的方法获取接口的实现类   getMapper 使用接口和配置文集实例化接口的实现类
            DeptDao deptDao = sqlSession.getMapper(DeptDao.class);

            Dept dept = new Dept();

            dept.setDname("开发22");
            dept.setLoc("60楼");
           int result = deptDao.add(dept);

            sqlSession.commit();
            if (result >0) {
                System.out.println("成功");
            }else {
                System.out.println("失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }


    }
    @Test
    public void  test1(){
        //查询部门列表
        SqlSession sqlSession=null;
        try {
            //使用工具类获取SqlSession

            sqlSession = SqlSessionFactoryUntil.createSqlSession();

            //利用SqlSession提供的方法获取接口的实现类   getMapper 使用接口和配置文集实例化接口的实现类
            DeptDao deptDao = sqlSession.getMapper(DeptDao.class);

            List<Dept> list =deptDao.getList();
            for (Dept d :
                    list) {
                System.out.println(""+d.getDeptNO()+""+d.getDname()+""+d.getLoc());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           sqlSession.close();
        }

    }
@Test
    public void test(){
        //更新
        SqlSession sqlSession=null;
        try {
            //使用工具类获取SqlSession

            sqlSession = SqlSessionFactoryUntil.createSqlSession();

            //利用SqlSession提供的方法获取接口的实现类   getMapper 使用接口和配置文集实例化接口的实现类
            DeptDao deptDao = sqlSession.getMapper(DeptDao.class);

            Dept dept = deptDao.getById(60);

            dept.setDname("开发66");
            dept.setLoc("66楼");
            int result = deptDao.update(dept);

            sqlSession.commit();
            if (result >0) {
                System.out.println("成功");
            }else {
                System.out.println("失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
    @Test
    public void test3(){
        //删除
        SqlSession sqlSession=null;
        try {
            //使用工具类获取SqlSession

            sqlSession = SqlSessionFactoryUntil.createSqlSession();

            //利用SqlSession提供的方法获取接口的实现类   getMapper 使用接口和配置文集实例化接口的实现类
            DeptDao deptDao = sqlSession.getMapper(DeptDao.class);

            int result = deptDao.delete(60);


            sqlSession.commit();
            if (result >0) {
                System.out.println("成功");
            }else {
                System.out.println("失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
    @Test
    public void testOneToMany(){

        SqlSession sqlSession=null;
        //使用工具类获取SqlSession

        sqlSession = SqlSessionFactoryUntil.createSqlSession();

        //利用SqlSession提供的方法获取接口的实现类   getMapper 使用接口和配置文集实例化接口的实现类
        DeptDao deptDao = sqlSession.getMapper(DeptDao.class);
        List<Dept> deptList = deptDao.oneToMany();
        if(deptList!=null&&deptList.size()>0){
            for (Dept d :
                    deptList) {
                System.out.println("部门："+d.getDname()+",位置:"+d.getLoc());
                List<Emp> empList = d.getEmpList();
                if (empList!=null&&empList.size()>0){
                    System.out.println("该部门员工如下：");
                    for (Emp emp:
                         empList) {
                        System.out.println("姓名 ："+emp.getEname()+",工资"+emp.getSalary()+
                                ",奖金"+emp.getComm());
                    }
                }else {
                    System.out.println("该部门没有员工！！！");
                }
                System.out.println("-----------------------------");
            }
        }
    }
}
