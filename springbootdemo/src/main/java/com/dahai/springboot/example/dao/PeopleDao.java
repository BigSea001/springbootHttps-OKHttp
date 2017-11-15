package com.dahai.springboot.example.dao;

import com.dahai.springboot.example.data.People;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 类描述：
 * <p>
 * author：xjh
 * version v0.1
 * 时间：2017/9/21
 */
public interface PeopleDao extends JpaRepository<People,Integer> {
}
