package com.example.java_fx_first.layout_mangeer;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class flowPane extends Application {
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage stage) throws Exception {
        FlowPane flowPane = new FlowPane();
        for (int i = 1; i < 20 ; i++){
            Button button = new Button("hello");
            flowPane.getChildren().add(button);
        }
        flowPane.setOrientation(Orientation.HORIZONTAL);
        Scene scene = new Scene(flowPane, 500,400);
        stage.setScene(scene);
        stage.show();
    }
}
