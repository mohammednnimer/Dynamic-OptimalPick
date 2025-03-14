package Algorethm;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class TowType extends Application {
	static Scene scene;
	TextField t1;
	TextField from;
	TextField to;
	Button b1 = new Button("Two players");
	Button b2 = new Button("Computer");
	
	Button b3 = new Button("Reset");
	
	Button res = new Button("Reset");
	
	Button but1=new Button("but1");
	Button but2=new Button("but2");
	
	Label red=new Label("moh");
	Label Blue=new Label("moh");
	Button table=new Button("Show Table");
	Button run=new Button("Run");
	
	ArrayList<Label> labelArray=new ArrayList<>();

	public static void main(String[] args) {
		launch(args);
	}

	public void reset(Pane pane)
	{
		
		
		
		
		
		
		
		
		
	}
	
	public Pane type() {
		Pane p1 = new Pane();

		Text text = new Text("Welcome to Mohammed's game");
		text.setFont(new Font(50));
		text.setLayoutX(10);
		text.setLayoutY(60);
		text.setFill(Color.GRAY);
		p1.setStyle("-fx-background-color: #1A0C4B;");

		Text how = new Text("Please enter how do you want play the game :");
		how.setFont(new Font(25));

		how.setLayoutX(450);
		how.setLayoutY(400);
		how.setFill(Color.GRAY);

		Start s1 = new Start();
		b1.setLayoutX(550);
		b1.setLayoutY(500);
		b1.setPrefWidth(200);
		b1.setPrefHeight(50);
		b1.setGraphicTextGap(100);
		b1.setFont(new Font(20));
		s1.customizeButton(b1);

		b2.setPrefWidth(200);
		b2.setPrefHeight(50);
		b2.setGraphicTextGap(100);
		b2.setFont(new Font(20));
		s1.customizeButton(b2);

		HBox zer = new HBox();
		zer.getChildren().addAll(b1, b2);
		zer.setSpacing(20);
		zer.setLayoutX(500);
		zer.setLayoutY(430);

		b3.setPrefWidth(90);
		b3.setPrefHeight(30);
		b3.setGraphicTextGap(100);
		b3.setFont(new Font(20));
		b3.setLayoutX(1300);
		b3.setLayoutY(20);
		s1.customizeButton(b3);

		p1.getChildren().addAll(text, how, zer, b3);

		return p1;

	}
	
	public Pane towplay(ArrayList<Integer> newn)//tow Playar
	{
		
		Pane p1 = new Pane();

		Text text = new Text("Welcome to Mohammed's game");
		text.setFont(new Font(50));
		text.setLayoutX(10);
		text.setLayoutY(60);
		text.setFill(Color.GRAY);

		p1.setStyle("-fx-background-color: #1A0C4B;");

		
		
		 HBox v1=new HBox();
		 
		
		
		 for(int i=0;i<newn.size();i++)
		{
			Label label = new Label(newn.get(i)+"");

			label.setStyle("-fx-background-color: gray; " + "-fx-background-radius: 50%; " + "-fx-padding: 20px; ");

			label.setPrefWidth(60);
			label.setPrefHeight(60);
			label.setAlignment(Pos.CENTER);
			
			label.setTextFill(Color.BLACK);
			//label.setFont(new Font(8));
			labelArray.add(label);
			v1.getChildren().add(label);
			
		}
	 v1.setSpacing(10);
	 
	 p1.getChildren().addAll(v1);

	 v1.layoutBoundsProperty().addListener((observable, oldValue, newValue) -> {
	        double hboxWidth = newValue.getWidth();
	        double hboxHeight = newValue.getHeight();

	        double paneWidth = p1.getWidth();
	        double paneHeight = p1.getHeight();
	        
	        v1.setLayoutX((paneWidth - hboxWidth) / 2);
	        v1.setLayoutY((paneHeight - hboxHeight) / 2);
	    });
		
	   
	 red = new Label("0");
		red.setFont(new Font(25));
		red.setTextFill(Color.BLACK);
		red.setStyle("-fx-background-color:Red ; ");
		red.setPrefWidth(100);
		red.setPrefHeight(100);
		red.setLayoutX(40);
		red.setLayoutY(100);
		red.setAlignment(Pos.CENTER);
		 Blue = new Label("0");
		Blue.setFont(new Font(25));
		Blue.setTextFill(Color.BLACK);
		Blue.setStyle("-fx-background-color:Blue ; ");
		Blue.setPrefWidth(100);
		Blue.setPrefHeight(100);
		Blue.setLayoutX(40);
		Blue.setLayoutY(600);
		Blue.setAlignment(Pos.CENTER);
		
		
		
		Start s1 = new Start();
	
		but1.setPrefWidth(100);
		but1.setPrefHeight(50);
		but1.setGraphicTextGap(100);
		but1.setFont(new Font(20));
		but1.setStyle("-fx-background-color: #808095; "+"-fx-background-radius:  20px 0 0 20px;");
		
//		s1.customizeButton(b1);

		but2.setPrefWidth(100);
		but2.setPrefHeight(50);
		but2.setGraphicTextGap(100);
		but2.setFont(new Font(20));
		but2.setStyle("-fx-background-color: #808095; "+"-fx-background-radius: 0 20px 20px 0;");
//		s1.customizeButton(b2);

		HBox zer = new HBox();
		zer.getChildren().addAll(but1,but2);
		
		zer.setLayoutX(580);
		zer.setLayoutY(630);
		
		
		
		
		res.setPrefWidth(90);
		res.setPrefHeight(30);
		res.setGraphicTextGap(100);
		res.setFont(new Font(20));
		res.setLayoutX(1300);
		res.setLayoutY(20);
		s1.customizeButton(res);
		
		

		p1.getChildren().addAll(text, red,Blue,zer,res);

		
		
		
		return p1;
		
		
		
	}
	public Pane Computer(ArrayList<Integer> newn)
	{
		
		Pane p1 = new Pane();

		Text text = new Text("Welcome to Mohammed's game");
		text.setFont(new Font(50));
		text.setLayoutX(10);
		text.setLayoutY(60);
		text.setFill(Color.GRAY);

		p1.setStyle("-fx-background-color: #1A0C4B;");

		
		
		 HBox v1=new HBox();
		
		 for(int i=0;i<newn.size();i++)
		{
			Label label = new Label(newn.get(i)+"");

			label.setStyle("-fx-background-color: gray; " + "-fx-background-radius: 50%; " + "-fx-padding: 20px; ");

			label.setPrefWidth(60);
			label.setPrefHeight(60);
			label.setAlignment(Pos.CENTER);
			
			label.setTextFill(Color.BLACK);
		
			//label.setFont(new Font(8));
			labelArray.add(label);
		
			v1.getChildren().add(label);
			
		}
	 v1.setSpacing(10);
	 
	 p1.getChildren().addAll(v1);

	 v1.layoutBoundsProperty().addListener((observable, oldValue, newValue) -> {
	        double hboxWidth = newValue.getWidth();
	        double hboxHeight = newValue.getHeight();

	        double paneWidth = p1.getWidth();
	        double paneHeight = p1.getHeight();
	        
	        v1.setLayoutX((paneWidth - hboxWidth) / 2);
	        
	    });
	 v1.setLayoutY(400);
	
		red = new Label("0");
		red.setFont(new Font(25));
		red.setTextFill(Color.BLACK);
		red.setStyle("-fx-background-color:Red ; ");
		red.setPrefWidth(100);
		red.setPrefHeight(100);
		red.setLayoutX(40);
		red.setLayoutY(100);
		red.setAlignment(Pos.CENTER);
		 Blue = new Label("0");
		Blue.setFont(new Font(25));
		Blue.setTextFill(Color.BLACK);
		Blue.setStyle("-fx-background-color:Blue ; ");
		Blue.setPrefWidth(100);
		Blue.setPrefHeight(100);
		Blue.setLayoutX(40);
		Blue.setLayoutY(650);
		Blue.setAlignment(Pos.CENTER);
		
		
		
		Start s1 = new Start();
	
	
	table.setPrefWidth(150);
	table.setPrefHeight(50);
	table.setGraphicTextGap(100);
	table.setFont(new Font(20));
	table.setLayoutX(600);
	table.setLayoutY(700);
	s1.customizeButton(res);
	
		
		
		
		res.setPrefWidth(90);
		res.setPrefHeight(30);
		res.setGraphicTextGap(100);
		res.setFont(new Font(20));
		res.setLayoutX(1300);
		res.setLayoutY(20);
		s1.customizeButton(res);
		
		 run=new Button("Run");
		run.setPrefWidth(90);
		run.setPrefHeight(30);
		run.setGraphicTextGap(100);
		run.setFont(new Font(20));
		run.setLayoutX(1300);
		run.setLayoutY(70);
		s1.customizeButton(run);
		
		
		

		p1.getChildren().addAll(text, red,Blue,res,run,table);

		
		
		
		return p1;
		
		
		
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		Pane p1 = new Pane();

		Text text = new Text("Welcome to Mohammed's game");
		text.setFont(new Font(50));
		text.setLayoutX(10);
		text.setLayoutY(60);
		text.setFill(Color.web("#FF007A"));

		p1.setStyle("-fx-background-color: #1A0C4B;");

		Label label = new Label("hello nnnnnnmasas");

		label.setStyle("-fx-background-color: #FF007A; " + "-fx-background-radius: 50%; " + "-fx-padding: 20px; ");

		label.setPrefWidth(100);
		label.setPrefHeight(100);
	

		label.setTextFill(Color.BLACK);
		label.setFont(new Font(15));
		
		
		StackPane stackPane = new StackPane();
        stackPane.getChildren().add(label);  
        
        p1.getChildren().add(stackPane);
		
		

		 red = new Label("0");

		red.setFont(new Font(25));
		red.setTextFill(Color.BLACK);
		red.setStyle("-fx-background-color:Red ; ");
		red.setPrefWidth(100);
		red.setPrefHeight(100);
		red.setLayoutX(40);
		red.setLayoutY(600);
		red.setAlignment(Pos.CENTER);

		 Blue = new Label("0");

		Blue.setFont(new Font(25));
		Blue.setTextFill(Color.BLACK);
		Blue.setStyle("-fx-background-color:Blue ; ");
		Blue.setPrefWidth(100);
		Blue.setPrefHeight(100);
		Blue.setLayoutX(1250);
		Blue.setLayoutY(600);
		Blue.setAlignment(Pos.CENTER);
		
		
		
		Start s1 = new Start();
	
		but1.setPrefWidth(100);
		but1.setPrefHeight(50);
		but1.setGraphicTextGap(100);
		but1.setFont(new Font(20));
		but1.setStyle("-fx-background-color: #808095; "+"-fx-background-radius:  20px 0 0 20px;");
		
	//	s1.customizeButton(b1);

		but2.setPrefWidth(100);
		but2.setPrefHeight(50);
		but2.setGraphicTextGap(100);
		but2.setFont(new Font(20));
		but2.setStyle("-fx-background-color: #808095; "+"-fx-background-radius: 0 20px 20px 0;");
		//s1.customizeButton(b2);

		HBox zer = new HBox();
		zer.getChildren().addAll(but1,but2);
		
		zer.setLayoutX(580);
		zer.setLayoutY(630);
		
		b3.setPrefWidth(90);
		b3.setPrefHeight(30);
		b3.setGraphicTextGap(100);
		b3.setFont(new Font(20));
		s1.customizeButton(b3);
		b3.setLayoutX(1300);
		b3.setLayoutY(20);
		
		
		

		p1.getChildren().addAll(text, label, red,Blue,zer,b3);

		Scene scene = new Scene(p1, 1400, 800);
		arg0.setScene(scene);
		arg0.setTitle("Game");
		arg0.show();

	}

}
