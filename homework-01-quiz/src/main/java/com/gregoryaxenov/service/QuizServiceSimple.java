package com.gregoryaxenov.service;

import com.gregoryaxenov.dao.QuizDao;
import com.gregoryaxenov.domain.Quiz;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class QuizServiceSimple implements QuizService {
    private final QuizDao quizDao;

    @Override
    public void start() {
        printAnswersToConsole();
    }

    private void printAnswersToConsole() {
        System.out.println("QUIZ!!!");
        for (Quiz quiz : quizDao.findAll()) {
            System.out.println(quiz.getQuestion());
        }
    }
}
