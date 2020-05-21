package com.zj.city.controller.diary_collect_info;


import com.zj.city.domain.DiaryCollectInfo;
import com.zj.city.domain.Result;
import com.zj.city.domain.UserInfo;
import com.zj.city.service.diary_collect_info.DiaryCollectInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * ClassName:DiaryCollectInfoController
 * Package:com.zj.city.controller.diary_collect_info
 * Description:
 *
 * @Date:2020/5/11 17:10
 * @Author:zijiu@1008611
 */
@Controller
@RequestMapping("diarycol")
public class DiaryCollectInfoController {
    @Autowired
    private DiaryCollectInfoService diaryCollectInfoService;

    //用户更新游记的收藏或不收藏状态
    @RequestMapping(value = "updateCollectStatus")
    @ResponseBody
    public Result updateCollectStaues(DiaryCollectInfo diatyCollectInfo, HttpServletRequest request){
        String dId = request.getParameter("dId");
        UserInfo userInfo = (UserInfo) request.getSession().getAttribute("userInfo");
        diatyCollectInfo.setuId(userInfo.getId());
        String uId = diatyCollectInfo.getuId();
        Integer collectStatus = Integer.valueOf(request.getParameter("collectStatus"));
        DiaryCollectInfo diaryCollectInfo =  diaryCollectInfoService.selectCollectStatus(dId,uId);
        //如果从来没点过收藏
        if(diaryCollectInfo==null){
            System.out.println("进来了");
            diaryCollectInfoService.insertCollectStatus(dId,uId,collectStatus);
        }else{
            diaryCollectInfoService.updateCollectStatus(dId,uId,collectStatus);
        }
        Result result = new Result();
        return result.success();
    }

    //用户更新游记的点赞或不点赞状态
    @RequestMapping(value = "updateGoodStatus")
    @ResponseBody
    public Result updateGoodStatus(DiaryCollectInfo diatyCollectInfo, HttpServletRequest request){
        String dId = request.getParameter("dId");
        UserInfo userInfo = (UserInfo) request.getSession().getAttribute("userInfo");
        diatyCollectInfo.setuId(userInfo.getId());
        String uId = diatyCollectInfo.getuId();
        Integer goodStatus = Integer.valueOf(request.getParameter("goodStatus"));
        //查看是否从来没点过收藏或赞
        DiaryCollectInfo diaryCollectInfo =  diaryCollectInfoService.selectCollectStatus(dId,uId);
        //如果从来没点过收藏或赞
        if(diaryCollectInfo==null){
            diaryCollectInfoService.insertGoodStatus(dId,uId,goodStatus);
        }else{
            System.out.println("进来了");
            diaryCollectInfoService.updateGoodStatus(dId,uId,goodStatus);
        }
        Result result = new Result();
        return result.success();
    }

}
