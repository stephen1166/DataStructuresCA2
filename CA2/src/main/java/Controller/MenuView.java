package Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;

import static Main.MainMenu.stage;

public class MenuView {



    public MenuView() throws IOException {
    }

    @FXML
    protected void Drinks() throws IOException {
        FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("drinks-view.fxml"));
        stage.setScene(new Scene(fxmlLoader.load()));
    }

    @FXML
    protected void Ingredients() throws IOException {
        FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("ingredients-view.fxml"));
        stage.setScene(new Scene(fxmlLoader.load()));
    }
}
