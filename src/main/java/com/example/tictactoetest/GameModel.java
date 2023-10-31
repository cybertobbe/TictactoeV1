package com.example.tictactoetest;


import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.util.List;
import java.util.Random;





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


    }

    //is this called every second time?
    public void computerPlay(List<Button> buttons) {


        int randomButton = 0;
        int i = 0;


        randomButton = random.nextInt(1, 9);
        boolean buttonSet = false;

        while (!buttonSet) {
            for (i = 0; i < buttons.size(); i++) {
                if (i == randomButton && !buttons.get(i).isDisabled()) {
                    buttons.get(i).setText("O");
                    buttons.get(i).setDisable(true);
                    buttonSet = true;
                    break;
                }
            }
            if (!buttonSet) {
                randomButton = random.nextInt(1, 9);
            }
        }
    }

    public int getTotalMoveCounter() {
        return totalMoveCounter;
    }
    public void setTotalMoveCounter(int totalMoveCounter) {
        this.totalMoveCounter = totalMoveCounter;
    }

    public void checkWin(List<Button> buttons){
        if(buttons.get(1) == buttons.get(2) && buttons.get(2) == buttons.get(3)) {
            gameOver = true;
        }
        else if(buttons.get(4) == buttons.get(5) && buttons.get(5) == buttons.get(6)) {
            gameOver = true;
        }
        else if(buttons.get(7) == buttons.get(8) && buttons.get(8) == buttons.get(9)) {
            gameOver = true;
        }
        else if(buttons.get(1) == buttons.get(4) && buttons.get(4) == buttons.get(7)){
            gameOver = true;
        }
        else if(buttons.get(2) == buttons.get(5) && buttons.get(5) == buttons.get(8)) {
            gameOver = true;
        }
        else if(buttons.get(3) == buttons.get(6) && buttons.get(6) == buttons.get(9)) {
            gameOver = true;
        }
        else if(buttons.get(1) == buttons.get(5) && buttons.get(5) == buttons.get(9)){
            gameOver = true;
        }
        else if(buttons.get(3) == buttons.get(5) && buttons.get(5) == buttons.get(7)){
            gameOver = true;
        }

        else if(totalMoveCounter == 9){
            gameOver = true;
        }
        else{
            gameOver = false;
        }
    }




}
