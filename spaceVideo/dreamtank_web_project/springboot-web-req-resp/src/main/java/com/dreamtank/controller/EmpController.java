package com.dreamtank.controller;

import com.dreamtank.pojo.Emp;
import com.dreamtank.pojo.Result;
import com.dreamtank.service.EmpService;
import com.dreamtank.service.impl.EmpServiceA;
import com.dreamtank.utils.XmlParserUtils;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class EmpController {
    @Autowired
     private EmpService empService;
    @RequestMapping("/listEmp")
    public Result list(){

        List<Emp> empList = empService.listEmp();
        return Result.success(empList);
    }
}
