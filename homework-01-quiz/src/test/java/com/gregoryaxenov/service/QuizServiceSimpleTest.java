package com.gregoryaxenov.service;

import com.gregoryaxenov.dao.QuizDao;
import com.gregoryaxenov.domain.Quiz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Collections;
import java.util.List;

class QuizServiceSimpleTest {
    private final QuizDao quizDao = Mockito.mock(QuizDao.class);

    private final QuizReader quizReader = Mockito.mock(QuizReader.class);

    @Test
    void loadTest() {
        List<Quiz> quizzes = Collections.singletonList(new Quiz("question1", "answer1"));
        Mockito.when(quizReader.read()).thenReturn(quizzes);

        QuizService quizService = new QuizServiceSimple(quizDao, quizReader);

        Assertions.assertEquals(quizzes, quizService.load());
    }
}