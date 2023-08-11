package com.dreamtank.service.impl;

import com.dreamtank.mapper.DeptMapper;
import com.dreamtank.mapper.EmpMapper;
import com.dreamtank.pojo.Dept;
import com.dreamtank.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeptServicelmpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;
    @Autowired
    private EmpMapper empMapper;

    @Override
    public List<Dept> list() {
        return deptMapper.list();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(Integer id) throws Exception {
        deptMapper.deleteById(id);
        //int i = 1/0;
        if (true){
            throw new Exception("出错啦。。。");
        }

        empMapper.deleteByDept(id);
    }

    @Override
    public void add(Dept dept) {
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());

        deptMapper.insert(dept);
    }

//    @Override
//    public Dept put(Integer id, String name) {
//        Dept dept = deptMapper.put(id, name);
////        Dept dept = new Dept(id, name, null, null);
//        dept.setUpdateTime(LocalDateTime.now());
//        dept.setCreateTime(LocalDateTime.now());
//        return dept;
//
//
//    }
}
