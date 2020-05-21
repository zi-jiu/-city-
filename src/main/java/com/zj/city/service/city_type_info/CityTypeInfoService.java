package com.zj.city.service.city_type_info;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:CityTypeInfoService
 * Package:com.zj.city.service.city_type_info
 * Description:
 *
 * @Date:2020/5/13 6:58
 * @Author:zijiu@1008611
 */
public interface CityTypeInfoService {
    List findAll();

    List findAllByViewCount();
}
