package com.dreaMTank.bufferedwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/dreamtank152/ghjghjghj.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true));
        bufferedWriter.write("i am the best man");
        bufferedWriter.newLine();
        bufferedWriter.write("!!!!!!!");
        bufferedWriter.newLine();
        bufferedWriter.write("i love you");
        bufferedWriter.newLine();
        bufferedWriter.close();
    }
}
