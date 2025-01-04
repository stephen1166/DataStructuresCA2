package Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;

import static Main.MainMenu.stage;

public class MenuView {

    private FXMLLoader fxmlLoaderIng=new FXMLLoader(getClass().getResource("ingredients-view.fxml"));

    private Scene ingredientsView=new Scene(fxmlLoaderIng.load());

    public MenuView() throws IOException {
    }

    @FXML
    protected void Drinks() {
    }

    @FXML
    protected void Ingredients() {
        stage.setScene(ingredientsView);
    }
}
