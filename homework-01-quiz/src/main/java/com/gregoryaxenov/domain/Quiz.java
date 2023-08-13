package com.gregoryaxenov.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Quiz {
    private final String question;

    private final String answer;
}
