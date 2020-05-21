package com.zj.city.service.user_info;

import java.util.List;


import com.zj.city.domain.Person;

/**
 * @author 不若为止
 * @version 1.0
 * @class PersonService
 * @package com.wzhi.tableserver.service
 * @desc 个人信息Service
 * @copyright weizhi
 * @date 2018/09/04
 */
public interface PersonService {
    /**
     * @desc 查询所有的用户
     * @return
     */
    List<Person> findAll();
}

