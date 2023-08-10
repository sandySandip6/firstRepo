package com.example.java_fx_first.layout_mangeer;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class gridPane extends Application {
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage stage) throws Exception {
        GridPane gridPane = new GridPane();

        Button button = new Button("hello1");
        Button button1 = new Button("hello2");
        Button button2 = new Button("hello3");
        Button button3 = new Button("hello4");
        Button button4 = new Button("hello5");
        Button button5 = new Button("hello6");

        gridPane.add(button,0,2,1,1);
        gridPane.add(button1,0,0,1,1);
        gridPane.add(button2,1,1,1,1);
        gridPane.add(button3,1,2,1,2);
        gridPane.add(button4,0,1,1,1);
        gridPane.add(button5,0,2,1,1);

        Scene scene = new Scene(gridPane,400,300);
        stage.setScene(scene);
        stage.show();
    }
}
