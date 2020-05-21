package com.zj.city.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * ClassName:InformationInfo
 * Package:com.zj.city.domain
 * Description:
 *
 * @Date:2020/5/13 7:21
 * @Author:zijiu@1008611
 */
public class InformationInfo implements Serializable {
    //官方信息
    private Integer id;
    private String name;  //信息名字
    private String content;  //文章内容
    private String contentText; //文章的简介
    private String cover;        //文章的封面
    private Integer viewCount;   //浏览次数
    private Date updateTime;    //更新时间
    private Integer status;          //文章的状态(1.正常 2.回收站)
    private Integer typeId;
    private Integer cityTypeId;

    public Integer getCityTypeId() {
        return cityTypeId;
    }

    public void setCityTypeId(Integer cityTypeId) {
        this.cityTypeId = cityTypeId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
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

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    @Override
    public String toString() {
        return "InformationInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", contentText='" + contentText + '\'' +
                ", cover='" + cover + '\'' +
                ", viewCount=" + viewCount +
                ", updateTime=" + updateTime +
                ", status=" + status +
                ", typeId=" + typeId +
                ", cityTypeId=" + cityTypeId +
                '}';
    }
}
