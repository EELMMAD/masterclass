package se.udemy.elmira.expressionsStatmentsCodeblockMethods;

public class Method {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelComplete = 5;
        int bonus = 100;

     int highScore = calculateScore(gameOver, score, levelComplete, bonus);
        System.out.println("Your Final score was " + highScore);

         score = 10000;
         levelComplete = 8;
         bonus = 200;

         highScore = calculateScore(gameOver, score, levelComplete, bonus);
        System.out.println("Your Final score was " + highScore);


        int highScorePosition = calculateHighPosition(1500);
        displayHighScorePosition("Tim" , highScorePosition);

        highScorePosition = calculateHighPosition(900);
        displayHighScorePosition("Bob" , highScorePosition);

        highScorePosition = calculateHighPosition(400);
        displayHighScorePosition("Percy" , highScorePosition);

        highScorePosition = calculateHighPosition(50);
        displayHighScorePosition("Gilbert" , highScorePosition);

        highScorePosition = calculateHighPosition(1000);
        displayHighScorePosition("Louise" , highScorePosition);

        highScorePosition = calculateHighPosition(500);
        displayHighScorePosition("Carol" , highScorePosition);

        highScorePosition = calculateHighPosition(100);
        displayHighScorePosition("Frank" , highScorePosition);


    }

    //Create a method called displayHighScorePosition
    //it should a players name as a parameter, and a 2nd parameter as a position in the high score table
    //You should display the players name along with a message like "managed to get into position " and the
    //position they got and a further message "On the high score table ".
    //
    //Create a 2nd method called calculateHighPosition
    //It should be sent one argument only, the player score
    //It should return an int
    //the return data should be
    //1 if the score is >= 1000
    //2 if the score is >= 500 and < 1000
    //3 if the score is >= 100 and < 500
    //in all other cases
    //call both methods and display the results of the following
    //a score of 1500, 900, 400, and 50
    //

    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println( playerName + " managed to get into position "
                           + highScorePosition + "On the high score table");
    }

    public static int calculateHighPosition(int playersScore){
        /*
        if(playersScore >= 1000){
            return 1;
        }else if(playersScore >= 500){
           return 2;
        }else if(playersScore >= 100){
            return 3;
        }
            return 4;
         */

    int position = 4; //assuming position 4 will be returned
      if(playersScore >= 1000){
          position = 1;
    }else if(playersScore >= 500){
          position = 2;
    }else if(playersScore >= 100){
          position =3;
    }
      return position;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted,int bonus ){
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    }


