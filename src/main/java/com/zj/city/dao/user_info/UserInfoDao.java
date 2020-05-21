package com.zj.city.dao.user_info;

import com.zj.city.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;



/**
 * ClassName:UserInfoDao
 * Package:com.zj.city.dao.user_info
 * Description:
 *
 * @Date:2020/4/28 16:01
 * @Author:zijiu@1008611
 */
@Mapper
public interface UserInfoDao {

    UserInfo selectUser(String loginName,String passWord);

    String selectLoginNameisEmpty(@Param("name") String loginName);

    void insertUser(@Param("name")String name,@Param("password") String passWord);
}
