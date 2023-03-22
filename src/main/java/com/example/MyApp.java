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
		// 発展課題2b：中央揃え
		label.setStyle("-fx-font-size: 60px; -fx-font-weight: bold; -fx-alignment: center; -fx-pref-width: 640;");
		
		/**
		 * 発展課題2b：中央揃え別解１。すべてメソッドで書く
		label.setFont(Font.font("", FontWeight.BOLD, FontPosture.REGULAR, 60));
		label.setAlignment(Pos.CENTER);
		label.setPrefWidth(640);
		*/
			
		var bPane = new BorderPane();
		// 発展課題2a
		bPane.setBottom(label);
		/**
		 * 発展課題2b：中央揃え別解2。BorderPaneの子要素 label の配置を変更。
		label.setStyle("-fx-font-size: 60px; -fx-font-weight: bold;");
		BorderPane.setAlignment(label, Pos.CENTER);
		*/

		var scene = new Scene(bPane, 640, 480);
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch();
	}

}