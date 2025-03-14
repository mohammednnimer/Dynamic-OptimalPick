package Algorethm;

import java.io.File;
import java.util.Scanner;

import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Number extends Application {
	static Scene scene;
	TextField t1;
	TextField from;
	TextField to;
	Button b1 = new Button("Continue");
	Button b2 = new Button("Reset");
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	
	


	public Pane Random(){
		// TODO Auto-generated method stub
		Pane p1 = new Pane();

		Text text = new Text("Welcome to Mohammed's game");
		text.setFont(new Font(50));
		text.setLayoutX(10);
		text.setLayoutY(60);
		text.setFill(Color.GRAY);
		p1.setStyle("-fx-background-color: #1A0C4B;");

		Text how = new Text("Enter count of number :");
		how.setFont(new Font(30));

		how.setFill(Color.GRAY);

		t1 = new TextField();

		t1.setFont(new Font(20));

		javafx.scene.shape.Rectangle shape = new Rectangle(200, 5);
		shape.setArcWidth(30);
		shape.setArcHeight(30);
		t1.setShape(shape);
		t1.setPrefWidth(100);
		t1.setPrefHeight(20);

		HBox h1 = new HBox();
		h1.setSpacing(30);
		h1.setLayoutY(400);
		h1.setLayoutX(430);
		h1.getChildren().addAll(how, t1);

		from = new TextField();
		from.setFont(new Font(20));

		from.setShape(shape);
		from.setPrefWidth(60);
		from.setPrefHeight(20);
		to = new TextField();
		to.setFont(new Font(20));

		to.setShape(shape);
		to.setPrefWidth(60);
		to.setPrefHeight(20);

		Text fromto = new Text("Numbers from " );
		Text tofrom=new Text(" to ");
		fromto.setFont(new Font(30));

		fromto.setFill(Color.GRAY);

		tofrom.setFont(new Font(30));

		tofrom.setFill(Color.GRAY);
		
		HBox hbo=new HBox();
		
		
		

		
		
		hbo.getChildren().addAll(fromto,from,tofrom,to);
		
		hbo.setLayoutX(465);
		hbo.setLayoutY(470);
		fromto.setLayoutY(450);
		
		fromto.setLayoutX(500);

		Start s1 = new Start();
		
		b1.setPrefWidth(200);
		b1.setPrefHeight(50);
		b1.setGraphicTextGap(100);
		b1.setFont(new Font(20));
		b1.setLayoutX(550);
		b1.setLayoutY(550);
		s1.customizeButton(b1);
	
		b2.setPrefWidth(90);
		b2.setPrefHeight(30);
		b2.setGraphicTextGap(100);
		b2.setFont(new Font(20));
		b2.setLayoutX(1300);
		b2.setLayoutY(20);
		s1.customizeButton(b2);
		
		

		p1.getChildren().addAll(text, h1, hbo,b1,b2);

		return p1;

		
	}

	public Pane file() {
		// TODO Auto-generated method stub

		Pane p1 = new Pane();

		Text text = new Text("Welcome to Mohammed's game");
		text.setFont(new Font(50));
		text.setLayoutX(10);
		text.setLayoutY(60);
		text.setFill(Color.GRAY);
		p1.setStyle("-fx-background-color: #1A0C4B;");

		Text how = new Text("Enter count of number :");
		how.setFont(new Font(30));

		how.setFill(Color.GRAY);

		t1 = new TextField();

		t1.setFont(new Font(20));

		javafx.scene.shape.Rectangle shape = new Rectangle(200, 5);
		shape.setArcWidth(30);
		shape.setArcHeight(30);
		t1.setShape(shape);
		t1.setPrefWidth(100);
		t1.setPrefHeight(20);

		HBox h1 = new HBox();
		h1.setSpacing(30);
		h1.setLayoutY(400);
		h1.setLayoutX(430);
		h1.getChildren().addAll(how, t1);

		Start s1 = new Start();
		b1.setLayoutX(550);
		b1.setLayoutY(500);
		b1.setPrefWidth(200);
		b1.setPrefHeight(50);
		b1.setGraphicTextGap(100);
		b1.setFont(new Font(20));
		s1.customizeButton(b1);
		
		b2.setPrefWidth(90);
		b2.setPrefHeight(30);
		b2.setGraphicTextGap(100);
		b2.setFont(new Font(20));
		b2.setLayoutX(1300);
		b2.setLayoutY(20);
		s1.customizeButton(b2);
		
		
		
		p1.getChildren().addAll(text, h1, b1,b2);

		return p1;

	}


	public Pane manu() {
		// TODO Auto-generated method stub
				Pane p1 = new Pane();

				Text text = new Text("Welcome to Mohammed's game");
				text.setFont(new Font(50));
				text.setLayoutX(10);
				text.setLayoutY(60);
				text.setFill(Color.GRAY);
				p1.setStyle("-fx-background-color: #1A0C4B;");

				Text how = new Text("Enter The Numbers :");
				how.setFont(new Font(25));

				how.setFill(Color.GRAY);

				t1 = new TextField();

				t1.setFont(new Font(20));

				javafx.scene.shape.Rectangle shape = new Rectangle(200, 5);
				shape.setArcWidth(30);
				shape.setArcHeight(70);
				t1.setShape(shape);
				t1.setPrefWidth(300);
				t1.setPrefHeight(20);

				HBox h1 = new HBox();
				h1.setSpacing(30);
				h1.setLayoutY(400);
				h1.setLayoutX(430);
				h1.getChildren().addAll(how, t1);


				

				Start s1 = new Start();
				b1.setLayoutX(600);
				b1.setLayoutY(500);
				b1.setPrefWidth(200);
				b1.setPrefHeight(50);
				b1.setGraphicTextGap(100);
				b1.setFont(new Font(20));
				s1.customizeButton(b1);
				
				b2.setPrefWidth(90);
				b2.setPrefHeight(30);
				b2.setGraphicTextGap(100);
				b2.setFont(new Font(20));
				b2.setLayoutX(1300);
				b2.setLayoutY(20);
				s1.customizeButton(b2);
				
				
				
				

				p1.getChildren().addAll(text, h1 , b1,b2);

		return p1;
		
		

		
	}





	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub

       
}
}