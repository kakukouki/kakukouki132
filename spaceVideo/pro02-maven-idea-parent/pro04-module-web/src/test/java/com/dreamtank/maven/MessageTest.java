package com.dreamtank.maven;

import org.junit.Test;

public class MessageTest {
    @Test
    public void testMessage(){
        Message message = new Message();
        message.getMessage();
        System.out.println("ok!");
    }
}
