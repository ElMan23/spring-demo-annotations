package com.example.springdemoannotations;

import org.springframework.stereotype.Component;

// Default bean id will be "tennisCoach"
@Component
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

}
