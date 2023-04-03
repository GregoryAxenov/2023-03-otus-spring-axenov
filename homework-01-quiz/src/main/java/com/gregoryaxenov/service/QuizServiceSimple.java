package com.gregoryaxenov.service;

import com.gregoryaxenov.dao.QuizDao;
import com.gregoryaxenov.domain.Quiz;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class QuizServiceSimple implements QuizService {
    private final QuizDao quizDao;

    private final QuizReader quizReader;

    public List<Quiz> load() {
        List<Quiz> quizzes = quizReader.read();
        quizDao.saveAll(quizzes);
        return quizzes;
    }

    @Override
    public void printAnswersToConsole() {
        System.out.println("QUIZ!!!");
        for (Quiz quiz : quizDao.findAll()) {
            System.out.println(quiz.getQuestion());
        }
    }
}
