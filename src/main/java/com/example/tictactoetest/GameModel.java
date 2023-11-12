package com.example.tictactoetest;

import javafx.scene.control.Button;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
//New Branch

public class GameModel {


    Random random = new Random();
    private int totalMoveCounter;
    public String winningLine = "";
    private int playerPoints;
    private int computerPoints;

    public GameModel() {

        totalMoveCounter = 0;

    }

    public void playerClick(int buttonClicked, List<Integer> buttonsUsed) {
        //This method is called from GameController when a button is clicked
        buttonsUsed.set(buttonClicked-1, buttonClicked);
        setTotalMoveCounter(getTotalMoveCounter() + 1);
        System.out.println(buttonsUsed);

    }


    public int computerPlay(List<Integer> buttonsUsed, int buttonClicked) {

        buttonClicked = random.nextInt(1, 9);
        while (buttonsUsed.get(buttonClicked-1) != 0) {
            buttonClicked = random.nextInt(1, 9);
        }
            //Computer sets -1 in int arrayList to indicate that the button is used
            buttonsUsed.set(buttonClicked-1, -1);

        setTotalMoveCounter(getTotalMoveCounter() + 1);
        System.out.println(buttonsUsed);
        return buttonClicked;

    }




    public boolean isGameOver(){
        return false;
    }

    public int getTotalMoveCounter() {
        return totalMoveCounter;
    }

    public void setTotalMoveCounter(int totalMoveCounter) {
        this.totalMoveCounter = totalMoveCounter;
    }



    public int getPlayerPoints() {
        return playerPoints;
    }

    public void setPlayerPoints(int playerPoints) {
        this.playerPoints = playerPoints;
    }

    public int getComputerPoints() {
        return computerPoints;
    }

    public void setComputerPoints(int computerPoints) {
        this.computerPoints = computerPoints;
    }
}







