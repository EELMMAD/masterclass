package se.udemy.elmira.expressionsStatmentsCodeblockMethods;

public class Challenge01 {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        /*
        if(score < 5000 && score > 1000){
            System.out.println("Your score was less than 5000 but greater than 1000");
        }else if(score < 1000){
            System.out.println("Your score was less than 1000");
        }else{
            System.out.println("Got here");
        }
         */

        if(gameOver == true){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }


        //Print out a second score on the screen with the following
        //score set to 10000
        //level completed set to 8
        //bonus set to 200
        //But make sure that first printout above still display as well
/*
        boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;

        if(newGameOver == true){
            int finalScore = newScore + (newLevelCompleted * newBonus);
            System.out.println("Your final score was " + finalScore);
        }
 */
         score = 10000;
         levelCompleted = 8;
         bonus = 200;

        if(gameOver == true){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
