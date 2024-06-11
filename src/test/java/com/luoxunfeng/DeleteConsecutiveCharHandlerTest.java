package com.luoxunfeng;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class DeleteConsecutiveCharHandlerTest {
    ConsecutiveCharHandler handler;

    @BeforeEach
    void setUp() {
        handler = new DeleteConsecutiveCharHandler();
    }

    @AfterEach
    void tearDown() {
        handler = null;
    }
    @Test
    void testNullHandle() {
        String result = handler.handle(null, 3);
        assertNull(result);
    }
    @Test
    void testEmptyHandle() {
        String result = handler.handle("", 3);
        assertEquals(result, "");
    }

    @Test
    void testHandle() {
        String result = handler.handle("aabcccbbad", 3);
        assertEquals(result, "d");
    }

}
