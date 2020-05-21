package com.zj.city.controller.article_collect_info;

import com.zj.city.domain.ArticleCollectInfo;
import com.zj.city.domain.Result;
import com.zj.city.domain.UserInfo;
import com.zj.city.service.article_collect_info.ArticleCollectInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * ClassName:ArticleCollectInfoController
 * Package:com.zj.city.controller.article_collect_info
 * Description:
 *
 * @Date:2020/5/19 7:55
 * @Author:zijiu@1008611
 */
@Controller
@RequestMapping("art.collect")
public class ArticleCollectInfoController {

    @Autowired
    private ArticleCollectInfoService articleCollectInfoService;

    //用户更新动态的收藏或不收藏状态
    @RequestMapping(value = "updateCollectStatus")
    @ResponseBody
    public Result updateCollectStaues(ArticleCollectInfo articleCollectInfo, HttpServletRequest request){
        String dId = request.getParameter("dId");
        UserInfo userInfo = (UserInfo) request.getSession().getAttribute("userInfo");
        articleCollectInfo.setuId(userInfo.getId());
        String uId = articleCollectInfo.getuId();
        Integer collectStatus = Integer.valueOf(request.getParameter("collectStatus"));
        ArticleCollectInfo articleCollectInfo1 =  articleCollectInfoService.selectCollectStatus(dId,uId);
        //如果从来没点过收藏
        if(articleCollectInfo1==null){
            System.out.println("进来了");
            articleCollectInfoService.insertCollectStatus(dId,uId,collectStatus);
        }else{
            articleCollectInfoService.updateCollectStatus(dId,uId,collectStatus);
        }
        Result result = new Result();
        return result.success();
    }


    //用户更新动态的收藏或不收藏状态
    @RequestMapping(value = "updateGoodStatues")
    @ResponseBody
    public Result updateGoodStatues(ArticleCollectInfo articleCollectInfo, HttpServletRequest request){
        String dId = request.getParameter("dId");
        UserInfo userInfo = (UserInfo) request.getSession().getAttribute("userInfo");
        articleCollectInfo.setuId(userInfo.getId());
        String uId = articleCollectInfo.getuId();
        Integer goodStatus = Integer.valueOf(request.getParameter("goodStatus"));
        ArticleCollectInfo articleCollectInfo1 =  articleCollectInfoService.selectGoodStatues(dId,uId);
        //如果从来没点过收藏
        if(articleCollectInfo1==null){
            System.out.println("进来了");
            articleCollectInfoService.insertGoodStatues(dId,uId,goodStatus);
        }else{
            articleCollectInfoService.updateGoodStatues(dId,uId,goodStatus);
        }
        Result result = new Result();
        return result.success();
    }
}
