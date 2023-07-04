package com.dreaMTank.IOtest_.test01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        String directoryPath = "/Users/dreamtank152";
        File file = new File(directoryPath);
        if (!file.exists()){
            if (file.mkdirs()){
                System.out.println("创建 " + directoryPath + " 创建成功");
            } else {
                System.out.println("创建 " + directoryPath + " 创建失败");
            }
        }
        String filePath =  directoryPath + "/ghj.txt";
        file = new File(filePath);
        if (!file.exists()){
            if (file.createNewFile()){
                System.out.println(filePath + " 创建成功");
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                bufferedWriter.write("hello, world~~~~ ");
                bufferedWriter.close();
            } else {
                System.out.println(filePath + " 创建失败");
            }
        } else {
            System.out.println(filePath + " 已经存在，不再重复创建。。。");
        }
    }
}
