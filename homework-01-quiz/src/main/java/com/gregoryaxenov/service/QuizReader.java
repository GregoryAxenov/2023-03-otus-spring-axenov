package com.gregoryaxenov.service;

import com.gregoryaxenov.domain.Quiz;

import java.util.List;

public interface QuizReader {
    List<Quiz> read();
}
