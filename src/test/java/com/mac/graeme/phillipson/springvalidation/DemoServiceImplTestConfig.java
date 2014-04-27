package com.mac.graeme.phillipson.springvalidation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ValidationConfig.class})
public class DemoServiceImplTestConfig {

    @Bean
    DemoService demoService() {
        return new DemoServiceImpl();
    }
}
