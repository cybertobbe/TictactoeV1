package com.example.tictactoetest;

//New Branch
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class GameModelTest {
     private GameModel model;




    @Test
    @DisplayName("Test if game over when player wins")
    public void testIfGameOverWhenPlayerWins() {
        // Arrange

          model = new GameModel();
        List<String> buttonsUsed = Arrays.asList("X", "X", "X", "O", "O", "", "", "", "");

        // Act
        boolean gameOver = model.isGameOver(buttonsUsed);

        // Assert
        assertTrue(gameOver);
        assertEquals("XXX", model.getWinningLine());
        assertEquals(1, model.getPlayerPoints());
        assertEquals(0, model.getComputerPoints());
    }

      @Test
      @DisplayName("Test if game over when computer wins")
      public void testIfGameOverWhenComputerWins() {
            // Arrange

            model = new GameModel();
            List<String> buttonsUsed = Arrays.asList("O", "O", "O", "X", "X", "", "", "", "");

            // Act
            boolean gameOver = model.isGameOver(buttonsUsed);

            // Assert
            assertTrue(gameOver);
            assertEquals("OOO", model.getWinningLine());
            assertEquals(0, model.getPlayerPoints());
            assertEquals(1, model.getComputerPoints());
      }

      @Test
      @DisplayName("Test row win")
      public void testRowWin() {
            // Arrange
            model = new GameModel();
            //Test middle row  O win
            List<String> buttonsUsed = Arrays.asList("X", "O", "X", "O", "O", "O", "X", "O", "X");


            // Act and Assert
            assertTrue(model.isGameOver(buttonsUsed));

      }

      @Test
      @DisplayName("Test column win")
      public void testColumnWin() {

            model = new GameModel();
            // Test left side column X win
            List<String> buttonsUsed = Arrays.asList("X", "", "", "X", "", "", "X", "", "");



            assertTrue(model.isGameOver(buttonsUsed));
      }

      @Test
      @DisplayName("Test diagonal win")
      public void testDiagonalWin() {

            model = new GameModel();
            // Test X diagonal win
            List<String> buttonsUsed = Arrays.asList("X", "", "", "", "X", "", "", "", "X");


            assertTrue(model.isGameOver(buttonsUsed));
      }

      @Test
      @DisplayName("Test If Computer Finds A Valid Button To Play")
      void TestIfComputerFindsAValidButtonToPlay2(){

          //Arrange
            model = new GameModel();
            List<String> buttonsUsed = Arrays.asList("X", "", "", "", "X", "O", "X", "O", "X");
            int buttonClicked = 0;

            buttonClicked = model.validMove(buttonsUsed, new fixedRandom());

            assertTrue(buttonClicked >= 1 && buttonClicked <= 3);

      }



}

class fixedRandom extends Random{
      @Override
      public int nextInt(int bound) {
            return 0;
      }


}



     /* @Test
      @DisplayName("Test If Computer Finds A Valid Button To Play")
      void TestIfComputerFindsAValidButtonToPlay(){

          //Arrange
            model = new GameModel();
            List<String> buttonsUsed = Arrays.asList("X", "", "", "", "X", "O", "X", "O", "X");
            int buttonClicked = 0;

            buttonClicked = model.validMove(buttonsUsed);

            assertTrue(buttonClicked >= 1 && buttonClicked <= 3);
      }*/
