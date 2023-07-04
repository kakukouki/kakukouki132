package com.dreaMTank.upload;

import com.dreaMTank.upload.streamutils.StreamUtils;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
/**
 * @author 郭鴻基
 * @version 1.0
 */
public class TCPFileUploadClient {
    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("192.168.1.196", 8081);
        String filePath = "/Users/dreamtank152/double sexy.jpeg";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));

        byte[] bytes = StreamUtils.streamToByteArray(bis);
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes);
        bis.close();
        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        String s = StreamUtils.streamToString(inputStream);
        System.out.println(s);


        inputStream.close();
        bos.close();
        socket.close();
    }
}
