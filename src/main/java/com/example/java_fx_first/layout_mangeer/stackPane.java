package com.example.java_fx_first.layout_mangeer;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class stackPane extends Application {
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage stage) throws Exception {

        StackPane stackPane = new StackPane();

        Image image = new Image(stackPane.class.getResourceAsStream("/images/Birght_Easy.jpg"));
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(600);
        imageView.setFitWidth(1000);
        stackPane.getChildren().add(imageView);

        Label label = new Label("This is Poppins");
        label.setFont(Font.font("Poppins",30));
        label.setTextFill(Color.BLACK);
        stackPane.setAlignment(label, Pos.BOTTOM_CENTER);

        stackPane.getChildren().add(label);




        Scene scene = new Scene(stackPane, 1000,500);
        stage.setScene(scene);
        stage.show();
    }
}
