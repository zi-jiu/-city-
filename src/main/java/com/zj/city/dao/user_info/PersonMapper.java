package com.zj.city.dao.user_info;

import com.zj.city.domain.Person;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName:PersonMapper
 * Package:com.zj.city.dao.user_info
 * Description:
 *
 * @Date:2020/5/3 11:27
 * @Author:zijiu@1008611
 */
@Mapper
public interface PersonMapper {
    List<Person> findAll();
}
