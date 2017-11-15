package com.dahai.springboot.example.controller;

import com.dahai.springboot.example.dao.PeopleDao;
import com.dahai.springboot.example.data.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 类描述：
 * <p>
 * author：xjh
 * version v0.1
 * 时间：2017/9/21
 */
@RestController
public class UserController {

    private final PeopleDao peopleDao;

    @Autowired
    public UserController(PeopleDao peopleDao) {
        this.peopleDao = peopleDao;
    }

    @GetMapping(value = "/getPeopleList")
    public List<People> getUserList() {
        return peopleDao.findAll();
    }

    @PostMapping(value = "/addPeople")
    public People addUser(@RequestParam("name")String name,@RequestParam("age")Integer age) {
        People people = new People();
        people.setAge(age);
        people.setName(name);

        System.out.println(name+age);
        return peopleDao.save(people);
    }

    @GetMapping(value = "/findUser")
    public People findUser(@RequestParam("id")Integer id) {
        return peopleDao.findOne(id);
    }
}
