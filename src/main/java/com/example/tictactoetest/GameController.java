package com.example.tictactoetest;



import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//New Branch
// 2 - Images in FXML

public class GameController {


      public Label playerPoints;
      public Label moveCounter;
      public Label computerPoints;
      public Button resetGame;
      public Button newGame;
      public Image one;
      public Image two;
      public Image three;
      public Image four;
      public Image five;
      public Image six;
      public Image seven;
      public Image eight;
      public Image nine;


      public void initialize(){

      }


      public void clicked(MouseEvent mouseEvent){
            if(mouseEvent.getSource() == one){
                  ImageView imageView = (ImageView) mouseEvent.getSource();


            }
      }
}