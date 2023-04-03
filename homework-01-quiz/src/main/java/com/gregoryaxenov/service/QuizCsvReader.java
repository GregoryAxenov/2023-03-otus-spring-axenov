package com.gregoryaxenov.service;

import com.gregoryaxenov.domain.Quiz;
import lombok.RequiredArgsConstructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class QuizCsvReader implements QuizReader {
    private final String quizzesCsv;

    @Override
    public List<Quiz> read()  {
        List<Quiz> quizzes = new ArrayList<>();

        InputStream csvInputStream = getClass().getClassLoader().getResourceAsStream(quizzesCsv);
        if (csvInputStream != null) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(csvInputStream));
            String line;
            try {
                while ((line = reader.readLine()) != null) {
                    String question = line.split(",")[0];
                    String answer = line.split(",")[1];
                    quizzes.add(new Quiz(question, answer));
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return quizzes;
    }
}
