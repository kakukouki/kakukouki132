package com.dreaMTank.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class SocketTCP02Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(998);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1){
            System.out.println(new String(buf, 0, readLen));
        }
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello, client...".getBytes());
        socket.shutdownOutput();
        socket.close();
        serverSocket.close();
        inputStream.close();
        outputStream.close();
    }
}
