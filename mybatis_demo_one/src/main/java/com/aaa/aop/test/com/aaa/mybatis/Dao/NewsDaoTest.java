package com.aaa.aop.test.com.aaa.mybatis.Dao;

import com.aaa.mybatis.Dao.NewsDao;
import com.aaa.mybatis.entity.News;
import com.aaa.mybatis.until.SqlSessionFactoryUntil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class NewsDaoTest {

    @Test
    public void getList() {
        SqlSession sqlSession =null;
        sqlSession = SqlSessionFactoryUntil.createSqlSession();
        NewsDao newsDao = sqlSession.getMapper(NewsDao.class);
        List<News> list = newsDao.getList();
        for (News news : list) {
            System.out.println("新闻编号:"+news.getNewsId()+"新闻标题："+news.getTitle()+"新闻内容："+news.getContent()+"添加时间："+news.getAddTime());
        }
    }

    @Test
    public void addNews() {
        SqlSession sqlSession =null;
        sqlSession = SqlSessionFactoryUntil.createSqlSession();
        NewsDao newsDao = sqlSession.getMapper(NewsDao.class);

        News news=new News() ;
        news.setNewsId(9);
        news.setTitle("十九大");
        news.setContent("方针政策");
        news.setTypeId(2);
        int result = newsDao.addNews(news);
        sqlSession.commit();
        if (result >0) {
            System.out.println("成功");
        }else {
            System.out.println("失败");
        }
    }

    @Test
    public void deleteNews() {

        SqlSession sqlSession =null;
        sqlSession = SqlSessionFactoryUntil.createSqlSession();
        NewsDao newsDao = sqlSession.getMapper(NewsDao.class);
        int result = newsDao.deleteNews(8);
        sqlSession.commit();
        if (result >0) {
            System.out.println("成功");
        }else {
            System.out.println("失败");
        }

    }

    @Test
    public void   upDate() {

        SqlSession sqlSession =null;
        sqlSession = SqlSessionFactoryUntil.createSqlSession();
        NewsDao newsDao = sqlSession.getMapper(NewsDao.class);
        News news = newsDao.getById(9);

        news.setTitle("十九大1");
        news.setContent("方针政策1");

        int result = newsDao.upDate(news);
        sqlSession.commit();
        if (result >0) {
            System.out.println("成功");
        }else {
            System.out.println("失败");
        }

    }
@Test
    public void testManyToOne(){
    SqlSession sqlSession =null;
    sqlSession = SqlSessionFactoryUntil.createSqlSession();
    NewsDao newsDao = sqlSession.getMapper(NewsDao.class);
    List<News> news = newsDao.manyToOne();
    if (news != null&&news.size()>0) {
        for (News n :
                news) {
            System.out.println("新闻标题："+n.getTitle()+",内容："+n.getContent()
            +",新闻类型："+n.getNewType().getTypeName());

        }

    }
}

}