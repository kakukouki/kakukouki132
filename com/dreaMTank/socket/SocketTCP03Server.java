package com.dreaMTank.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class SocketTCP03Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(998);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);
//        System.out.println(bufferedReader.readLine());



        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello, client...");
        bufferedWriter.newLine();
        bufferedWriter.flush();


        socket.close();
        serverSocket.close();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
