package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    void mapsMarksToGradesAtBoundaries() {
        App app = new App();
        assertEquals("A", app.grade(100));
        assertEquals("A", app.grade(90));
        assertEquals("B", app.grade(89));
        assertEquals("B", app.grade(80));
        assertEquals("C", app.grade(70));
        assertEquals("D", app.grade(60));
        assertEquals("F", app.grade(59));
        assertEquals("F", app.grade(0));
    }

    @Test
    void rejectsMarksOutsideZeroToOneHundred() {
        App app = new App();
        assertThrows(IllegalArgumentException.class, () -> app.grade(-1));
        assertThrows(IllegalArgumentException.class, () -> app.grade(101));
    }
}
