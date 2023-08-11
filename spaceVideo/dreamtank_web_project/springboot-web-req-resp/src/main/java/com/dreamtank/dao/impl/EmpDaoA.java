package com.dreamtank.dao.impl;

import com.dreamtank.dao.EmpDao;
import com.dreamtank.pojo.Emp;
import com.dreamtank.utils.XmlParserUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmpDaoA implements EmpDao {

    @Override
    public List<Emp> listEmp() {
        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
        System.out.println(file);
        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);
        return empList;
    }
}
