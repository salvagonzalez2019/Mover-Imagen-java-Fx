package com.tesji.mover;
import com.tesji.mover.moverController;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
		
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("moverView.fxml"));
		   Scene scene = new Scene(root,400,400);
scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());	
		primaryStage.setScene(scene); 
		scene.setOnKeyPressed(root.getOnKeyPressed());
		//scene.setOnKeyPressed(root);
		//moverController  hola= new moverController(play);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
