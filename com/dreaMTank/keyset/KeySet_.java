package com.dreaMTank.keyset;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class KeySet_ {
    public static void main(String[] args) {

        Map map = new HashMap();
        map.put("ghj", "jhg");
        map.put("y", "jh");
        map.put("t", "jg");
        map.put("io", "g");
        map.put("ak", "pp");

        Set kk = map.keySet();
        Iterator iterator = kk.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            Object value = map.get(key);
            System.out.println(key + "-" + value);
        }

        System.out.println("==================");
        Set yy = map.keySet();
        for (Object key :
                yy) {
            System.out.println(key + "-" + map.get(key));
        }

        System.out.println("====================");
        Set entry = map.entrySet();
        for (Object key :
                entry) {
            Map.Entry e = (Map.Entry) key;
            Object key1 = e.getKey();
            Object value = e.getValue();
            System.out.println(key1 + "-" + value);
        }
    }
}
