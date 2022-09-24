package org.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void checkIntegerMultiplicationTest() {
        int number1 = 5;
        int number2 = 10;
        assertEquals(50, Main.mult(number1, number2));
    }
}