package com.mac.graeme.phillipson.springvalidation;


import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.assertEquals;


public class DemoServiceImplTest {

    private DemoService demoService = new DemoServiceImpl();

    @Test
    public void testGoodMessage() {
        String expected = "Hello to World!";
        String actual = demoService.sayHello("Hello", Collections.singleton("World!"));
        assertEquals(expected, actual);
    }

}
