package com.zj.city.controller.user_info;

import com.zj.city.domain.Result;
import com.zj.city.domain.UserInfo;
import com.zj.city.exception.MyException;
import com.zj.city.service.user_info.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * ClassName:UserInfoController
 * Package:com.zj.city.controller.user_info
 * Description:
 *
 * @Date:2020/4/28 15:29
 * @Author:zijiu@1008611
 */
@Controller
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;

    //登录---跳转登录页面:
    @RequestMapping("/admin/index.controller")
    public String index(){
        return "admin/login";
    }

    //登录---跳转登录页面:
    @RequestMapping("login.controller")
    public String login(){
        return "admin/login";
    }

    @PostMapping(value = "/admin/login")
    @ResponseBody
    public String login1(String name,String password){
        System.out.println(name);
        System.out.println(password);
        return "abc";
    }

    @PostMapping(value = "/admin/login2")
    @ResponseBody
    public String login2(@RequestBody UserInfo userInfo){
        System.out.println("asdasdsadsadsd");
        System.out.println(userInfo.getLoginName());
        System.out.println(userInfo.getPassWord());
        return "abc";
    }

    //登录---验证用户名密码是否正确
    @PostMapping(value = "/admin/login_json.controller")
    @ResponseBody
    public Result login_json(ModelMap map,HttpServletRequest request) throws MyException {
        System.out.println("进入登录");
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        System.out.println("name:"+name);
        System.out.println("password:"+password);

        //如果用户名或密码为空，返回用户名或密码不能为空
        if(StringUtils.isEmpty(name) || StringUtils.isEmpty(password)){
            System.out.println("ASDasdasd");
            throw new MyException(0,"用户名或密码不能为空");
        }

        //如果用户名或密码不正确，返回用户名或密码不正确
        UserInfo userInfo = userInfoService.selectUser(name, password);

        if(userInfo==null){
            System.out.println("xzcoksaksoa");
            System.out.println("用户名或密码不正确");
            throw new MyException(0,"用户名或密码不正确");
        }

        //设置session
        request.getSession().setAttribute("userInfo",userInfo);

        System.out.println(request.getSession().getAttribute("userInfo").toString());

        //System.out.println(request.getSession().getAttribute("login_name"));
        //System.out.println(request.getSession().getAttribute("pass_word"));
        System.out.println("cheng");
        return Result.success();

    }


    //注册---验证用户名密码是否存在,如果不存在就注册
    @PostMapping(value = "/admin/register_json.controller")
    @ResponseBody
    public Result register_json(ModelMap map, HttpServletRequest request){
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        //如果用户名或密码为空，返回用户名或密码不能为空
        if(StringUtils.isEmpty(name) || StringUtils.isEmpty(password)){
            throw new MyException(0,"用户名或密码不能为空");
        }
        //如果用户名已存在
        String res = userInfoService.selectLoginNameisEmpty(name);
        if(res.equals("0")){
            throw new MyException(0,"用户名已存在");
        }

        //进行注册
        userInfoService.insertUser(name, password);
        return Result.success();

    }



    //我---退出登录:
    @RequestMapping("login_out.controller")
    public String login_out (HttpSession session){
        //销毁session
        session.invalidate();
        return "admin/login";

    }


}
