package Controller;

import javafx.fxml.FXML;

import static Main.MainMenu.mainScene;
import static Main.MainMenu.stage;

public class DrinksView {
    @FXML
    protected void Back(){
        stage.setScene(mainScene);
    }
}