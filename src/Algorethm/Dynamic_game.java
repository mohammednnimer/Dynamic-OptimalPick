package Algorethm;

import java.text.BreakIterator;
import java.util.ArrayList;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Dynamic_game extends Application {

	int[][] newn;
	TextField t1;
	TextField from;
	TextField to;
	Button b1 = new Button("Two players");
	Button b2 = new Button("Computer");

	Button b3 = new Button("Reset");

	Button res = new Button("Reset");

	ArrayList<Label> labelArray = new ArrayList<>();

	Label red = new Label("moh");
	Label Blue = new Label("moh");

	public static void main(String[] args) {
		launch(args);
	}

	public int[] main(int[] n) {
//	secande[i][i] = 0;
		
		
		
//		newn[j][i] = Math.max(secande[j][i - 1] + (n[i]), secande[j + 1][i] + (n[j]));
//		if (newn[j][i] == (secande[j][i - 1] + (n[i]))) {
//			secande[j][i] = newn[j][i - 1];
//		} else {
//			secande[j][i] = newn[j + 1][i];
//		}
		
		newn = new int[n.length][n.length];

		int[][] secande = new int[n.length][n.length];

		for (int i = 0; i < newn.length; i++) {
			newn[i][i] = n[i];
		
		}
		for(int i=0;i<newn.length-1;i++)
		{
			int j=i+1;
			newn[i][j]=Math.max(n[i], n[j]);
		}
        
		
	
		
		for (int i = 0; i < n.length; i++) {
			for (int j = i - 2; j >= 0; j--) {		
				
				newn[j][i]=Math.max(n[i]+Math.min(newn[j][i-2], newn[j+1][i-1]),n[j]+Math.min(newn[j+2][i], newn[j+1][i-1]));
			
			}

		}

		for (int i = 0; i < newn.length; i++) {

			for (int j = 0; j < newn.length; j++) {

				System.out.print(newn[i][j] + "   ");
			}

			System.out.println();
		}

		System.out.println();
		int[] a = found(newn);
		return a;

	}

	public static int[] found(int a[][]) {
		int i = a.length - 1;
		int j = 0;
		int[] num = new int[a.length];
		
		
		
		System.out.println();
		System.out.println();
		

		int counter = 0;
		for (; counter < num.length;) {
//			if (i == 0 || j == a.length - 1) {
//				num[counter] = a[i][j];
//				
//				break;
//			}
			
			if(i==j)
			{
              num[counter] = j;
			  break;	
			}
			

			if (a[j + 1][i] > a[j][i - 1]) {

				num[counter] = i;
				counter++;

				i--;

			} else if (a[j + 1][i] < a[j][i - 1]) {

				num[counter] = j;
				counter++;
				j++;

			} else {
				if (a[j][j] >= a[i][i]) {
					num[counter] = j;
					j++;
				} else {
					num[counter] = i;
					i--;
				}
				counter++;

			}



		}

		for (int nu = 0; nu < num.length; nu++) {
    System.out.println(num[nu]);
		}

		return num;

	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub

	}

}

//if (i == 0 || j == a.length - 1) {
//num[counter] = a[i][j];
//break;
//}
//
//if (a[j + 1][i] > a[j][i - 1]) {
//
//num[counter] = a[i][i];
//counter++;
//
//i--;
//
//} else if (a[j + 1][i] < a[j][i - 1]) {
//
//num[counter] = a[j][j];
//counter++;
//j++;
//
//} else {
//if (a[j][j] >= a[i][i]) {
//
//	num[counter] = a[j][j];
//
//	j++;
//} else {
//	num[counter] = a[i][i];
//
//	i--;
//
//}
//counter++;
//
//}