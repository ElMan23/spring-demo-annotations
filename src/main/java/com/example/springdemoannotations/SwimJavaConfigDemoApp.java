package com.example.springdemoannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

    public static void main(String[] args) {

        // Read spring config class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // Get the bean from spring container
        Coach theCoach = context.getBean("swimCoach", Coach.class);

        // Call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
        // Call a method to get the dependecy injected
        System.out.println(theCoach.getDailyFortune());

        // Close the context
        context.close();

    }

}


