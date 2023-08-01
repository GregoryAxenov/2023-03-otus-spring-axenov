package com.gregoryaxenov.dao;

import com.gregoryaxenov.domain.Quiz;
import lombok.RequiredArgsConstructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class QuizDaoSimple implements QuizDao {
    private static final String DELIMITER = ",";
    private final String quizzesCsv;

    @Override
    public List<Quiz> findAll() {
        List<Quiz> quizzes = new ArrayList<>();

        InputStream csvInputStream = getClass().getClassLoader().getResourceAsStream(quizzesCsv);
        if (csvInputStream != null) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(csvInputStream))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String question = line.split(DELIMITER)[0];
                    String answer = line.split(DELIMITER)[1];
                    quizzes.add(new Quiz(question, answer));
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return quizzes;
    }
}
