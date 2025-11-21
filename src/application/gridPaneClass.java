package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

public class gridPaneClass extends GridPane {

	Button lef, rig, up, dow;
	String style1 = "-fx-border-color:green;-fx-border-width:2px;";
	HBox hbox;
	GridPane gpane;

	public gridPaneClass() {
		hbox = new HBox(10);
		lef = new Button(null, new ImageView(new Image("image/left.png")));
		rig = new Button(null, new ImageView(new Image("image/right.png")));
		up = new Button(null, new ImageView(new Image("image/up.png")));
		dow = new Button(null, new ImageView(new Image("image/down.png")));

		lef.setStyle(style1);
		rig.setStyle(style1);
		up.setStyle(style1);
		dow.setStyle(style1);

		gpane = new GridPane();
		gpane.add(lef, 0, 1);
		gpane.add(rig, 2, 1);
		gpane.add(up, 1, 0);
		gpane.add(dow, 1, 2);

		gpane.setAlignment(Pos.CENTER);
		gpane.setPadding(new Insets(15));

		// Set the style for gpane to have a red border at the bottom
		gpane.setStyle("-fx-border-color: green green green green; -fx-border-height: 2px; -fx-border-width: 2px;");
		hbox.getChildren().addAll(gpane, new TextArea());
		hbox.setAlignment(Pos.CENTER);
		hbox.setPadding(new Insets(15));

		TextArea textArea = new TextArea();

		// This is the thick red line at the bottom of the hbox
		hbox.setStyle("-fx-border-color: green green  green; -fx-border-width: 2px 2px  2px;");

	}

	public HBox getGpane() {
		return hbox;
	}

	public void setGpane(GridPane gpane) {
		this.gpane = gpane;
	}

	public Button getLef() {
		return lef;
	}

	public Button getRig() {
		return rig;
	}

	public Button getUp() {
		return up;
	}

	public Button getDow() {
		return dow;
	}

}
