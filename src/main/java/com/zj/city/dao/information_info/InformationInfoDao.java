package com.zj.city.dao.information_info;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName:InformationInfoDao
 * Package:com.zj.city.dao.information_info
 * Description:
 *
 * @Date:2020/5/13 9:05
 * @Author:zijiu@1008611
 */
@Mapper
public interface InformationInfoDao {


    List findAllByCityType(Integer cityTypeId);

    void updateCityViewCount(Integer cityTypeId);

    List findAllByTypeId(Integer cityTypeId,Integer typeId);

    List findAllById(Integer id);
}
