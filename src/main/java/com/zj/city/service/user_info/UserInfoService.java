package com.zj.city.service.user_info;

import com.zj.city.domain.UserInfo;

/**
 * ClassName:UserInfoService
 * Package:com.zj.city.service.user_info
 * Description:
 *
 * @Date:2020/5/5 10:49
 * @Author:zijiu@1008611
 */
public interface UserInfoService {

    UserInfo selectUser(String loginName, String passWord);

    String selectLoginNameisEmpty(String loginName);

    void insertUser(String name, String passWord);
}
