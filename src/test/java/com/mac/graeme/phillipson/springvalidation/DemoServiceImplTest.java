package com.mac.graeme.phillipson.springvalidation;


import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;


public class DemoServiceImplTest {

    private DemoService demoService = new DemoServiceImpl();

    @Test
    public void testGoodMessage() {
        String expected = "Hello, World!";
        String actual = demoService.sayHello("Hello", Collections.singleton("World"));
        assertEquals(expected, actual);
    }

    @Test
    public void testGoodMessageMultiple() {
        String expected = "Hello, Earth, Mars!";
        String actual = demoService.sayHello("Hello", Arrays.asList("Earth","Mars"));
        assertEquals(expected, actual);
    }

}
