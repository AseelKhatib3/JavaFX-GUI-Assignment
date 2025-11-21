package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;

import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class leftClass {
	private VBox vbox;
	private RadioButton red, green, blue;
	private String style = "-fx-border-color:green;-fx-border-width:2px;";
	private Font fonts = Font.font(35);

	leftClass() {
		vbox = new VBox(10);
		red = new RadioButton("red");
		red.setFont(fonts);

		green = new RadioButton("green");
		green.setFont(fonts);

		blue = new RadioButton("blue");
		blue.setFont(fonts);

		ToggleGroup tg = new ToggleGroup();
		red.setToggleGroup(tg);
		green.setToggleGroup(tg);
		blue.setToggleGroup(tg);

		vbox.getChildren().addAll(red, green, blue);

		vbox.setAlignment(Pos.CENTER_LEFT);
		vbox.setPadding(new Insets(15));

	}

	

	public RadioButton getRed() {
		return red;
	}

	public RadioButton getGreen() {
		return green;
	}

	public RadioButton getBlue() {
		return blue;
	}

	public VBox getVbox() {
		return vbox;
	}

}
