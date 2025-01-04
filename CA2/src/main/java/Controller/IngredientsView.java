package Controller;

import Classes.Ingredient;
import Utils.LinkedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

import static Main.MainMenu.stage;

public class IngredientsView {

    private FXMLLoader fxmlLoaderMainMenu= new FXMLLoader(getClass().getResource("menu-view.fxml"));

    private Scene fxmlLoaderMainMenuScene= new Scene(fxmlLoaderMainMenu.load());

    private LinkedList<Ingredient> ingredientLinkedList=new LinkedList<>();

    public IngredientsView() throws IOException {
    }

    protected void CreateMainMenu(ActionEvent actionEvent) throws IOException {
        stage.setScene(fxmlLoaderMainMenuScene);
    }


}
