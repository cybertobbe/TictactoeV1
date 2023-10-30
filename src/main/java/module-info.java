module com.example.tictactoetest {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.internal.le;


    opens com.example.tictactoetest to javafx.fxml;
    exports com.example.tictactoetest;
}