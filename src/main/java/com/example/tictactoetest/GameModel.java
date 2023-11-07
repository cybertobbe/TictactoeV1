package com.example.tictactoetest;

import javafx.scene.control.Button;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
//New Branch
//

public class GameModel {


    Random random = new Random();
    private int totalMoveCounter;
    public String winningLine = "";
    private int playerPoints;
    private int computerPoints;

    public GameModel() {

        totalMoveCounter = 0;

    }

    public void playerClick(int buttonClicked) {
        //This method is called from GameController when a button is clicked

        setTotalMoveCounter(getTotalMoveCounter() + 1);

    }


    public void computerPlay(List<Button> buttons) {


        int randomButton = 0;
        int i = 0;


        randomButton = random.nextInt(1, 9);

        buttons.get(randomButton).setText("O");
        buttons.get(randomButton).setDisable(true);

        setTotalMoveCounter(getTotalMoveCounter() + 1);


    }

    public int getTotalMoveCounter() {
        return totalMoveCounter;
    }

    public void setTotalMoveCounter(int totalMoveCounter) {
        this.totalMoveCounter = totalMoveCounter;
    }

    public boolean isGameOver(List<Button> buttons){
        String row1 = buttons.get(0).getText() + buttons.get(1).getText() + buttons.get(2).getText();
        String row2 = buttons.get(3).getText() + buttons.get(4).getText() + buttons.get(5).getText();
        String row3 = buttons.get(6).getText() + buttons.get(7).getText() + buttons.get(8).getText();
        String col1 = buttons.get(0).getText() + buttons.get(3).getText() + buttons.get(6).getText();
        String col2 = buttons.get(1).getText() + buttons.get(4).getText() + buttons.get(7).getText();
        String col3 = buttons.get(2).getText() + buttons.get(5).getText() + buttons.get(8).getText();
        String diag1 = buttons.get(0).getText() + buttons.get(4).getText() + buttons.get(8).getText();
        String diag2 = buttons.get(2).getText() + buttons.get(4).getText() + buttons.get(6).getText();

        if(row1.contentEquals("XXX") || row2.contentEquals("XXX") || row3.contentEquals("XXX") || col1.contentEquals("XXX") || col2.contentEquals("XXX") || col3.contentEquals("XXX") || diag1.contentEquals("XXX") || diag2.contentEquals("XXX")) {
            winningLine = "XXX";
            setPlayerPoints(getPlayerPoints() + 1);
            return true;
        }

        else if(row2.contentEquals("OOO") || row2.contentEquals("OOO") || row3.contentEquals("OOO") || col1.contentEquals("OOO") || col2.contentEquals("OOO") || col3.contentEquals("OOO") || diag1.contentEquals("OOO") || diag2.contentEquals("OOO")) {
            winningLine = "OOO";
            setComputerPoints(getComputerPoints() + 1);
            return true;
        }

        else if(getTotalMoveCounter() == 9){
            winningLine = "Draw";
            return true;
        }
        else{
            return false;
        }

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







