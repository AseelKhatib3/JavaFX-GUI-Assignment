package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class comboClass {
	private VBox vbox;

	private String style = "-fx-border-color:green;-fx-border-width:2px;";
	private ComboBox<String> cbox;

	comboClass() {
		String colors[] = { "Red", "Green", "Blue" };
		vbox = new VBox(10);
		ObservableList list = FXCollections.observableArrayList(colors);
		cbox = new ComboBox<String>();
		cbox.getItems().addAll(list);
		vbox.getChildren().add(cbox);

	}

	public VBox getVbox() {
		return vbox;
	}

	public ComboBox<String> getCbox() {
		return cbox;
	}

}
