package com.aaa.ssm.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * className:EmpDao
 * discription:
 * author:panjing
 * createTime:2018-11-07 14:59
 */
public interface EmpDao {
    /**
     * 获取雇员列表
     * @return
     */

    List<Map> getPage(Map map);

    /**
     * 分页总数量
     * @param map
     * @return
     */
    int getPageCount(Map map);

    /**
     * 根据id查找
     * @param map
     * @return
     */
    List<Map> getById(Map map);

    /**
     * 更新
     * @param map
     * @return
     */
    int insert(Map map);
    /**
     * 添加
     * @param map
     * @return
     */
    int updata(Map map);

    /**
     * 删除
     * @param map
     * @return
     */
    int delete(Map map);



}
