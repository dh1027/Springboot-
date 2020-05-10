package com.heyuanjun;

import com.heyuanjun.entity.Clazz;
import com.heyuanjun.entity.User;
import com.heyuanjun.mapper1.UserMapper;
import com.heyuanjun.mapper2.ClazzMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by deng on 2020/5/5.
 */
@RestController
public class UsersController {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ClazzMapper clazzMapper;

    @RequestMapping("findByName")
    public User findByName(String name) {
        return userMapper.findByName(name);
    }

    @RequestMapping("findByClazz")
    public Clazz findByClazz(String clazz) {
        return clazzMapper.findByClazz(clazz);
    }
}