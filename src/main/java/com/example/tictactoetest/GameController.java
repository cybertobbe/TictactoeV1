package com.example.tictactoetest;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



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

    }


    //FXML methods

    public void clicked(MouseEvent mouseEvent) {
        int buttonClicked = 0;


        //Switch case preferred
        if(mouseEvent.getSource() == one){
            one.setText("X");
            one.setDisable(true);
            buttonClicked = 1;
            gameModel.playerClick(buttonClicked);
        }
        else if(mouseEvent.getSource() == two){
            two.setText("X");
            two.setDisable(true);
            buttonClicked = 2;
            gameModel.playerClick(buttonClicked);
        }
        else if(mouseEvent.getSource() == three){
            three.setText("X");
            three.setDisable(true);
            buttonClicked = 3;
            gameModel.playerClick(buttonClicked);
        }
        else if(mouseEvent.getSource() == four){
            four.setText("X");
            four.setDisable(true);
            buttonClicked = 4;
            gameModel.playerClick(buttonClicked);
        }
        else if(mouseEvent.getSource() == five){
            five.setText("X");
            five.setDisable(true);
            buttonClicked = 5;
            gameModel.playerClick(buttonClicked);
        }
        else if(mouseEvent.getSource() == six){
            six.setText("X");
            six.setDisable(true);
            buttonClicked = 6;
            gameModel.playerClick(buttonClicked);
        }
        else if(mouseEvent.getSource() == seven){
            seven.setText("X");
            seven.setDisable(true);
            buttonClicked = 7;
            gameModel.playerClick(buttonClicked);
        }
        else if(mouseEvent.getSource() == eight){
            eight.setText("X");
            eight.setDisable(true);
            buttonClicked = 8;
            gameModel.playerClick(buttonClicked);

        }
        else if(mouseEvent.getSource() == nine){
            nine.setText("X");
            nine.setDisable(true);
            buttonClicked = 9;
            gameModel.playerClick(buttonClicked);
        }
        moveCounter.setText("Moves: " + gameModel.getTotalMoveCounter());

        if(getGameModel().getTotalMoveCounter()%2 != 0){
            getGameModel().computerPlay(buttons);
        }
    }



    // all variables resets to default?

    public void resetGameOnClick(MouseEvent mouseEvent) throws IOException {
        //Game plan sets back to defaults
        buttons.forEach(button -> {
            button.setText("");
            button.setDisable(false);
        });
        gameModel.setTotalMoveCounter(0);
        playerPoints.setText("Player points " + gameModel.getTotalMoveCounter());
        moveCounter.setText("Moves: " + gameModel.getTotalMoveCounter());
        computerPoints.setText("Computer points " + gameModel.getTotalMoveCounter());


    }






}