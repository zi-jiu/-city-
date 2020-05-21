package com.zj.city.controller.city_type_info;

import com.zj.city.domain.CityTypeInfo;
import com.zj.city.domain.Result;
import com.zj.city.service.city_type_info.CityTypeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * ClassName:CityTypeInfoController
 * Package:com.zj.city.controller.city_type_info
 * Description:
 *
 * @Date:2020/5/13 6:52
 * @Author:zijiu@1008611
 */
@Controller
@RequestMapping("city_type")
public class CityTypeInfoController {

    @Autowired
    private CityTypeInfoService cityTypeInfoService;


    //查询所有城市分类
    @GetMapping("findAll")
    @ResponseBody
    public List<CityTypeInfo> selectAll(){
        List list = cityTypeInfoService.findAll();
        return list;
    }

    //按热度查询所有城市分类
    @GetMapping("findAllByViewCount")
    @ResponseBody
    public List<CityTypeInfo> findAllByViewCount(){
        List list = cityTypeInfoService.findAllByViewCount();
        return list;
    }

}
