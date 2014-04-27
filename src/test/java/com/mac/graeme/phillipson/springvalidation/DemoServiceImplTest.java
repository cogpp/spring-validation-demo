package com.mac.graeme.phillipson.springvalidation;


import org.hibernate.validator.method.MethodConstraintViolationException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Collections;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DemoServiceImplTestConfig.class})
public class DemoServiceImplTest {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private DemoService demoService;

    @Test
    public void testGoodMessage() {
        String expected = "Hello to World!";
        String actual = demoService.sayHello("Hello", Collections.singleton("World!"));
        assertEquals(expected, actual);
    }


    @Test
    public void demoErrorMessage() {
        try {
            demoService.sayHello(null, Collections.singleton("World!"));
        }
        catch(MethodConstraintViolationException ex) {
            logger.error(ex.getMessage());
        }
    }
}
