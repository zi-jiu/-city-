package com.zj.city.controller.user_info;

import com.zj.city.domain.Person;
import com.zj.city.domain.Result;
import com.zj.city.exception.MyException;
import com.zj.city.service.user_info.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;


@RestController
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class PersonController {
    @Autowired
    private PersonService service;

    @GetMapping(value = "findAll")
    public List<Person> findAll(){
        List<Person> list = service.findAll();

        return list;
    }


}