package com.example.springdemoannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.example.springdemoannotations")
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
