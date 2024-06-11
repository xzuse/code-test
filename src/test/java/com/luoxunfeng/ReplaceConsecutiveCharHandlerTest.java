package com.luoxunfeng;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReplaceConsecutiveCharHandlerTest {
    ConsecutiveCharHandler handler;

    @BeforeEach
    void setUp() {
        handler = new ReplaceConsecutiveCharHandler();
    }

    @AfterEach
    void tearDown() {
        handler = null;
    }

    @Test
    void testHandle() {
        String result = handler.handle("abcccbad", 3);
        assertEquals(result, "d");
    }
}