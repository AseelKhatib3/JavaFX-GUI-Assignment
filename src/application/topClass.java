package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

import javafx.scene.text.Font;

public class topClass {
	private HBox hbox;
	private TextField tf;
	private Label lb;
	private String style = "-fx-border-color:green;-fx-border-width:2px;";
	private Font fonts = Font.font(35);

	topClass() {
		hbox = new HBox(10);
		tf = new TextField();
		tf.setPrefWidth(100);
		lb = new Label("Enter the font size:");

		tf.setFont(fonts);

		lb.setFont(fonts);

		hbox.getChildren().addAll(lb, tf);
		hbox.setAlignment(Pos.CENTER);
		hbox.setPadding(new Insets(15));
		hbox.setStyle(style);

	}

	public HBox getHbox() {
		return hbox;
	}

	public TextField getTf() {
		return tf;
	}

}
