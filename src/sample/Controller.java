package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class Controller {

    @FXML
    private GridPane txtLabel;

    @FXML
    private ComboBox<?> fontComboBox;

    @FXML
    private Label displayLabel;

    @FXML
    private Button getFontButton;

    @FXML
    private Button closeButton;

}