package com.dreamtank.service.impl;

import com.dreamtank.mapper.EmpMapper;
import com.dreamtank.pojo.Emp;
import com.dreamtank.pojo.PageBean;
import com.dreamtank.service.EmpService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class EmpServicelmpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;
//    @Override
//    public PageBean page(Integer page, Integer pageSize) {
//
//        Long count = empMapper.count();
//
//        Integer start = (page - 1) * pageSize;
//        List<Emp> empList = empMapper.page(start, pageSize);
//
//        PageBean pageBean = new PageBean(count, empList);
//        return pageBean;
//
//    }

    @Override
    public PageBean page(Integer page, Integer pageSize, String name, Short gender, LocalDate begin, LocalDate end) {
        //设置分页参数
        PageHelper.startPage(page, pageSize);
        //执行查询 强转类型
        List<Emp> empList = empMapper.list(name, gender, begin, end);
        Page<Emp> p = (Page<Emp>) empList;
        //封装PageBean对象
        PageBean pageBean = new PageBean(p.getTotal(), p.getResult());
        return pageBean;

    }

    @Override
    public void delete(List<Integer> ids) {
         empMapper.delete(ids);
    }

    @Override
    public void save(Emp emp) {
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        empMapper.insert(emp);
    }

    @Override
    public Emp login(Emp emp) {
       Emp e = empMapper.getByUsernameAndPassword(emp);
       return e;
    }


}
