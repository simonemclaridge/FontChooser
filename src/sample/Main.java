package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Font Chooser");
        primaryStage.setScene(new Scene(root, 500, 500));

        Image image = new Image(new FileInputStream("C:\\Users\\Simone\\IdeaProjects\\FontChooser\\src\\images\\earth-icon-1.png"));
        primaryStage.getIcons().add(image);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
