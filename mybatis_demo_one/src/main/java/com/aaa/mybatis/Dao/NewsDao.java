package com.aaa.mybatis.Dao;

import com.aaa.mybatis.entity.News;

import java.util.List;

/**
 * className:NewsDao
 * discription:
 * author:panjing
 * createTime:2018-11-06 08:13
 */
public interface NewsDao {
    /**
     * 获取新闻表
     * @return
     */
    List<News> getList();

    /**
     * 添加新闻
     * @param news
     * @return
     */
    int addNews(News news);

    /**
     * 根据Id删除
     * @param newsId
     * @return
     */
    int deleteNews(int newsId);

    /**
     * 根据Id查询
     * @param newsId
     * @return
     */
    News getById(int newsId);

    /**
     * 更新
     * @param news
     * @return
     */
    int upDate(News news);

    /**
     * 多对一
     * @return
     */
    List<News> manyToOne();
}
