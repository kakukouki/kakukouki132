package com.dreamtank.service;

import com.dreamtank.pojo.Dept;

import java.util.List;

public interface DeptService {
    List<Dept> list();

    void delete(Integer id) throws Exception;

    void add(Dept dept);

//    Dept put(Integer id, String name);
}
