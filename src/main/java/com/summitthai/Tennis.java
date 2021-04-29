package com.summitthai;

public class Tennis {
    
    private int pointPlayerOne=0;
        
    
    public String getScore() {
        if(pointPlayerOne==0){
            return "Love-Love";
        }else{
            return "Fifteen-Love";
        }
    }

    public void playerOneGetPoint() {
        pointPlayerOne++;
    }
}
