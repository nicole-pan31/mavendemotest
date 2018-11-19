package com.aaa.sm.dao;

import com.aaa.sm.entity.Emp;

import java.util.List;
import java.util.Map;

/**
 * className:EmpDao
 * discription:
 * author:panjing
 * createTime:2018-11-09 15:50
 */

public interface EmpDao {

    /**
     * 员工列表方法
     * @param map
     * @return
     */
    List<Emp> getList(Map map);
    /**
     * 添加
     * @param emp
     * @return
     */
    int add(Emp emp);

    /**
     * 删除
     * @param empNo
     * @return
     */
    int delete(int empNo);
    /**
     * 员工列表方法
     * @param map
     * @return
     */
    List<Emp> getById(int map);
    /**
     * 更新
     * @param map
     * @return
     */
    int update(Map map);

    /**
     * 调用存储过程
     * @param map
     * @return
     */
    List<Emp> getProListBydeptNo(Map map);

}
