package com.mac.graeme.phillipson.springvalidation;


import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class DemoServiceImpl implements DemoService{
    @Override
    public String sayHello(String message, Collection<String> people) {
        if(people.size() == 2) {
            return null;
        }
        if(people.size() == 3) {
            return "    ";
        }
        return message + " to " + StringUtils.join(people, ", ");
    }
}
