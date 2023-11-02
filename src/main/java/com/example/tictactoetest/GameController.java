package com.example.tictactoetest;

import javafx.application.Platform;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class GameController {

    //FXML connections
    public Button one;
    public Button two;
    public Button three;
    public Button four;
    public Button five;
    public Button six;
    public Button seven;
    public Button eight;
    public Button nine;
    public Button resetGame;
    public Button newGame;
    public Label moveCounter;
    public Label playerPoints;
    public Label computerPoints;
    public List<Button> buttons = new ArrayList<>();

    private final GameModel gameModel = new GameModel();



    public GameController() {

    }

    public GameModel getGameModel() {
        return gameModel;
    }


    public void initialize(){
        //Runs after constructor, which doesn't see fxml files.
        //Initialize runs after FXML is loaded and have access to them.
        buttons = Arrays.asList(one, two, three, four, five, six, seven, eight, nine);
        buttons.forEach(button -> button.setFocusTraversable(false));
        //Set counter to 0
        playerPoints.setText("Player points " + gameModel.getPlayerPoints());
        moveCounter.setText("Moves: " + gameModel.getTotalMoveCounter());
        computerPoints.setText("Computer points " + gameModel.getComputerPoints());
    }


    //PLayer plays
    public void clicked(MouseEvent mouseEvent) {
        int buttonClicked = 0;

                if (mouseEvent.getSource() == one) {
                    one.setText("X");
                    one.setDisable(true);
                    buttonClicked = 1;
                    gameModel.playerClick(buttonClicked);
                } else if (mouseEvent.getSource() == two) {
                    two.setText("X");
                    two.setDisable(true);
                    buttonClicked = 2;
                    gameModel.playerClick(buttonClicked);
                } else if (mouseEvent.getSource() == three) {
                    three.setText("X");
                    three.setDisable(true);
                    buttonClicked = 3;
                    gameModel.playerClick(buttonClicked);
                } else if (mouseEvent.getSource() == four) {
                    four.setText("X");
                    four.setDisable(true);
                    buttonClicked = 4;
                    gameModel.playerClick(buttonClicked);
                } else if (mouseEvent.getSource() == five) {
                    five.setText("X");
                    five.setDisable(true);
                    buttonClicked = 5;
                    gameModel.playerClick(buttonClicked);
                } else if (mouseEvent.getSource() == six) {
                    six.setText("X");
                    six.setDisable(true);
                    buttonClicked = 6;
                    gameModel.playerClick(buttonClicked);
                } else if (mouseEvent.getSource() == seven) {
                    seven.setText("X");
                    seven.setDisable(true);
                    buttonClicked = 7;
                    gameModel.playerClick(buttonClicked);
                } else if (mouseEvent.getSource() == eight) {
                    eight.setText("X");
                    eight.setDisable(true);
                    buttonClicked = 8;
                    gameModel.playerClick(buttonClicked);

                } else if (mouseEvent.getSource() == nine) {
                    nine.setText("X");
                    nine.setDisable(true);
                    buttonClicked = 9;
                    gameModel.playerClick(buttonClicked);
                }
                moveCounter.setText("Moves: " + gameModel.getTotalMoveCounter());

        //check if there is a winner after player plays
                if(gameModel.isGameOver(buttons)) {
                    buttons.forEach(button -> button.setDisable(true));
                    updatePoints();
                    return;
                }

        //Computer plays
                gameModel.computerPlay(buttons);
        //check if there is a winner after computer plays
                if(gameModel.isGameOver(buttons)) {
                    buttons.forEach(button -> button.setDisable(true));
                    if(gameModel.winningLine.contentEquals("XXX")){
                            updatePoints();
                    }
                    else if(gameModel.winningLine.contentEquals("OOO")){
                            updatePoints();



                    }

                    return;
                }
        //check if there is a draw
                    else if(gameModel.getTotalMoveCounter() == 9){
                        buttons.forEach(button -> button.setDisable(true));
                        return;
                    }

        //Print number of moves
                moveCounter.setText("Moves: " + gameModel.getTotalMoveCounter());


    }




    private void updatePoints() {
        playerPoints.setText("Player points " + gameModel.getPlayerPoints());
        computerPoints.setText("Computer points " + gameModel.getComputerPoints());
    }


    //Reset game board and points
    public void resetGameOnClick(MouseEvent mouseEvent) throws IOException {
        //Game plan sets back to defaults
        buttons.forEach(button -> {
            button.setText("");
            button.setDisable(false);
        });
        gameModel.setTotalMoveCounter(0);
        gameModel.setPlayerPoints(0);
        gameModel.setComputerPoints(0);
        playerPoints.setText("Player points " + gameModel.getTotalMoveCounter());
        moveCounter.setText("Moves: " + gameModel.getTotalMoveCounter());
        computerPoints.setText("Computer points " + gameModel.getTotalMoveCounter());




    }
    //Reset game board  for new game but keep points
    public void newGameOnClick(MouseEvent mouseEvent) {
        buttons.forEach(button -> {
            button.setText("");
            button.setDisable(false);
        });
        gameModel.setTotalMoveCounter(0);
        moveCounter.setText("Moves: " + gameModel.getTotalMoveCounter());
    }
}