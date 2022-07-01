package com.xszheng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @Author: xiaoshun
 * @CreateTime: 2022-06-10 17:27
 * @Description:
 */
public class MessageBuilderTest {

    @Test
    public void testGetMessage1() {
        MessageBuilder obj = new MessageBuilder();
        assertEquals("Hello test", obj.getMessage("test"));
    }

    @Test
    public void testGetMessage2() {
        MessageBuilder obj = new MessageBuilder();
        assertEquals("empty!", obj.getMessage(""));
    }

    @Test
    public void testGetMessage3() {
        MessageBuilder obj = new MessageBuilder();
        assertEquals("empty!", obj.getMessage(null));
    }
}
