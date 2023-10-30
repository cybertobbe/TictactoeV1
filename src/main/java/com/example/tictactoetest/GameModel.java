package com.example.tictactoetest;


import javafx.scene.control.Button;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

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



    }

    //is this called every second time?
    public void computerPlay(List<Button> buttons){
        int randomButton = random.nextInt(1,9);

        //if button is not taken, take it
        //if button is taken, try again
        //if all buttons are taken, game over
        for(int i = 0; i < buttons.size(); i++){
            if(buttons.get(i).getText().isEmpty()){
                buttons.get(i).setText("O");
                buttons.get(i).setDisable(true);
                break;
            }
            else if(i == buttons.size()-1){
                gameOver = true;
            }
        }


    }

    public int getTotalMoveCounter() {
        return totalMoveCounter;
    }
    public void setTotalMoveCounter(int totalMoveCounter) {
        this.totalMoveCounter = totalMoveCounter;
    }


}
