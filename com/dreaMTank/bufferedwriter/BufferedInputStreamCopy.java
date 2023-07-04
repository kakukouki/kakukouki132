package com.dreaMTank.bufferedwriter;

import java.io.*;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class BufferedInputStreamCopy {
    public static void main(String[] args) {
        String srcFilePath = "/Users/dreamtank152/double sexy.jpeg";
        String destFilePath = "/Users/dreamtank152/double sexycopy.jpeg";
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream(srcFilePath));
            bos = new BufferedOutputStream(new FileOutputStream(destFilePath));
            byte[]  buff = new byte[1024];
            int readLen = 0;
            while((readLen = bis.read(buff)) != -1){
                bos.write(buff, 0, readLen);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bis != null){
                    bis.close();
                }
                if (bos != null){
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
