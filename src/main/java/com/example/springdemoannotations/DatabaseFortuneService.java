package com.example.springdemoannotations;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "DatabaseFortuneService: inside the get method.";
    }
}
