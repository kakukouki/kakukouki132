package com.dreamtank.controller;

import com.dreamtank.anno.Log;
import com.dreamtank.pojo.Dept;
import com.dreamtank.pojo.Emp;
import com.dreamtank.pojo.Result;
import com.dreamtank.service.DeptService;
import com.dreamtank.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/depts")
public class DeptController {

    @Autowired
    private DeptService deptService;



//    @RequestMapping(value = "/depts", method = RequestMethod.GET)
    @Log
    @GetMapping
    public Result list(){
        log.info("查询全部部门数据");

        List<Dept> deptList = deptService.list();

        return Result.success(deptList);
    }

    @Log
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) throws Exception {
        log.info("根据id删除部门:{}", id);

        deptService.delete(id);

        return Result.success();
    }

    @Log
    @PostMapping
    public Result add(@RequestBody Dept dept){
        log.info("新增部门:{}",dept);
        deptService.add(dept);
        return Result.success();

    }

//    @PutMapping
//    public Result put(@PathVariable Integer id, @PathVariable String name){
//        log.info("修改部门，参数：{},{}",id, name);
//        Dept dept = deptService.put(id, name);
//        return Result.success(dept);
//    }



}
