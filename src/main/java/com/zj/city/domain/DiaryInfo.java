package com.zj.city.domain;

import java.util.Date;

/**
 * ClassName:DiaryInfo
 * Package:com.zj.city.domain
 * Description:
 *
 * @Date:2020/5/6 8:13
 * @Author:zijiu@1008611
 */
public class DiaryInfo {
    private Integer id;
    private String title;  //文章标题
    private String content;  //文章内容
    private String contentText; //文章的简介
    private Integer viewCount;   //浏览次数
    private Date updateTime;    //更新时间
    private Integer status;          //文章的状态(1.正常 2.回收站)
    private String address;  //地址
    private String userId;   //作者
    private Integer statusGf;          //文章的审核状态(1.审核通过 2.审核失败 3.未审核)


    private DiaryCollectInfo diaryCollectInfo;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getStatusGf() {
        return statusGf;
    }

    public void setStatusGf(Integer statusGf) {
        this.statusGf = statusGf;
    }


    public DiaryCollectInfo getDiaryCollectInfo() {
        return diaryCollectInfo;
    }

    public void setDiaryCollectInfo(DiaryCollectInfo diaryCollectInfo) {
        this.diaryCollectInfo = diaryCollectInfo;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }


}
