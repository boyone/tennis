package com.summitthai;

public class Tennis {
    
    private int pointPlayerOne=0;
        
    
    public String getScore() {
    	
    	if(pointPlayerOne == 2) {
            return "Thirty-Love";
    	} 
    		
        if(pointPlayerOne == 1) {
            return "Fifteen-Love";
        } 
    	
        return "Love-Love";
    }

    public void playerOneGetPoint() {
        pointPlayerOne++;
    }
}
