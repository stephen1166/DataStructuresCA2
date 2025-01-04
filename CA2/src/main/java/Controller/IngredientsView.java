package Controller;

import javafx.fxml.FXML;

import static Main.MainMenu.stage;
import static Main.MainMenu.mainScene;


public class IngredientsView {

    @FXML
    protected void Back(){
        stage.setScene(mainScene);
    }
}
