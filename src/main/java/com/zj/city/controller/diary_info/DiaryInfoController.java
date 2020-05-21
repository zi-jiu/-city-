package com.zj.city.controller.diary_info;

import com.zj.city.domain.DiaryInfo;
import com.zj.city.domain.Result;
import com.zj.city.domain.UserInfo;
import com.zj.city.exception.MyException;
import com.zj.city.service.diary_collect_info.DiaryCollectInfoService;
import com.zj.city.service.diary_info.DiaryInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * ClassName:DiaryInfoController
 * Package:com.zj.city.controller.diary_info
 * Description:
 *
 * @Date:2020/5/6 8:10
 * @Author:zijiu@1008611
 */
@Controller
@RequestMapping("diary")
public class DiaryInfoController {

    @Autowired
    private DiaryInfoService diaryInfoService;

    @Autowired
    private DiaryCollectInfoService diaryCollectInfoService;


    //查询所有已审核游记（没有删除的）
    @GetMapping(value = "findAll")
    @ResponseBody
    public List<DiaryInfo> findAll(){
        List<DiaryInfo> list = diaryInfoService.findAll();
        return list;
    }

    //查询未审核游记（没有删除的）
    @GetMapping(value = "findByStatusGfEx")
    @ResponseBody
    public List<DiaryInfo> findByStatusGfEx(){
        List<DiaryInfo> list = diaryInfoService.findByStatusGfEx();
        return list;
    }

    //查询userId用户的游记
    @GetMapping(value = "findByUserId")
    @ResponseBody
    public List<DiaryInfo> findByUserId(ModelMap map, HttpServletRequest request){
        UserInfo userInfo = (UserInfo) request.getSession().getAttribute("userInfo");
        String userId = userInfo.getId();
        List<DiaryInfo> list = diaryInfoService.findByUserId(userId);
        return list;
    }


    //根据游记id查询游记详情
    @GetMapping(value = "findById")
    @ResponseBody
    public DiaryInfo findById(ModelMap map, HttpServletRequest request,HttpSession session){
        String id = request.getParameter("id");
        UserInfo userInfo = (UserInfo) request.getSession().getAttribute("userInfo");
        String uId = userInfo.getId();
        DiaryInfo diaryInfo = diaryInfoService.findById(uId,id);
        if(diaryInfo==null){
            String dId = id;
            diaryCollectInfoService.add(dId,uId);
            diaryInfo = diaryInfoService.findById(uId,id);
        }
        return diaryInfo;
    }


    //新增游记
    @PostMapping(value = "add")
    @ResponseBody
    public Result add(DiaryInfo diaryInfo, HttpServletRequest request){
       if(diaryInfo.getTitle()==null || diaryInfo.getContent()==null){
            throw new MyException(0,"操作失败,您没有提交有效数据");
        }
        //System.out.println(request.getSession().getAttribute("userInfo").toString());
        UserInfo userInfo = (UserInfo) request.getSession().getAttribute("userInfo");
        diaryInfo.setUserId(userInfo.getId());
        diaryInfoService.add(diaryInfo);
        Result result = new Result();
        return result.success();
    }


    //修改游记
    @PutMapping(value = "update")
    @ResponseBody
    public Result update(DiaryInfo diaryInfo, HttpServletRequest request){
        if(diaryInfo.getId()==null || diaryInfo.getTitle()==null || diaryInfo.getContent()==null){
            throw new MyException(0,"操作失败,您没有提交有效数据");
        }
        //System.out.println(request.getSession().getAttribute("userInfo").toString());
        UserInfo userInfo = (UserInfo) request.getSession().getAttribute("userInfo");
        diaryInfo.setUserId(userInfo.getId());
        diaryInfoService.update(diaryInfo);
        Result result = new Result();
        return result.success();
    }




}
