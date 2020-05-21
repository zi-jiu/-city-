package com.zj.city.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * ClassName:ArticleInfo
 * Package:com.zj.city.domain
 * Description:
 *
 * @Date:2020/5/16 7:23
 * @Author:zijiu@1008611
 */
public class ArticleInfo implements Serializable {

    private Integer id;
    private String title;  //文章标题
    private String content;  //文章内容
    private String contentText; //文章的简介
    private Integer viewCount;   //浏览次数
    private Date updateTime;    //更新时间
    private Integer status;          //文章的状态(1.正常 2.回收站)
    private String userId;   //作者
    private Integer cityId;  //地址分类
    private Integer typeId;  //内容分类

    private ArticleCollectInfo articleCollectInfo;
    private ArticlePhotoInfo articlePhotoInfo;
    private TypeInfo typeInfo;
    private CityTypeInfo cityTypeInfo;
    private UserInfo userInfo;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getContentText() {
        return contentText;
    }

    public void setContentText(String contentText) {
        this.contentText = contentText;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public ArticleCollectInfo getArticleCollectInfo() {
        return articleCollectInfo;
    }

    public void setArticleCollectInfo(ArticleCollectInfo articleCollectInfo) {
        this.articleCollectInfo = articleCollectInfo;
    }

    public ArticlePhotoInfo getArticlePhotoInfo() {
        return articlePhotoInfo;
    }

    public void setArticlePhotoInfo(ArticlePhotoInfo articlePhotoInfo) {
        this.articlePhotoInfo = articlePhotoInfo;
    }

    public TypeInfo getTypeInfo() {
        return typeInfo;
    }

    public void setTypeInfo(TypeInfo typeInfo) {
        this.typeInfo = typeInfo;
    }

    public CityTypeInfo getCityTypeInfo() {
        return cityTypeInfo;
    }

    public void setCityTypeInfo(CityTypeInfo cityTypeInfo) {
        this.cityTypeInfo = cityTypeInfo;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}
