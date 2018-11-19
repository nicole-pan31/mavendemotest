package com.aaa.mybatis.Dao;

import java.util.List;
import java.util.Map;

/**
 * className:Emp
 * discription:雇员数据访问接口
 * author:panjing
 * createTime:2018-11-05 15:46
 */
public interface Emp {
    /**
     * Map传参
     * 获取雇员列表
     * @return
     */
    List<Map> getList(Map map);

    /**
     * 获取雇员列表(choose when)
     * @param map
     * @return
     */
    List<Map> getListByParam(Map map);

    /**
     * 获取雇员列表（foreach）
     * @param list
     * @return
     */
    List<Map> getListByList(List list);
}
