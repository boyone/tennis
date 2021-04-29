package com.summitthai;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TennisTest {

	@Test
	public void startGameScoreShouldBeLove_Love() {
		// Arrange
		Tennis tennis = new Tennis();
		String expectedValue = "Love-Love";

		// Act
		String actualValue = tennis.getScore();

		// Assert
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void beginGamePlayerOneWinOneBallScoreShouldBeFifteen_Love() {
		// Arrange
		Tennis tennis = new Tennis();
		String expectedValue = "Fifteen-Love";

		// Act
		tennis.playerOneGetPoint();
		String actualValue = tennis.getScore();

		// Assert
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void beginGamePlayerOneWinTwoBallsScoreShouldBeThirty_Love() {
		// Arrange
		Tennis tennis = new Tennis();
		String expectedValue = "Thirty-Love";

		// Act
		tennis.playerOneGetPoint();
		tennis.playerOneGetPoint();
		String actualValue = tennis.getScore();

		// Assert
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void beginGamePlayerOneWinThreeBallsScoreShouldBeForty_Love() {
		// Arrange
		Tennis tennis = new Tennis();
		String expectedValue = "Forty-Love";

		// Act
		tennis.playerOneGetPoint();
		tennis.playerOneGetPoint();
		tennis.playerOneGetPoint();
		String actualValue = tennis.getScore();

		// Assert
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void beginGamePlayerOneWinFourBallsScoreShouldBeWin_For_Player1() {
		// Arrange
		Tennis tennis = new Tennis();
		String expectedValue = "Win-for-Player1";

		// Act
		tennis.playerOneGetPoint();
		tennis.playerOneGetPoint();
		tennis.playerOneGetPoint();
		tennis.playerOneGetPoint();
		String actualValue = tennis.getScore();

		// Assert
		assertEquals(expectedValue, actualValue);
	}
}
