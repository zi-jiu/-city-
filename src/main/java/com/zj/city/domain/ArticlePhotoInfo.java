package com.zj.city.domain;

import java.io.Serializable;

/**
 * ClassName:ArticlePhotoInfo
 * Package:com.zj.city.domain
 * Description:
 *
 * @Date:2020/5/16 7:28
 * @Author:zijiu@1008611
 */
public class ArticlePhotoInfo implements Serializable {

    private Integer id;
    private Integer dId;
    private Integer uId;
    private String photo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }
}
