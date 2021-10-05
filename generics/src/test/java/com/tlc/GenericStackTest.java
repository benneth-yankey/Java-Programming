package com.tlc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GenericStackTest {
    GenericStack<Integer> scores;

    @BeforeEach
    void setUp() {
        scores = new GenericStack<>();
    }

    @Test
    void whenGivenAnInteger_ThenItIsAddedToTheStack() {
       scores.push(67); 
       Assertions.assertTrue(scores.isPresent(67));
    }
}
