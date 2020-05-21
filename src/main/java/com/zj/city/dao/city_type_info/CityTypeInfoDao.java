package com.zj.city.dao.city_type_info;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName:CityTypeInfoDao
 * Package:com.zj.city.dao.city_type_info
 * Description:
 *
 * @Date:2020/5/13 7:07
 * @Author:zijiu@1008611
 */
@Mapper
public interface CityTypeInfoDao {

    List findAll();

    List findAllByViewCount();
}
