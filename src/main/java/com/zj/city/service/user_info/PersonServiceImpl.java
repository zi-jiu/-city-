package com.zj.city.service.user_info;

import java.util.List;

import com.zj.city.dao.user_info.PersonMapper;
import com.zj.city.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper mapper;
    @Override
    public List<Person> findAll() {
        return mapper.findAll();
    }
}