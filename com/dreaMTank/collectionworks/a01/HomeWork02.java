package com.dreaMTank.collectionworks.a01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class HomeWork02 {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put("tom", 2000);
        m.put("jack", 3000);
        m.put("smith", 4000);
        System.out.println(m);
        m.put("tom", 2900);
        System.out.println(m);
        Set set = m.keySet();
        for (Object key :
                set) {
            m.put(key, (Integer)m.get(key) + 100);
        }
        System.out.println(m);


    }
}
