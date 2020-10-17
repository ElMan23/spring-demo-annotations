package com.example.springdemoannotations;

import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan("com.example.springdemoannotations")
@PropertySource("classpath:sport.properties")
public class SportConfig {

    // Define Bean for Fortune Service
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    // Define Bean for Coach and inject
    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }
}
