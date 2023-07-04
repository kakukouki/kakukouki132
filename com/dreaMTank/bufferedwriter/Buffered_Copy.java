package com.dreaMTank.bufferedwriter;

import java.io.*;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class Buffered_Copy {
    public static void main(String[] args) {
        String srcFilePath = "/Users/dreamtank152/kakukouki1/Method.java";
        String destFilePath = "/Users/dreamtank152/kakukouki1/MethodCopy.java";
        BufferedReader br = null;
        BufferedWriter bw = null;
        String line ;
        try {
            br = new BufferedReader(new FileReader(srcFilePath));
            bw = new BufferedWriter(new FileWriter(destFilePath));
            while ((line = br.readLine()) != null){
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (br != null){
                    br.close();
                }
                if (bw != null){
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
