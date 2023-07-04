package com.dreaMTank.collection;

import java.util.*;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class List_ {
    public static void main(String[] args) {
       List list = new LinkedList();
        for (int i = 0; i < 12; i++) {
            list.add("Hello" + i);
        }
        System.out.println(list);
        list.add(1,"GHJ");
        System.out.println(list );

        System.out.println(list.get(4));

        list.remove(5);
        System.out.println(list);

        list.set(6,"PPPPP");
        System.out.println(list);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

    }
}
