package com.gregoryaxenov.dao;

import com.gregoryaxenov.domain.Quiz;

import java.util.List;

public interface QuizDao {
    Quiz save(Quiz quiz);

    List<Quiz> saveAll(List<Quiz> quiz);

    List<Quiz> findAll();
}
