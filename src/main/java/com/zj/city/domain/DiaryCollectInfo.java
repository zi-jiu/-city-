package com.zj.city.domain;

import java.io.Serializable;

/**
 * ClassName:DiatyCollectInfo
 * Package:com.zj.city.domain
 * Description:
 *
 * @Date:2020/5/11 16:59
 * @Author:zijiu@1008611
 */
public class DiaryCollectInfo implements Serializable {
    private Integer id;
    private String uId;   //访客id
    private Integer dId;   //文章id
    private Integer collectStatus;  //收藏状态
    private Integer goodStatus; //点赞状态

    @Override
    public String toString() {
        return "DiaryCollectInfo{" +
                "id=" + id +
                ", uId=" + uId +
                ", dId=" + dId +
                ", collectStatus=" + collectStatus +
                ", goodStatus=" + goodStatus +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public Integer getCollectStatus() {
        return collectStatus;
    }

    public void setCollectStatus(Integer collectStatus) {
        this.collectStatus = collectStatus;
    }

    public Integer getGoodStatus() {
        return goodStatus;
    }

    public void setGoodStatus(Integer goodStatus) {
        this.goodStatus = goodStatus;
    }
}
