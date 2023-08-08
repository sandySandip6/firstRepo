package com.example.java_fx_first.layout_mangeer;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class borderPane_demo extends Application {
    public static void main(String[] args) {
    launch();
    }

    private Button createBtn(String buttonLabel){
        Button btn = new Button(buttonLabel);
        btn.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        btn.setMinSize(100,100);
        btn.setAlignment(Pos.CENTER);
        BorderPane.setMargin(btn, new Insets(5));
        return btn;
    }
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane borderPane = new BorderPane();
        Button leftBtn =createBtn("Left");
        Button rightBtn = createBtn("Right");
        Button topBtn = createBtn("Top");
        Button bottomBtn = createBtn("Bottom");
        Button centerBtn = createBtn("Center");

        borderPane.setRight(rightBtn);
        borderPane.setLeft(leftBtn);
        borderPane.setTop(topBtn);
        borderPane.setBottom(bottomBtn);
        borderPane.setCenter(centerBtn);

        Scene scene = new Scene(borderPane, 600, 400);
        stage.setScene(scene);


        stage.show();
    }
}
