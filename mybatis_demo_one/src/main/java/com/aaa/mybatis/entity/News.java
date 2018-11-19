package com.aaa.mybatis.entity;

import java.util.Date;

/**
 * className:NewsDao
 * discription:
 * author:panjing
 * createTime:2018-11-06 08:13
 */

public class News {
    private Integer newsId;
    private String title;
    private  String content;
    private Integer  typeId;
    private Date addTime;

    private NewType newType;

    public NewType getNewType() {
        return newType;
    }

    public void setNewType(NewType newType) {
        this.newType = newType;
    }



    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer  getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer  typeId) {
        this.typeId = typeId;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}
