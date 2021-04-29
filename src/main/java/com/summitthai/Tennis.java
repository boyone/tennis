package com.summitthai;

public class Tennis {
    
	private static final String[] POINT_NAMES = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
	
    private int pointPlayerOne=0;
    
    public String getScore() {
        return Tennis.POINT_NAMES[pointPlayerOne] + "-Love";
    }

    public void playerOneGetPoint() {
        pointPlayerOne++;
    }
}
