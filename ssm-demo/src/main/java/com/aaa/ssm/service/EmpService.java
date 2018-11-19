package com.aaa.ssm.service;

import java.util.List;
import java.util.Map;

/**
 * className:EmpService
 * discription:
 * author:panjing
 * createTime:2018-11-07 15:10
 */
public interface EmpService {
    /**
     * 分页数据
     * @param map
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
