package com.czg.service;

import java.util.List;
import java.util.Map;

/**
 * @program: spring-aop
 * @description:
 * @author: czg
 * @create: 2019-10-05 22:15
 */
public interface UserService {

    void add(int i);

    void delete(String name);

    void update(Map<String, Object> map);

    void query(List list);
}
