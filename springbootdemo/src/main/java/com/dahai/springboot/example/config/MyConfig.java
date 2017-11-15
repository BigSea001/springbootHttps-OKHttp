package com.dahai.springboot.example.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 类描述：
 * <p>
 * author：xjh
 * version v0.1
 * 时间：2017/9/21
 */
@Component
@ConfigurationProperties(prefix = "dahai")
public class MyConfig {

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
