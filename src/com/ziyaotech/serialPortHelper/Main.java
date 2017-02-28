package com.ziyaotech.serialPortHelper;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("serialPortHelper.fxml"));
        primaryStage.setTitle("串口助手(跨平台版)");
        primaryStage.setScene(new Scene(root));
        primaryStage.initStyle(StageStyle.UTILITY);//设定窗口边框
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
