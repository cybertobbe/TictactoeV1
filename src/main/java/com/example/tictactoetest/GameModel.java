package com.example.tictactoetest;

import javafx.scene.control.Button;

import java.util.*;
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

    public void playerClick(int buttonClicked, List<String> buttonsUsed) {
        //This method is called from GameController when a button is clicked
        buttonsUsed.set(buttonClicked-1, "X");
        setTotalMoveCounter(getTotalMoveCounter() + 1);
        System.out.println(buttonsUsed);

    }


    public int computerPlay(List<String> buttonsUsed, int buttonClicked) {

        buttonClicked = random.nextInt(1, 9);
        while (Objects.equals(buttonsUsed.get(buttonClicked), "X") || Objects.equals(buttonsUsed.get(buttonClicked), "O")) {
            buttonClicked = random.nextInt(1, 9);
        }
            //Computer sets in String arrayList to indicate that the button is used
            buttonsUsed.set(buttonClicked, "O");

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







