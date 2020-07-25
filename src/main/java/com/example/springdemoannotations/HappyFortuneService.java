package com.example.springdemoannotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "HappyFortuneService: here's your Fortune!";
    }
}
