package com.mac.graeme.phillipson.springvalidation;


import org.hibernate.validator.method.MethodConstraintViolationException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.Collections;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DemoServiceTestConfig.class})
public class DemoServiceTest {

    @Autowired
    @Qualifier("demoServiceNull")
    private DemoService demoServiceNull;

    @Autowired
    @Qualifier("demoServiceBlank")
    private DemoService demoServiceBlank;

    @Test(expected = MethodConstraintViolationException.class)
    public void testBadMessage() {
        demoServiceNull.sayHello(null, Collections.singleton("World!"));
    }

    @Test(expected = MethodConstraintViolationException.class)
    public void testBlankMessage() {
        demoServiceNull.sayHello("   ", Collections.singleton("World!"));
    }

    @Test(expected = MethodConstraintViolationException.class)
    public void testBadCollection() {
        demoServiceNull.sayHello("Hello", Collections.<String>emptyList());
    }

    @Test(expected = MethodConstraintViolationException.class)
    public void testNullReturn() {
        demoServiceNull.sayHello("Hello", Arrays.asList("Earth", "Mars"));
    }

    @Test(expected = MethodConstraintViolationException.class)
    public void testBlankReturn() {
        demoServiceBlank.sayHello("Hello", Arrays.asList("Earth", "Mars"));
    }
}