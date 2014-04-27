package com.mac.graeme.phillipson.springvalidation;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import java.util.Collection;

@Configuration
@Import({ValidationConfig.class})
public class DemoServiceTestConfig {

    @Bean(name = "demoServiceNull")
    DemoService demoServiceNull() {
        return new DemoService() {
            @Override
            public String sayHello(String message, Collection<String> people) {
                return null;
            }
        };
    }

    @Bean(name = "demoServiceBlank")
    DemoService demoServiceBlank() {
        return new DemoService() {
            @Override
            public String sayHello(String message, Collection<String> people) {
                return "  ";
            }
        };
    }

}
