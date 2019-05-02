package com.tesji.MoverTeclado;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;

public class MoverController implements Initializable {

    @FXML
    private AnchorPane anchorpane;

    @FXML
    private ImageView imagen;
int X;
int Y;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
	
		anchorpane.setOnKeyPressed(e->{
			if(e.getCode()== KeyCode.UP) {
			imagen.setTranslateY(Y-=1);
				    
			}else if(e.getCode()== KeyCode.DOWN) {
				imagen.setTranslateY(Y+=1);
			}else if(e.getCode()== KeyCode.LEFT) {
				imagen.setTranslateX(X-=1);
			}else if(e.getCode()== KeyCode.RIGHT) {
				imagen.setTranslateX(X+=1);
			
				}
				
	
			
			
		});
	}

}
