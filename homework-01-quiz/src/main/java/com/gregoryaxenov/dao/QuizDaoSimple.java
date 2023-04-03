package com.gregoryaxenov.dao;

import com.gregoryaxenov.domain.Quiz;

import java.util.ArrayList;
import java.util.List;

public class QuizDaoSimple implements QuizDao {
    private final List<Quiz> quizzes = new ArrayList<>();

    @Override
    public Quiz save(Quiz quiz) {
        this.quizzes.add(quiz);
        return quiz;
    }

    @Override
    public List<Quiz> saveAll(List<Quiz> quizzes) {
        this.quizzes.addAll(quizzes);
        return quizzes;
    }

    @Override
    public List<Quiz> findAll() {
        return this.quizzes;
    }
}
