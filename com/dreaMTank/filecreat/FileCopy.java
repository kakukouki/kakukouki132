package com.dreaMTank.filecreat;

import java.io.*;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class FileCopy {
    public static void main(String[] args) {
        String srcFilePath = "/Users/dreamtank152/ghj.txt";
        String destFilePath = "/Users/dreamtank152/ghjghj.txt";
//        File file = new File(destFilePath);
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(srcFilePath);
            fileOutputStream = new FileOutputStream(destFilePath);
            byte[] buf = new byte[1024];
            int readLen = 0;
            while((readLen = fileInputStream.read(buf)) != -1){
                fileOutputStream.write(buf, 0, readLen);
            }
            System.out.println("ok~");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileInputStream != null){
                    fileInputStream.close();
                }
                if (fileOutputStream != null){
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
