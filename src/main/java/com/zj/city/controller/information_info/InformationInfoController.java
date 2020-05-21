package com.zj.city.controller.information_info;

import com.zj.city.domain.InformationInfo;
import com.zj.city.service.information_info.InformationInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * ClassName:InformationInfoController
 * Package:com.zj.city.controller.information_info
 * Description:
 *
 * @Date:2020/5/13 8:50
 * @Author:zijiu@1008611
 */
@Controller
@RequestMapping("inform")
public class InformationInfoController {


    @Autowired
    private InformationInfoService informationInfoService;


    //按城市分类查询所有官方信息（没有删除的）
    @GetMapping(value = "findAllByCityType")
    @ResponseBody
    public List<InformationInfo> findAllByCityType(ModelMap map, HttpServletRequest request){
        System.out.println(request.getParameter("id"));
        Integer cityTypeId = Integer.valueOf(request.getParameter("id"));
        List<InformationInfo> list = informationInfoService.findAllByCityType(cityTypeId);
        return list;
    }

    //按分类查询所有官方信息（没有删除的）
    @GetMapping(value = "findAllByTypeId")
    @ResponseBody
    public List<InformationInfo> findAllByTypeId(ModelMap map, HttpServletRequest request){
        Integer typeId = Integer.valueOf(request.getParameter("typeId"));
        Integer cityTypeId = Integer.valueOf(request.getParameter("cityTypeId"));
        List<InformationInfo> list = informationInfoService.findAllByTypeId(cityTypeId,typeId);
        return list;
    }

    //根据id查询官方信息（没有删除的）
    @PostMapping(value = "findAllById")
    @ResponseBody
    public List<InformationInfo> findAllById(ModelMap map, HttpServletRequest request){
        System.out.println(request.getParameter("id"));
        Integer id = Integer.valueOf(request.getParameter("id"));
        List<InformationInfo> list = informationInfoService.findAllById(id);
        return list;
    }






}
