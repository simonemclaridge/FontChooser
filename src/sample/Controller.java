package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField txtField;

    @FXML
    private ComboBox<?> fontComboBox;

    @FXML
    private Label displayLabel;

    @FXML
    private Label txtLabel;

    @FXML
    private Button getFontButton;

    @FXML
    private Button closeButton;
}