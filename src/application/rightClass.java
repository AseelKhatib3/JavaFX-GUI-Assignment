package application;

import java.awt.Checkbox;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class rightClass {
	private VBox vbox;
	private CheckBox italic, bold;
	private String style = "-fx-border-color:green;-fx-border-width:2px;";
	private Font fonts = Font.font(35);

	rightClass() {
		vbox = new VBox(10);
		bold = new CheckBox("Bold");
		bold.setFont(fonts);

		italic = new CheckBox("Italic");
		italic.setFont(fonts);

		vbox.getChildren().addAll(bold, italic);
		vbox.setAlignment(Pos.CENTER_LEFT);
		vbox.setPadding(new Insets(15));
		vbox.setStyle(style);

	}

	public VBox getVbox() {
		return vbox;
	}

	public CheckBox getItalic() {
		return italic;
	}

	public CheckBox getBold() {
		return bold;
	}

}
