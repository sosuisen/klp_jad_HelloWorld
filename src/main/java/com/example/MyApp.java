package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MyApp extends Application {

	@Override
	public void start(Stage stage) {
		var javaVersion = System.getProperty("java.version");
		var javafxVersion = System.getProperty("javafx.version");

		var label = new Label("Hello, KCG");
		// 発展課題：中央揃え
		label.setStyle("-fx-font-size: 60px; -fx-font-weight: bold; -fx-alignment: center; -fx-pref-width: 640;");

		/**
		 * 別解。すべてメソッドで書く
		 */
		/*
		label.setStyle("-fx-font-size: 60px; -fx-font-weight: bold;");
		label.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 60));
		label.setAlignment(Pos.CENTER);
		label.setPrefWidth(640);
		 */
			
		var bPane = new BorderPane();
		// 発展課題
		bPane.setBottom(label);

		var scene = new Scene(bPane, 640, 480);
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch();
	}

}