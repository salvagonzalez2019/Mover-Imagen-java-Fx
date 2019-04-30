package com.tesji.mover;

import java.net.URL;
import java.util.ResourceBundle;
import com.tesji.mover.*;

import javafx.animation.TranslateTransition;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class moverController implements Initializable {

	@FXML
	private AnchorPane anchorpanel;

	@FXML
	private ImageView player;
	final int STEP_SIZE = 65;
	final Duration DURATION = Duration.millis(2);
	public TranslateTransition transition = new TranslateTransition(DURATION,player);
	private double startDragX=0;
	private double startDragY=0;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		{
			

			anchorpanel.setOnMousePressed(e -> {
				startDragX = e.getSceneX();
				startDragY = e.getSceneY();
			});

			anchorpanel.setOnMouseDragged(e -> {
				player.setTranslateX(e.getSceneX() - startDragX);
				player.setTranslateY(e.getSceneY() - startDragY);
			});

			 anchorpanel.setOnKeyPressed(e -> {
		            switch(e.getCode())
		            {

		                case UP:
		                {
		               
			                    player.setTranslateY(startDragY-=1);
                 
		                } break;
		                case DOWN:
		                {
		                 player.setTranslateY(startDragY+=1);
		               
		                    
		                } break;
		                case LEFT:
		                {
		               
		                    player.setTranslateX(startDragX-=1);


		                } break;
		                case RIGHT:
		                { 
		                	player.setTranslateX(startDragX+=1);
			                  
		                } break;

		             
		                default:break;

		            }
		        });
			
		}
	}

	
}
/*
 * 	switch (e.getCode()) {
				case A:
					transition.setFromX(player.getTranslateX());
					transition.setFromY(player.getTranslateY());
					transition.setToX(player.getTranslateX());
					transition.setToY(player.getTranslateY() - STEP_SIZE);
					transition.playFromStart();
					System.out.println("hola que ase");
					break;

				default:
					break;
				}

			});
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * imagen.setOnKeyPressed(e -> { switch(e.getCode()) {
 * 
 * case UP: {
 * 
 * transition.setFromX(player.getTranslateX());
 * transition.setFromY(player.getTranslateY());
 * transition.setToX(player.getTranslateX());
 * transition.setToY(player.getTranslateY() - STEP_SIZE);
 * transition.playFromStart();
 * 
 * } break; case DOWN: {
 * 
 * transition.setFromX(player.getTranslateX());
 * transition.setFromY(player.getTranslateY());
 * transition.setToX(player.getTranslateX());
 * transition.setToY(player.getTranslateY() + STEP_SIZE);
 * transition.playFromStart();
 * 
 * } break; case LEFT: {
 * 
 * transition.setFromX(player.getTranslateX());
 * transition.setFromY(player.getTranslateY());
 * transition.setToX(player.getTranslateX() - STEP_SIZE);
 * transition.setToY(player.getTranslateY()); transition.playFromStart();
 * 
 * } break; case RIGHT: {
 * 
 * transition.setFromX(player.getTranslateX());
 * transition.setFromY(player.getTranslateY());
 * transition.setToX(player.getTranslateX() + STEP_SIZE);
 * transition.setToY(player.getTranslateY()); transition.playFromStart();
 * 
 * } break;
 * 
 * default:break;
 * 
 * } });
 */
