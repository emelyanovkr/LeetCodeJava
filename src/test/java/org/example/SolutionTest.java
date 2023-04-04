package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution object;

    @BeforeEach
    void setUp() {
        object = new Solution();
    }

    @Test
    void canConstruct() {
        assertTrue(object.canConstruct("abc", "abc"));
        assertTrue(object.canConstruct("abk","abk"));
        assertFalse(object.canConstruct("a", "b"));
        assertTrue(object.canConstruct("aa", "aab"));
    }
}