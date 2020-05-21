package com.zj.city.domain;

import java.io.Serializable;

/**
 * ClassName:CityTypeInfo
 * Package:com.zj.city.domain
 * Description:
 *
 * @Date:2020/5/5 12:37
 * @Author:zijiu@1008611
 */
public class CityTypeInfo implements Serializable {
    private Integer id;
    private String name;
    private Integer sort;
    private Integer viewCount;

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

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    @Override
    public String toString() {
        return "CityTypeInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sort=" + sort +
                ", viewCount=" + viewCount +
                '}';
    }
}
