package com.dreaMTank.socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class SocketTCP03Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 998);
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello, server...");
        bufferedWriter.newLine();//接收方必须readline（）！！！不然白写！！
        bufferedWriter.flush();//字符流需要手动刷新！！！不然写不进通道！！！


        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
//        bufferedReader.readLine();
        System.out.println(bufferedReader.readLine());

        socket.close();
       bufferedWriter.close();
       bufferedReader.close();
    }
}
