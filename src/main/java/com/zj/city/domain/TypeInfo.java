package com.zj.city.domain;

import java.io.Serializable;

/**
 * ClassName:TypeInfo
 * Package:com.zj.city.domain
 * Description:
 *
 * @Date:2020/5/5 12:35
 * @Author:zijiu@1008611
 */
public class TypeInfo implements Serializable {
    //官方信息的美食，文化，风景等分类
    private Integer id;
    private String name;
    private Integer sort;

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

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "TypeInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sort='" + sort + '\'' +
                '}';
    }
}
