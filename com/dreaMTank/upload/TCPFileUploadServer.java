package com.dreaMTank.upload;

import com.dreaMTank.upload.streamutils.StreamUtils;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class TCPFileUploadServer {
    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();

        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        String destFilePath = "/Users/dreamtank152/double sexy001.jpeg";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFilePath));
        bos.write(bytes);
        bos.close();

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        writer.write("收到");
        writer.flush();
        socket.shutdownOutput();


        writer.close();
        bis.close();
        socket.close();
        serverSocket.close();

    }
}
