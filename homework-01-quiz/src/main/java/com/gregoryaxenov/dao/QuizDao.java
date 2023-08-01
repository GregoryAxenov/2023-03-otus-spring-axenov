package com.gregoryaxenov.dao;

import com.gregoryaxenov.domain.Quiz;

import java.util.List;

public interface QuizDao {
    List<Quiz> findAll();
}
