package com.zj.city.service.city_type_info;

import com.zj.city.dao.city_type_info.CityTypeInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:CityTypeInfoServiceImpl
 * Package:com.zj.city.service.city_type_info
 * Description:
 *
 * @Date:2020/5/13 6:58
 * @Author:zijiu@1008611
 */
@Service
public class CityTypeInfoServiceImpl implements CityTypeInfoService {

    @Autowired
    private CityTypeInfoDao cityTypeInfoDao;


    @Override
    public List findAll() {
        List list=cityTypeInfoDao.findAll();
        return list;
    }

    @Override
    public List findAllByViewCount() {
        List list=cityTypeInfoDao.findAllByViewCount();
        return list;
    }
}
