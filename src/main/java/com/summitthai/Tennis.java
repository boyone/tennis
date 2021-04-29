package com.summitthai;

public class Tennis {

	private static final String[] POINT_NAMES = new String[] { "Love", "Fifteen", "Thirty", "Forty" };

	private int pointPlayerOne = 0;

	public String getScore() {

		if (this.pointPlayerOne == 4) {
			return "Win-for-Player1";
		}

		return Tennis.POINT_NAMES[pointPlayerOne] + "-Love";
	}

	public void playerOneGetPoint() {
		this.pointPlayerOne++;
	}
}
