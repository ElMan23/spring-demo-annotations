package com.example.springdemoannotations;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "RandomFortuneService: inside the get method.";
    }
}