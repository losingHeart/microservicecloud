package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author yuan
 * @create 2019-06-16 23:35
 */
@Mapper
public interface DeptDao {
    boolean addDept(Dept dept);
    Dept findById(Long id);
    List<Dept> findAll();
}
