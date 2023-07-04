package com.dreaMTank.filecreat;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class FileInputStream_ {
    public static void main(String[] args) {

    }
    @Test
    public void readFile01(){
        String filepath = "/Users/dreamtank152/ghj.txt";
        int readDate = 0;
        FileInputStream fileInputStream = null;
        try {
             fileInputStream = new FileInputStream(filepath);
            while ((readDate = fileInputStream.read()) != -1 ) {
                System.out.print((char) readDate);
            }
        } catch (IOException e) {
           e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void readFile02(){
        String filePath = "/Users/dreamtank152/ghj.txt";
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream2 = new FileOutputStream(filePath);
            fileOutputStream2.write('H');
        } catch (IOException e) {
           e.printStackTrace();
        }

    }

}
