package com.aaa.mybatis.until;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * className:SqlSessionFactoryUntil
 * discription:
 * author:panjing
 * createTime:2018-11-03 16:35
 */

public class SqlSessionFactoryUntil {
    //私有空构造，保证其他地方不能实例化对象         单例
    private SqlSessionFactoryUntil(){};
    //私有静态
    private static SqlSessionFactory sqlSessionFactory;
    //使用静态快
    static{
        //使用mybatis提供的Resources类读取主配值wenjian

        InputStream resourceAsStream = null;
        try {
            resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //创建SqlSessionFactoryBuilder
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
    }
    //提供一个对外调用的方法，返回SqlSession
    public static SqlSession createSqlSession(){

        return sqlSessionFactory.openSession();
    }
}
