package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class Main extends Application {
	private static final Paint OriginalColor = null;
	Text text;

	@Override
	public void start(Stage primaryStage) {
		try {

			BorderPane root = new BorderPane();
			gridPaneClass gpane = new gridPaneClass();
			rightClass rc = new rightClass();
			leftClass ls = new leftClass();
			topClass tc = new topClass();
			comboClass co = new comboClass();

			VBox leftSideVBox = new VBox();
			leftSideVBox.getChildren().add(co.getVbox()); // Add the VBox from leftClass
			leftSideVBox.getChildren().add(ls.getVbox()); // Add the VBox from comboClass
			leftSideVBox.setSpacing(10); // Adjust the spacing as needed

			VBox combinedLeftVBox = new VBox();
			combinedLeftVBox.getChildren().addAll(co.getVbox(), ls.getVbox());
			combinedLeftVBox.setStyle("-fx-border-color: green; -fx-border-width: 2px; -fx-padding: 10;");
			// You may need to adjust padding or spacing

			Pane pane = new Pane();

			pane.getChildren().add(getmytext());
			Font org = text.getFont();
			root.setCenter(pane);
			
			
			root.setRight(rc.getVbox());
			root.setBottom(gpane.getGpane());
			root.setLeft(leftSideVBox);
			root.setTop(tc.getHbox());
			root.setLeft(combinedLeftVBox);
			Scene scene = new Scene(root, 800, 800);

			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			System.out.println("Stage shown successfully");


			gpane.getLef().setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					text.setX(text.getX() - 5);

				}
			});
			gpane.getRig().setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					text.setX(text.getX() + 5);

				}
			});

			gpane.getDow().setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					text.setY(text.getY() + 5);

				}
			});

			gpane.getUp().setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					text.setY(text.getY() - 5);

				}
			});

			rc.getBold().setOnAction(e -> {

				Font font = Font.font("Arial", FontWeight.BOLD, text.getFont().getSize());
				if (rc.getBold().isSelected()) {
					rc.getItalic().setSelected(false);
					text.setFont(font);
				}

				else {

					text.setFont(org);
				}

			});
			rc.getItalic().setOnAction(e -> {

				Font font = Font.font("Arial", FontPosture.ITALIC, text.getFont().getSize());
				if (rc.getItalic().isSelected()) {
					rc.getBold().setSelected(false);

					text.setFont(font);
				}

				else {
					text.setFont(org);
				}

			});

			ls.getBlue().setOnAction(e -> {
				text.setFill(Color.BLUE);
			});

			ls.getGreen().setOnAction(e -> {
				text.setFill(Color.GREEN);
			});

			ls.getRed().setOnAction(e -> {
				text.setFill(Color.RED);
			});

			tc.getTf().setOnKeyTyped(e -> {

				if (!tc.getTf().getText().equals("")) {
					int size = Integer.parseInt(tc.getTf().getText());
					Font font = Font.font(size);
					text.setFont(font);

				}

				else {
					text.setFont(org);
				}

			});

			co.getCbox().setOnAction(e -> {

			    ls.getRed().setSelected(false);
			    ls.getGreen().setSelected(false);
			    ls.getBlue().setSelected(false);

			    int index = co.getCbox().getSelectionModel().getSelectedIndex();

			    if (index == 0)
			        text.setFill(Color.RED);
			    else if (index == 1)
			        text.setFill(Color.GREEN);
			    else if (index == 2)
			        text.setFill(Color.BLUE);
			});

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Text getmytext() {
		text = new Text(150, 150, "Java Fx Programming");
		Font font = Font.font("", FontWeight.BOLD, FontPosture.ITALIC, 30);
		Color color = new Color(0.5, 0.25, 0.75, 1);

		text.setFont(font);
		text.setFill(color);
		return text;

	}

	public static void main(String[] args) {
		launch(args);
	}
}
