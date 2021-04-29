package com.summitthai;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TennisTest {

    @Test
    public void
    startGameScoreShouldBeLove_Love() {
        // Arrange
        Tennis tennis = new Tennis();
        String expectedValue = "Love-Love";

        // Act
        String actualValue = tennis.getScore();

        // Assert
        assertEquals(expectedValue, actualValue);
    }
}
