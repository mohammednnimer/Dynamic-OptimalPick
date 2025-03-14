package Algorethm;
	

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Start extends Application {

	
	
	 Button start = new Button("Start Game");
	public  Pane pane(){
		
		
		ImageView image1=new ImageView("image.png");
	image1.setFitWidth(1400);
	image1.setFitHeight(800);
		
	
	    Text text = new Text("Hello Game using Dynamic Programming");
	    
	    text.setStyle("-fx-font-size: 40px");
	    text.setFill(Color.GRAY);
	    text.setFont(Font.font("Verdana", 40));
	    
	    text.setLayoutX(320);
	    
	    text.setLayoutY(540);
	    
	    

	    start.setVisible(false);
	    start.setLayoutX(630);
	    start.setLayoutY(500);
	    start.setPrefWidth(150);
	    start.setPrefHeight(50);
	    start.setGraphicTextGap(100);
	    start.setFont(new Font(20));
	    customizeButton(start);
	    
	    
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(3), text);
        fadeTransition.setFromValue(1.0);
        fadeTransition.setToValue(0.0); 
        fadeTransition.setCycleCount(1); 
        fadeTransition.setAutoReverse(false);
       
        fadeTransition.play();
       
        fadeTransition.setOnFinished(e ->
        {
        	 start.setVisible(true);	
        });
        
 
        Pane p1=new Pane();
        p1.getChildren().addAll(image1,text,start);    
        
        return  p1;
 
		
	}
	  public void customizeButton(Button button) {
	        button.setStyle(" fx-font-size: 20px ;  -fx-text-fill: BLACK;");
	        javafx.scene.shape.Rectangle shape = new Rectangle(200, 40);  
	        shape.setArcWidth(30); 
	        shape.setArcHeight(30);
	        button.setShape(shape); 
	        
	       
	    }
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}
	

}
