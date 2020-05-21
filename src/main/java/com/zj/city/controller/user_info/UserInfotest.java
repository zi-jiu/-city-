package com.zj.city.controller.user_info;

import com.zj.city.exception.MyException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * ClassName:UserInfotest
 * Package:com.zj.city.controller.user_info
 * Description:
 *
 * @Date:2020/5/4 17:46
 * @Author:zijiu@1008611
 */
@RestController
public class UserInfotest {
    @GetMapping(value = "sss")
    public String findAll(){
        throw new MyException(1,"测试数据");
    }
}
