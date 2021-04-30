package com.summitthai;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionTest {
    @Test
    void testExpectedException() {

        //First argument - specifies the expected exception.
        //Here it expects that code block will throw NumberFormatException
        //Second argument - is used to pass an executable code block or lambda expression
        Exception exception = assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("One");
        });
        assertEquals("For input string: \"One\"", exception.getMessage());
    }
}
