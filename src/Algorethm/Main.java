package Algorethm;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Main extends Application {
	static Scene scene;
	static Pane player;

	Button b1;
	Button b2;
	Button b3;

	ArrayList<Integer> numbers = new ArrayList<>();
	ArrayList<Label> labels = new ArrayList<>();
	ArrayList<Label> labelscopy = new ArrayList<>();
	ArrayList<Integer> supoort = new ArrayList<>();
	boolean n = true;
	int i = 0;

	@Override
	public void start(Stage primaryStage) throws FileNotFoundException {

		Start start = new Start();
		Pane p1 = start.pane();
		start.start.setOnAction(e1 -> {
			numbers = new ArrayList<>();
			input in = new input();
			Pane p = in.Pane();
			b1 = in.b1;
			b2 = in.b2;
			b3 = in.b3;

			b3.setOnAction(er -> {
				Number num = new Number();
				Pane pane = num.manu();

				Button reset = num.b2;

				reset.setOnAction(e -> {
					numbers = new ArrayList<>();
					primaryStage.setScene(scene);
					System.out.println("yes");
					return;
					
				});

				Scene scene1 = new Scene(pane, 1400, 800);
				primaryStage.setScene(scene1);

				Button file = num.b1;

				file.setOnAction(er1 -> {
					String[] n = num.t1.getText().trim().split(" ");
					if (n.length % 2 == 1) {
						Alert al = new Alert(AlertType.ERROR);
						al.setContentText("Please enter Even count");
						al.show();
						return;

					}
					int count = 0;

					try {

						for (int i = 0; i < n.length; i++) {

							numbers.add(Integer.parseInt(n[i]));

						}

					} catch (Exception e2) {
						Alert al = new Alert(AlertType.ERROR);
						al.setContentText("Please enter number  valied");
						al.show();

						numbers = new ArrayList<>();
						return;

					}

					addActionToButtons(primaryStage);

				});
			});

			b1.setOnAction(e -> {

				Number num = new Number();
				Pane pane = num.file();

				Scene scene1 = new Scene(pane, 1400, 800);
				primaryStage.setScene(scene1);

				Button file = num.b1;

				Button reset = num.b2;
				reset.setOnAction(e11 -> {
					numbers = new ArrayList<>();

					primaryStage.setScene(scene);

				});

				file.setOnAction(er -> {

					String n = num.t1.getText().trim();

					int count = 0;
					try {
						count = Integer.parseInt(n);

					} catch (Exception e2) {
						Alert al = new Alert(AlertType.ERROR);
						al.setContentText("Please enter number ");
						al.show();
						num.t1.setText("");
						return;

					}
					if (count % 2 == 1) {
						Alert al = new Alert(AlertType.ERROR);
						al.setContentText("Please enter even count ");
						al.show();
						num.t1.setText("");
						return;

					}

					try {
						numbers = from_file(count, primaryStage);
						if (numbers == null) {
							Alert al = new Alert(AlertType.ERROR);
							al.setContentText(
									"The number you entered is greater than the number of numbers in the file");
							al.show();
							num.t1.setText("");
							return;

						}

						addActionToButtons(primaryStage);

					} catch (FileNotFoundException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}

				});

			});
			b2.setOnAction(er -> {

				Number num = new Number();
				Pane pane = num.Random();

				Button reset = num.b2;
				reset.setOnAction(e -> {
					numbers = new ArrayList<>();

					primaryStage.setScene(scene);
					System.out.println("yes");
					return;

				});

				Scene scene1 = new Scene(pane, 1400, 800);
				primaryStage.setScene(scene1);

				Button file = num.b1;

				file.setOnAction(er1 -> {

					String n = num.t1.getText().trim();
					String from = num.from.getText().trim();
					String to = num.to.getText().trim();

					int count = 0;
					int froom = 0;
					int too = 0;
					try {
						count = Integer.parseInt(n);
						froom = Integer.parseInt(from);
						too = Integer.parseInt(to);

						if (too < froom) {
							Alert al = new Alert(AlertType.ERROR);
							al.setContentText("You must put the numbers in ascending order");
							al.show();
							num.t1.setText("");
							num.from.setText("");
							num.to.setText("");
							return;
						}

					} catch (Exception e2) {
						Alert al = new Alert(AlertType.ERROR);
						al.setContentText("Please enter number ");
						al.show();
						num.t1.setText("");
						num.from.setText("");
						num.to.setText("");
						return;

					}
					if (count % 2 == 1) {
						Alert al = new Alert(AlertType.ERROR);
						al.setContentText("Please enter even count ");
						al.show();
						num.t1.setText("");
						num.from.setText("");
						num.to.setText("");
						return;

					}

					numbers = Random(count, froom, too);

					addActionToButtons(primaryStage);

				});

			});

			scene = new Scene(p, 1400, 800);
			primaryStage.setScene(scene);

		});

		Scene scene = new Scene(p1, 1400, 800);

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	int left = 0;
	int right = numbers.size() - 1;

	private void addActionToButtons(Stage pri) {

		supoort = numbers;

		TowType tow = new TowType();
		Pane type = tow.type();

		Scene s1 = new Scene(type, 1400, 800);
		pri.setScene(s1);
		pri.show();
		Button reset = tow.b3;
		reset.setOnAction(e -> {
			numbers = new ArrayList<>();

			pri.setScene(scene);

			return;

		});

		Button v1 = tow.b1;
		v1.setOnAction(e -> {

			// supoort = (ArrayList<Integer>) numbers.clone();

			player = tow.towplay(numbers);

			Scene s2 = new Scene(player, 1400, 800);

			pri.setScene(s2);

			pri.show();
			Label red = tow.red;

			Label Blue = tow.Blue;

			Button bot1 = tow.but1;

			Button bot2 = tow.but2;

			bot1.setText(numbers.get(0) + "");

			bot2.setText(numbers.get(numbers.size() - 1) + "");

			labels =  tow.labelArray;

			Button res = tow.res;

			res.setOnAction(er -> {
				numbers = new ArrayList<>();
				labels = new ArrayList<>();
				pri.setScene(scene);

			});
			left = 0;
			right = labels.size() - 1;
			bot1.setOnAction(e1 -> {

				if (right >= left) {
					if (n) {
						try {
							int n1 = Integer.parseInt(bot1.getText());
							if (numbers.get(left) == n1) {

								labels.get(left).setStyle("-fx-background-color: Red; " + "-fx-background-radius: 50%; "
										+ "-fx-padding: 20px; ");
								labels.get(left).setPrefHeight(labels.get(0).getPrefHeight() - 15);
								TranslateTransition tt = new TranslateTransition(Duration.millis(1000),
										labels.get(left));
								tt.setByY(-150);

								tt.play();
								left++;
								
								
//								labels.remove(0);
//								numbers.remove(0);

								if (right >= left) {
									bot1.setText(numbers.get(left) + "");
								}

							} else if (numbers.get(right) == n1) {

								labels.get(right).setStyle("-fx-background-color: Red; "
										+ "-fx-background-radius: 50%; " + "-fx-padding: 20px; ");
								TranslateTransition tt = new TranslateTransition(Duration.millis(1000),
										labels.get(right));
								tt.setByY(-150);

								tt.play();

								labels.get(right).setPrefHeight(labels.get(i).getPrefHeight() - 15);
								right--;
								if (right >= left) {
									bot1.setText(numbers.get(right) + "");

								}

							}

							n1 += Integer.parseInt(red.getText());

							red.setText(n1 + "");
							n = !n;

						} catch (Exception ee1) {

						}

					} else {

						int n1 = Integer.parseInt(bot1.getText());

						if (numbers.get(left) == n1) {

							labels.get(left).setStyle("-fx-background-color: Blue; " + "-fx-background-radius: 50%; "
									+ "-fx-padding: 20px; ");
							TranslateTransition tt = new TranslateTransition(Duration.millis(1000), labels.get(left));
							tt.setByY(150);

							tt.play();

							labels.get(left).setPrefHeight(labels.get(left).getPrefHeight() - 15);

//							labels.remove(0);
//							numbers.remove(0);
							left++;
							if (right >= left) {
								bot1.setText(numbers.get(left) + "");

							}

						} else if (numbers.get(right) == n1) {

							labels.get(right).setStyle("-fx-background-color: Blue; " + "-fx-background-radius: 50%; "
									+ "-fx-padding: 20px; ");
							labels.get(right).setPrefHeight(labels.get(0).getPrefHeight() - 15);
							TranslateTransition tt = new TranslateTransition(Duration.millis(1000), labels.get(right));
							tt.setByY(150);
							tt.play();

//							labels.remove(numbers.size() - 1);
//							numbers.remove(numbers.size() - 1);
							right--;
							if (right >= left) {
								bot1.setText(numbers.get(right) + "");

							}

						}

						n1 += Integer.parseInt(Blue.getText());
						Blue.setText(n1 + "");
						n = !n;

					}

				}

				if (left > right) {
					left=0;
					right=labels.size()-1;
					Label B = new Label();
					if (Integer.parseInt(Blue.getText()) > Integer.parseInt(red.getText())) {
						B = new Label("The Blue player is winerrrr :" + Blue.getText());
						B.setStyle("-fx-background-color:Blue ; ");

					} else if(Integer.parseInt(Blue.getText()) < Integer.parseInt(red.getText())) {

						B = new Label("The Red player is winerrrr :" + red.getText());
						B.setStyle("-fx-background-color:Red ; ");
					}
					else {
						
						B = new Label("The players tied with a score of :" + red.getText());
						B.setStyle("-fx-background-color:grey ; ");
					}
					B.setFont(new Font(50));
					B.setTextFill(Color.BLACK);

					B.setPrefWidth(1000);
					B.setPrefHeight(300);
					B.setLayoutX(200);
					B.setLayoutY(200);
					Button again = new Button("Play a again");
					again.setLayoutX(600);
					again.setLayoutY(440);
					again.setPrefWidth(200);
					again.setPrefHeight(50);
					again.setFont(new Font(25));
					Pane play = new Pane();
					play.setStyle("-fx-background-color: #1A0C4B;");
					play.getChildren().addAll(B, res);

					Scene f = new Scene(play, 1400, 800);
					pri.setScene(f);

			

				}

			});

			bot2.setOnAction(eb -> {
				

				if (left <= right) {
					
					if (n) {
						try {

							int n1 = Integer.parseInt(bot2.getText());

							if (numbers.get(left) == n1) {

								labels.get(left).setStyle("-fx-background-color: Red; " + "-fx-background-radius: 50%; "
										+ "-fx-padding: 20px; ");
								labels.get(0).setPrefHeight(labels.get(0).getPrefHeight() - 15);

								TranslateTransition tt = new TranslateTransition(Duration.millis(1000), labels.get(0));
								tt.setByY(-150);
								tt.play();

//								labels.remove(0);
//								numbers.remove(0);
								left++;

								if (left <= right) {
									bot2.setText(numbers.get(left) + "");

								}

							} else if (numbers.get(right) == n1) {

								labels.get(right).setStyle("-fx-background-color: Red; "+ "-fx-background-radius: 50%; " + "-fx-padding: 20px; ");
								labels.get(right).setPrefHeight(labels.get(0).getPrefHeight() - 15);
								TranslateTransition tt = new TranslateTransition(Duration.millis(1000),
										labels.get(right));
								tt.setByY(-150);

								tt.play();

//								labels.remove(numbers.size() - 1);
//								numbers.remove(numbers.size() - 1);

								right--;

								if (left <= right) {
									bot2.setText(numbers.get(right) + "");

								}

							}

							n1 += Integer.parseInt(red.getText());
							red.setText(n1 + "");
							n = !n;

						} catch (Exception ee1) {
							System.out.println("mmmmmmmmmmnnnnnm");
						}

					} else {
						

						int n1 = Integer.parseInt(bot2.getText());

				
						if (numbers.get(left) == n1) {

							System.out.println(n1);
							labels.get(left).setStyle("-fx-background-color: Blue; " + "-fx-background-radius: 50%; "
									+ "-fx-padding: 20px; ");
							TranslateTransition tt = new TranslateTransition(Duration.millis(1000), labels.get(0));
							tt.setByY(150);
		                    tt.play();

				        	labels.get(0).setPrefHeight(labels.get(0).getPrefHeight() - 15);

//							labels.remove(0);
//							numbers.remove(0);
							left++;
							if (left <= right) {
								bot2.setText(numbers.get(left) + "");

							}

						} else if (numbers.get(right) == n1) {

							labels.get(right).setStyle("-fx-background-color: Blue; " + "-fx-background-radius: 50%; "
									+ "-fx-padding: 20px; ");
							labels.get(right).setPrefHeight(labels.get(0).getPrefHeight() - 15);
							TranslateTransition tt = new TranslateTransition(Duration.millis(1000), labels.get(right));
							tt.setByY(150);
							tt.play();

//							labels.remove(right);
//							numbers.remove(right);
							right--;

							if (left <= right) {
								bot2.setText(numbers.get(right) + "");

							}
						}

						n1 += Integer.parseInt(Blue.getText());
						
						Blue.setText(n1 + "");
						n = !n;

					}
				}
				if (left > right) {
					Label B = new Label();
				
					if (Integer.parseInt(Blue.getText()) > Integer.parseInt(red.getText())) {
						B = new Label("The Blue player is winerrrr :" + Blue.getText());
						B.setStyle("-fx-background-color:Blue ; ");

					} else if(Integer.parseInt(Blue.getText()) < Integer.parseInt(red.getText())) {

						B = new Label("The Red player is winerrrr :" + red.getText());
						B.setStyle("-fx-background-color:Red ; ");
					}
					else {
						
						B = new Label("The players tied with a score of :" + red.getText());
						B.setStyle("-fx-background-color:grey ; ");
					}
					left=0;right=labels.size()-1;
					B.setFont(new Font(50));
					B.setTextFill(Color.BLACK);

					B.setPrefWidth(1000);
					B.setPrefHeight(300);
					B.setLayoutX(200);
					B.setLayoutY(200);
					Button again = new Button("Play a again");
					again.setLayoutX(600);
					again.setLayoutY(440);
					again.setPrefWidth(200);
					again.setPrefHeight(50);
					again.setFont(new Font(25));
					Pane play = new Pane();

					play.setStyle("-fx-background-color: #1A0C4B;");
					play.getChildren().addAll(B, res);

					Scene f = new Scene(play, 1400, 800);
					pri.setScene(f);

				

				}

			});

		});

		tow.b2.setOnAction(t -> {

			Pane player = tow.Computer(numbers);
			Scene s2 = new Scene(player, 1400, 800);
			pri.setScene(s2);
			pri.show();
			Label red = tow.red;
			Label Blue = tow.Blue;

			Button table = tow.table;

			labels = tow.labelArray;

			Button res = tow.res;

			res.setOnAction(er -> {

				pri.setScene(scene);
				numbers = new ArrayList<>();
				labels = new ArrayList<>();
				i = 0;

			});

			Dynamic_game dyn = new Dynamic_game();
			int[] nums = new int[numbers.size()];

			for (int i = 0; i < numbers.size(); i++) {
				nums[i] = numbers.get(i);
			}
			int[] num = dyn.main(nums);

			table.setOnAction(er -> {
				int[][] ta = dyn.newn;

				Stage ne = new Stage();

				GridPane gp = new GridPane();
				for (int i = 0; i < ta.length; i++) {
					ColumnConstraints colConst = new ColumnConstraints();
					colConst.setPrefWidth(50);

					gp.getColumnConstraints().add(colConst);
				}

				for (int j = 0; j < ta[0].length; j++) {
					RowConstraints rowConst = new RowConstraints();
					rowConst.setPrefHeight(30);

					gp.getRowConstraints().add(rowConst);
				}
				for (int i = 0; i < ta.length; i++) {
					for (int j = 0; j < ta.length; j++) {

						Label l1 = new Label(ta[i][j] + "");
						l1.setAlignment(Pos.CENTER);
						l1.setFont(new Font(25));

						Pane cellPane = new Pane();
						cellPane.setPrefWidth(150);
						cellPane.setPrefHeight(30);
						cellPane.getChildren().add(l1);
						if (i < j) {
							cellPane.setStyle(
									"-fx-background-color: #D3D3D3; -fx-border-color: black; -fx-border-width: 1px;");
							gp.add(cellPane, j, i);

						} else if (i > j) {

							cellPane.setStyle(
									"-fx-background-color: #2E2E2E; -fx-border-color: black; -fx-border-width: 1px;");

							cellPane.getChildren().clear();

							gp.add(cellPane, j, i);

						} else {
							cellPane.setStyle(
									"-fx-background-color: gray; -fx-border-color: black; -fx-border-width: 1px;");
							gp.add(cellPane, j, i);

						}

					}

				}
				Scene sc = new Scene(gp, gp.getPrefWidth(), gp.getPrefHeight());
				ne.setScene(sc);
				ne.show();

			});

			n = true;

			for (int i = 0; i < numbers.size(); i++) {
				int n1 = num[i];
				if (n) {

					labels.get(n1).setStyle(
							"-fx-background-color: Red; " + "-fx-background-radius: 50%; " + "-fx-padding: 20px; ");
					labels.get(n1).setPrefHeight(labels.get(n1).getPrefHeight() - 15);

					TranslateTransition tt = new TranslateTransition(Duration.millis(500), labels.get(n1));
					tt.setByY(-150);
					tt.play();
					red.setText((Integer.parseInt(red.getText()) + numbers.get(n1)) + "");

				} else {
					labels.get(n1).setStyle(
							"-fx-background-color: Blue; " + "-fx-background-radius: 50%; " + "-fx-padding: 20px; ");
					labels.get(n1).setPrefHeight(labels.get(n1).getPrefHeight() - 15);
					TranslateTransition tt = new TranslateTransition(Duration.millis(500), labels.get(n1));
					tt.setByY(+150);
					tt.play();
					Blue.setText((Integer.parseInt(Blue.getText()) + numbers.get(n1)) + "");

				}
				n = !n;

			}

			Button run = tow.run;

			run.setOnAction(er -> {
				run.setDisable(true);
				for (int i = 0; i < labels.size(); i++) {
					labels.get(i).setStyle(
							"-fx-background-color: gray; " + "-fx-background-radius: 50%; " + "-fx-padding: 20px; ");
					TranslateTransition returnTransition = new TranslateTransition(Duration.millis(500), labels.get(i));
					returnTransition.setToY(0.0000000000000000000000000000000000001);
					returnTransition.play();
				}

				Blue.setText("0");
				red.setText("0");

				if (labels.size() > 0 || numbers.size() > 0) {
					label(num, Blue, red, run);

				}

			});

		});

	}

	public void label(int[] num, Label Blue, Label red, Button run) {
		Timeline timeline = new Timeline();

		i = 0;
		KeyFrame keyFrame = new KeyFrame(Duration.seconds(0.4), e -> {

			if (i >= num.length) {
				run.setDisable(false);
				timeline.stop();
				return;
			}
			int n1 = num[i];
			if (n) {

				labels.get(n1).setStyle(
						"-fx-background-color: Red; " + "-fx-background-radius: 50%; " + "-fx-padding: 20px; ");
				labels.get(n1).setPrefHeight(labels.get(n1).getPrefHeight() - 15);

				TranslateTransition tt = new TranslateTransition(Duration.millis(300), labels.get(n1));
				tt.setByY(-150);
				tt.play();
				red.setText((Integer.parseInt(red.getText()) + numbers.get(n1)) + "");

			} else {
				labels.get(n1).setStyle(
						"-fx-background-color: Blue; " + "-fx-background-radius: 50%; " + "-fx-padding: 20px; ");
				labels.get(n1).setPrefHeight(labels.get(n1).getPrefHeight() - 15);
				TranslateTransition tt = new TranslateTransition(Duration.millis(300), labels.get(n1));
				tt.setByY(+150);
				tt.play();
				Blue.setText((Integer.parseInt(Blue.getText()) + numbers.get(n1)) + "");

			}
			n = !n;
			i++;

		});
		if (i >= num.length)
			return;
		timeline.getKeyFrames().add(keyFrame);

		timeline.setCycleCount(Timeline.INDEFINITE);

		timeline.play();

	}

	public ArrayList<Integer> from_file(int n1, Stage n) throws FileNotFoundException {
		FileChooser fileChooser = new FileChooser();

		File initialDirectory = new File("C:\\Users\\HP\\Desktop\\Project1\\Labs\\bin\\Labs\\Project3\\src");
		if (initialDirectory.exists()) {
			fileChooser.setInitialDirectory(initialDirectory);
		}

		File file = fileChooser.showOpenDialog(n);

		Scanner scaner = new Scanner(file);

		if (!scaner.hasNextLine()) {
			scaner.close();
			return null;
		}
		String[] count = scaner.nextLine().split(" ");
		if (count.length < n1) {
			return null;
		}

		ArrayList<Integer> ar = new ArrayList<>();

		for (int i = 0; i < n1; i++) {
			ar.add(Integer.parseInt(count[i]));
		}
		return ar;
	}

	public ArrayList<Integer> Random(int n1, int from, int to) {
		ArrayList<Integer> newn = new ArrayList<>();
		java.util.Random r1 = new java.util.Random();
		for (int i = 0; i < n1; i++) {
			int randomNum = r1.nextInt(to - from + 1) + from;
			newn.add(randomNum);
		}

		return newn;

	}

	public static void main(String[] args) {
		launch(args);
	}
}
