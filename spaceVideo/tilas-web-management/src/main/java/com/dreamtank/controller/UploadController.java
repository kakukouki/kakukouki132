package com.dreamtank.controller;

import com.dreamtank.pojo.Result;
import com.dreamtank.utils.AliOSSUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import static java.util.UUID.randomUUID;


@Slf4j
@RestController
public class UploadController {
//    @PostMapping("/upload")
//    public Result upload(String username, Integer age, MultipartFile image) throws IOException {
//        log.info("文件上传：{},{},{}", username, age, image);
//        //获取原始文件名
//        String originalFilename = image.getOriginalFilename();
//
//        //构建新的文件名
//        String newFileName = UUID.randomUUID().toString() +
//                            originalFilename.substring(originalFilename.lastIndexOf("."));
//        log.info("新的文件名：{}", newFileName);
//
//        //保存文件
//        image.transferTo(new File("/Users/dreamtank/downloads/newFile/" + newFileName));
//
//
//        return Result.success();
//    }
    @Autowired
     private AliOSSUtils aliOSSUtils;

    @PostMapping("/upload")
    public Result upload(MultipartFile image) throws IOException {
        log.info("文件上传，文件名：{}", image.getOriginalFilename());
        String url = aliOSSUtils.upload(image);
        log.info("文件上传完成，文件访问的url:{}", url);
        return Result.success(url);


    }
}
