package com.example.springdemoannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

    public static void main(String[] args) {

        // Read spring config class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // Get the bean from spring container
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

        // Call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
        // Call a method to get the dependecy injected
        System.out.println(theCoach.getDailyFortune());

        // Call our new swim coach methods
        System.out.println("Email: " + theCoach.getEmail());
        System.out.println("Team: " + theCoach.getTeam());

        // Close the context
        context.close();

    }

}


