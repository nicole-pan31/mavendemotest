package com.aaa.mybatis.Dao;

import com.aaa.mybatis.entity.Dept;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * className:DeptDao
 * discription: 部门的 dao
 * author:panjing
 * createTime:2018-11-03 16:18
 */
public interface DeptDao {
    /**
     * 获取部门列表
     *
     * @return
     */
    @Select("select deptno as deptNO,dname,loc from dept")
    List<Dept> getList();

    /**
     * 部门添加
     * @param dept
     * @return
     */
    @Insert("insert into  dept values(seq_dept_id.nextval,#{dname},#{loc})")
    int add(Dept dept);

    /**
     * 根据部门Id查询
     * @param deptNO
     * @return
     */
    @Select("select deptno as deptNO,dname,loc from dept where deptno=#{deptNO}")
    Dept getById(int deptNO);

    /**
     * 更新
     * @param dept
     * @return
     */
    @Update("update dept set dname=#{dname},loc=#{loc} where deptno=#{deptNO}")
    int update(Dept dept);

    /**
     * 删除
     * @param deptId
     * @return
     */
    @Delete(" delete from dept where deptno=#{deptId}")
    int delete (int deptId);

    /**
     * mybatis 高级映射一对多
     * @return
     */
    List<Dept> oneToMany();
}
