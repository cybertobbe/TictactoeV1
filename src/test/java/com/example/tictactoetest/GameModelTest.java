package com.example.tictactoetest;

//New Branch
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GameModelTest {
     private GameModel model;


      @Test
      @DisplayName("Test If Computer Finds A Valid Button To Play")
      void TestIfComputerFindsAValidButtonToPlay(){

          //Arrange
            model = new GameModel();
            List<String> buttonsUsed = Arrays.asList("X", "", "", "", "X", "O", "X", "O", "X");
            int buttonClicked = 0;

            buttonClicked = model.validMove(buttonsUsed);

            assertTrue(buttonClicked >= 1 && buttonClicked <= 3);

      }


}