package com.dahai.springboot.example.controller;

import com.dahai.springboot.example.data.People;
import com.dahai.springboot.example.service.JsonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类描述：
 * <p>
 * author：xjh
 * version v0.1
 * 时间：2017/10/11
 */

@RestController
public class JsonController {

    private final JsonService jsonService;

    @Autowired
    public JsonController(JsonService jsonService) {
        this.jsonService = jsonService;
    }

    @GetMapping(value = "/getHeadTableData")
    public String getHeadTableData() {

        return jsonService.getJsonData("E:\\BackgroundProject\\springbootdemo\\src\\main\\java\\com\\dahai\\springboot\\example\\data\\HeadTab.json");
    }

    @PostMapping(value = "/update")
    public String update(@RequestBody People people) {

        System.out.println(people.getName() +"==="+ people.getAge());

        return people.getName() + "===" + people.getAge();
    }
}
