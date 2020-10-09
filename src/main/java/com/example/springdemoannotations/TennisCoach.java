package com.example.springdemoannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// Default bean id will be "tennisCoach"
@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    // Default constructor
    public TennisCoach() {
        System.out.println("TennisCoach: inside the default constructor.");
    }
    /*
    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    */

    // Init method
    @PostConstruct
    public void doMyStartUpStuff() {
        System.out.println(">> TennisCoach: startup");
    }

    // Destroy method
    @PreDestroy
    public void doMyCleanUpStuff() {
        System.out.println(">> TennisCoach: cleanup");
    }

    // Getters & Setters
    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("TennisCoach: inside the setter method.");
        this.fortuneService = fortuneService;
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
