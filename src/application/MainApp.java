package application;

import java.io.IOException;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.AppController;

public class MainApp extends Application {
	

	private AnchorPane root;
	private AppController controller;
	
	public void changeView(String path) {
		
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(path));
			AnchorPane pane = (AnchorPane) loader.load();
			
			controller = loader.getController();
			controller.setMainApp(this);
			
			root.getChildren().clear();
			root.getChildren().add(pane);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void start(Stage stage) {
		try {
			
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/Login.fxml"));
			root = (AnchorPane) loader.load();

			
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();	
			stage.setResizable(false);
			
			changeView("../view/Login.fxml");
		}

		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		launch(MainApp.class, args);
	}
}
