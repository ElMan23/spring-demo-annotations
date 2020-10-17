package com.example.springdemoannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySources;

@Configuration
//@ComponentScan("com.example.springdemoannotations")
@PropertySources("classpath:sport.properties")
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
