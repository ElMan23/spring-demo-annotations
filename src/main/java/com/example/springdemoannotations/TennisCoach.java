package com.example.springdemoannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Default bean id will be "tennisCoach"
@Component
public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "TennisCoach: Practice your backhand volley!";
    }

    @Override
    public String getDailyFortune() {
        return this.getFortuneService().getFortune();
    }

}
