package com.dreaMTank.api;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class API_ {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);

        InetAddress makkintshunoMBP = InetAddress.getByName("makkintshunoMBP");
        System.out.println(makkintshunoMBP);

        InetAddress byName = InetAddress.getByName("www.google.com");
        System.out.println(byName);

        String hostAddress = byName.getHostAddress();
        System.out.println(hostAddress);


    }
}
