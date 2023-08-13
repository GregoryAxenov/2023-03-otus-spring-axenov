package com.gregoryaxenov;

import com.gregoryaxenov.service.QuizService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        QuizService quizService = applicationContext.getBean(QuizService.class);
        quizService.start();
    }
}
