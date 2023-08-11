package com.dreamtank.controller;

import com.dreamtank.pojo.Address;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//public class RequestController {
//    @RequestMapping("/simpleParam")
//    public String simpleParam(HttpServletRequest request){
//        String name = request.getParameter("name");
//        String agestr = request.getParameter("age");
//        int age = Integer.parseInt(agestr);
//        System.out.println(name + ":" + age);
//        return  "ok";
//
//    }
//
//}


@RestController
public class RequestController {
    @RequestMapping("/simpleParam")
    public String simpleParam(@RequestParam(name = "namae", required = false) String namae , Integer age){
        System.out.println(namae + ":" + age);
        return  "ok";

    }
    @RequestMapping("/getAddr")
    public Address getAddr(){
        Address addr = new Address();
        addr.setProvince("广东");
        addr.setCity("深圳");
        return addr;
    }

}