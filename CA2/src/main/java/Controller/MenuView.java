package Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;

import static Main.MainMenu.stage;

public class MenuView {

    private FXMLLoader fxmlLoaderIngrediant=new FXMLLoader(getClass().getResource("ingredients-view.fxml"));

    private FXMLLoader fxmlLoaderDrink=new FXMLLoader(getClass().getResource("drinks-view.fxml"));

    private Scene ingredientsView=new Scene(fxmlLoaderIngrediant.load());

    private Scene drinksView=new Scene(fxmlLoaderDrink.load());

    public MenuView() throws IOException {
    }

    @FXML
    protected void Drinks() {
        stage.setScene(drinksView);
    }

    @FXML
    protected void Ingredients() {
        stage.setScene(ingredientsView);
    }
}
