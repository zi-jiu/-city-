package com.zj.city.domain;

import java.io.Serializable;

/**
 * ClassName:UserInfo
 * Package:com.zj.city.been
 * Description:
 *
 * @Date:2020/4/28 15:22
 * @Author:zijiu@1008611
 */

public class UserInfo implements Serializable {
    private String id;
    private String loginName;
    private String passWord;
    private String profilePhoto; //头像
    private String name; //昵称

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", loginName='" + loginName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", profilePhoto='" + profilePhoto + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
