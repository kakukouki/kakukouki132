package com.dreaMTank.objectoutputstream;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class ObjectInputStream_ {
    public static void main(String[] args) throws Exception {
        String filePath = "/Users/dreamtank152/test.txt";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readDouble());
        System.out.println(ois.readChar());
        System.out.println(ois.readUTF());
        System.out.println(ois.readObject());
        ois.close();
    }
}
