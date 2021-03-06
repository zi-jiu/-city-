package com.zj.city.domain;

/**
 * @author 不若为止
 * @version 1.0
 * @class Person
 * @package com.wzhi.tableserver.pojo
 * @desc 个人信息实体类
 * @copyright weizhi
 * @date 2018/09/04
 */

public class Person {
    private Integer id;
    private String username;
    private String zone;
    private String email;
    private String sex;
    private String phone;
    private String createTime;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getZone() {
        return zone;
    }
    public void setZone(String zone) {
        this.zone = zone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getCreateTime() {
        return createTime;
    }
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


}

