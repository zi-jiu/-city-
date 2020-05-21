package com.zj.city.service.user_info;

import com.zj.city.dao.user_info.UserInfoDao;
import com.zj.city.domain.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName:UserInfoServiceImpl
 * Package:com.zj.city.service.user_info
 * Description:
 *
 * @Date:2020/4/28 15:49
 * @Author:zijiu@1008611
 */
@Service("userInfoServiceImpl")
public class UserInfoServiceImpl implements UserInfoService{

    @Autowired
    private UserInfoDao userInfoDao;


    @Override
    public UserInfo selectUser(String loginName, String passWord) {
        UserInfo userInfo = userInfoDao.selectUser(loginName,passWord);
        return userInfo;
    }

    @Override
    public String selectLoginNameisEmpty(String loginName) {
        String res = userInfoDao.selectLoginNameisEmpty(loginName);
        //用户名存在则返回“0”
        if(res!=null){
            return "0";
        }
        //否则返回“1”
        return "1";
    }

    @Override
    public void insertUser(String name, String passWord) {
        userInfoDao.insertUser(name,passWord);
    }
}
