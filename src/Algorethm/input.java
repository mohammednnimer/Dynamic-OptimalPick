package Algorethm;
	

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class input extends Application {
	static Scene scene ;
	
	Button b1=new Button("From File");
	Button b2=new Button("Random Numbers");
	Button b3=new Button("Manual Entry");

	
	public Pane Pane()  {
		
		
		
		
		
		Pane p1=new Pane();
		
		Text text=new Text("Welcome to Mohammed's game");
		text.setFont(new Font(50));
		text.setLayoutX(10);
		text.setLayoutY(60);
		 text.setFill(Color.GRAY);
		 // 
		p1.setStyle("-fx-background-color:#1A0C4B;");
		
		
		Text how=new Text("How do you want to enter the numbers :");
		how.setFont(new Font(30));
		how.setLayoutY(370);
		how.setLayoutX(430);
		how.setFill(Color.GRAY);
		
		
		
        Start s1=new Start();
        
        
        
	    b1.setLayoutX(660);
	    b1.setLayoutY(500);
	    b1.setPrefWidth(200);
	    b1.setPrefHeight(50);
	    b1.setGraphicTextGap(100);
	    s1.customizeButton(b1);
	    b1.setFont(new Font(20));
	  
	
	    b2.setLayoutX(660);
	    b2.setLayoutY(500);
	    b2.setPrefWidth(200);
	    b2.setPrefHeight(50);
	    b2.setGraphicTextGap(100);
	    s1.customizeButton(b2);
	    b2.setFont(new Font(20));
	    
	    
	    
	    b3.setLayoutX(660);
	    b3.setLayoutY(500);
	    b3.setPrefWidth(200);
	    b3.setPrefHeight(50);
	    b3.setGraphicTextGap(100);
	    s1.customizeButton(b3);
	    b3.setFont(new Font(20));
	    
	    HBox v1=new HBox();
	    v1.getChildren().addAll(b1,b2,b3);
	    v1.setSpacing(100);
		v1.setLayoutY(430);
		v1.setLayoutX(330);
	    
		
		
		
		
		
		p1.getChildren().addAll(text,how,v1);
       
 return p1;
		
		
		
	}
	  
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
