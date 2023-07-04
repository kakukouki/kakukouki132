package com.dreaMTank.filecreat;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class FileCreat01 {
    public static void main(String[] args) {

    }
    @Test
    public void create01(){
        String filePath = "/Users/dreamtank152/ghj.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

