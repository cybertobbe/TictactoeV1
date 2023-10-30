package com.example.tictactoetest;


import java.util.Random;

import static jdk.internal.org.jline.utils.InfoCmp.Capability.buttons;


public class GameModel {


    Random random = new Random();

    private final String player1 = "Tobias";
    private boolean gameOver;
    private int totalMoveCounter;




    public GameModel() {
        gameOver = false;
        totalMoveCounter = 0;

    }




    public void playerClick(int buttonClicked) {

        //This method is called from GameController when a button is clicked
        setTotalMoveCounter(getTotalMoveCounter() + 1);
        if(getTotalMoveCounter()%2 != 0){
            computerPlay();

        }


    }

    //is this called every second time?
    public void computerPlay(){
        int randomButton = random.nextInt(1,9);




    }

    public int getTotalMoveCounter() {
        return totalMoveCounter;
    }
    public void setTotalMoveCounter(int totalMoveCounter) {
        this.totalMoveCounter = totalMoveCounter;
    }


}
