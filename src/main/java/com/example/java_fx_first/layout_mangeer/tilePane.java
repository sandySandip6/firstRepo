package com.example.java_fx_first.layout_mangeer;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class tilePane extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        TilePane tilePane = new TilePane();
        for (int i = 1; i < 20 ; i++){
            Button button = new Button("hello"+i);
            tilePane.getChildren().add(button);
        }
        tilePane.setOrientation(Orientation.HORIZONTAL);
        Scene scene = new Scene(tilePane, 500,400);
        stage.setScene(scene);
        stage.show();
    }

}
