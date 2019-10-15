package com.czg.service;

import java.util.List;
import java.util.Map;

/**
 * @program: spring-aop
 * @description: 模拟现实开发实现类
 * @author: czg
 * @create: 2019-10-05 22:16
 */
public class UserServicelmp implements UserService {
    public void add(int i) {
        int i1=1/0;
        System.out.println("add method!!!");
    }

    public void delete(String name) {
        System.out.println("delete method!!!");
    }

    public void update(Map<String,Object> map) {
        System.out.println("update method!!!");
    }

    public void query(List list) {
        System.out.println("query method!!!");
    }
}
