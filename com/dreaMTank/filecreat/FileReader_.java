package com.dreaMTank.filecreat;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class FileReader_ {
    public static void main(String[] args) {
        String filePath = "/Users/dreamtank152/ghj.txt";
        FileReader fileReader = null;
        int readLen = 0;
        char[] buf = new char[8];
        try {
            fileReader = new FileReader(filePath);
            while ((readLen = fileReader.read(buf)) != -1){
                System.out.print(new String(buf, 0, readLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileReader != null){
                    fileReader.close();
                }
            } catch (IOException e) {
                    e.printStackTrace();            }
        }

    }
}
