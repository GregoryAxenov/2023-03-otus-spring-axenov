package com.gregoryaxenov.service;

import com.gregoryaxenov.dao.QuizDao;
import com.gregoryaxenov.domain.Quiz;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;

@ExtendWith(MockitoExtension.class)
class QuizServiceSimpleTest {
    @Mock
    private QuizDao quizDao;

    @InjectMocks
    private QuizServiceSimple quizServiceSimple;

    @Test
    void loadTest() {
        Mockito.when(quizDao.findAll()).thenReturn(Collections.singletonList(new Quiz("question1", "answer1")));

        quizServiceSimple.start();

        Mockito.verify(quizDao).findAll();
    }
}