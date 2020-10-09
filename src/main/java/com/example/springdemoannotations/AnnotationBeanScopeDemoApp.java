package com.example.springdemoannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {

        // Load Spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the Bean from Spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        // Check if the Beans are the same object
        boolean result = (theCoach == alphaCoach);

        // Print out the result
        System.out.println("\nAre the beans the same? " + result);
        System.out.println("\nMemory location for theCoach: " + theCoach);
        System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");

        // Close the context
        context.close();
    }
}
