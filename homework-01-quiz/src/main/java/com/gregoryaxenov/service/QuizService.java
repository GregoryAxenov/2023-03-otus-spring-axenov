package com.gregoryaxenov.service;

import com.gregoryaxenov.domain.Quiz;

import java.util.List;

public interface QuizService {
    List<Quiz> load();

    void printAnswersToConsole();
}
