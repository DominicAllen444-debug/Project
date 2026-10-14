package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    void sumsArrayElements() {
        assertEquals(15L, new App().sum(new int[] {1, 2, 3, 4, 5}));
    }

    @Test
    void emptyArrayHasSumZero() {
        assertEquals(0L, new App().sum(new int[] {}));
    }
}
