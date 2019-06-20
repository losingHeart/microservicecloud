package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Dept;

import java.util.List;

/**
 * @author yuan
 * @create 2019-06-16 23:49
 */
public interface DeptService {
    boolean add(Dept dept);
    Dept get(Long id);
    List<Dept> list();
}
