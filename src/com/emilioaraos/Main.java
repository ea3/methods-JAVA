package com.emilioaraos;



public class Main {

    public static void main(String[] args) {


        int highScore= calculateScore(true, 800, 5, 100);
        System.out.println("Your Final Score was: " + highScore);
        calculateScore(true, 10000, 8, 200);

        displayHighScorePosition("Emilio", 1500);
        int scorePosition= calculateHighScorePosition(1500);
        System.out.println("Player is in position: " + scorePosition );





    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus ){


        if(gameOver){
            int finalScore = score + (levelCompleted* bonus);
            finalScore += 1000;
            return finalScore;
        }else{
            return -1;
        }


    }

    public static void displayHighScorePosition(String name, int position){

        System.out.println("Player "+ name + " managed to get into position "+ position+ " on the highscore table ");
    }

    public static int calculateHighScorePosition(int score){
        if(score>1000){
            return 1;
        }else if(score > 500 && score < 1000){
            return 2;
        }else if(score >100 && score < 500 ){
            return 3;
        }else{
            return 4;
        }
    }



}
