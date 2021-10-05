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
    void testPush() {
       scores.push(67); 
       Assertions.assertTrue(scores.isPresent(67));
       Assertions.assertEquals(1, scores.size());
    }

    @Test
    void testPop() {
       scores.push(23);
       scores.push(15);
       scores.push(88);
       scores.pop();
       Assertions.assertEquals(2, scores.size());
       Assertions.assertNotEquals(3, scores.size());
    }

    @Test
    void testTop() {
       scores.push(66);
       scores.push(20);
       Assertions.assertEquals(20, scores.top()); 
       Assertions.assertNotEquals(66, scores.top());
    }

    @Test
    void testSize() {
       scores.push(77);
       scores.push(11);
       scores.push(33); 
       scores.push(55); 
       Assertions.assertEquals(4, scores.size());
       Assertions.assertNotEquals(5, scores.size());
       Assertions.assertNotEquals(3, scores.size());
    }
}
