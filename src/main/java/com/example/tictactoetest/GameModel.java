package com.example.tictactoetest;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.control.Button;
import javafx.scene.image.Image;

import java.util.*;
//New Branch
// 2- Images in FXML

public class GameModel {

      public Image blank;
      public Image xImage;
      public Image oImage;

      private ObjectProperty<Image> d;
      private ObjectProperty<Image> x;
      private ObjectProperty<Image> o;

      public GameModel(){
            blank = new Image(Objects.requireNonNull(getClass().getResource("images/default.png")).toExternalForm());
            xImage = new Image(Objects.requireNonNull(getClass().getResource("images/x.png")).toExternalForm());
            oImage = new Image(Objects.requireNonNull(getClass().getResource("images/o.png")).toExternalForm());

            d = new SimpleObjectProperty<>(blank);
            x = new SimpleObjectProperty<>(xImage);
            o = new SimpleObjectProperty<>(oImage);
      }


      public Image getD() {
            return d.get();
      }

      public ObjectProperty<Image> dProperty() {
            return d;
      }

      public void setD(Image d) {
            this.d.set(d);
      }

      public Image getX() {
            return x.get();
      }

      public ObjectProperty<Image> xProperty() {
            return x;
      }

      public void setX(Image x) {
            this.x.set(x);
      }

      public Image getO() {
            return o.get();
      }

      public ObjectProperty<Image> oProperty() {
            return o;
      }

      public void setO(Image o) {
            this.o.set(o);
      }
}







