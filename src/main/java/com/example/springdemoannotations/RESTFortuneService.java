package com.example.springdemoannotations;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RESTFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "RESTFortuneService: inside the get method.";
    }
}
