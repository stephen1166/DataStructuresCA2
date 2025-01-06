package Controller;

import Classes.Drink;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

import static Main.MainMenu.mainScene;
import static Main.MainMenu.stage;

public class DrinksView implements Initializable {

    @FXML
    private TextField nameField;
    @FXML
    private TextField typeField;
    @FXML
    private TextField originField;
    @FXML
    private TextField descriptionField;
    @FXML
    private TextField imageField;

    @FXML
    private TableView<Drink> tableView;
    @FXML
    private TableColumn<Drink, String> nameColumn;
    @FXML
    private TableColumn<Drink, String> typeColumn;
    @FXML
    private TableColumn<Drink, String> originColumn;
    @FXML
    private TableColumn<Drink, String> descriptionColumn;
    @FXML
    private TableColumn<Drink, String> imageColumn;
    @FXML
    private ObservableList<Drink> drinks = FXCollections.observableArrayList();

    @FXML
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Linking Columns in drinks-view.FXML to objects in Drink.java
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        typeColumn.setCellValueFactory(new PropertyValueFactory<>("type"));
        originColumn.setCellValueFactory(new PropertyValueFactory<>("origin"));
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<>("description"));
        imageColumn.setCellValueFactory(new PropertyValueFactory<>("image"));

        tableView.setItems(drinks);
    }


    @FXML
    public void addDrink(String name, String type, String origin, String description, URL image) {
        Drink newDrink = new Drink(name, type, origin, description, image);
        drinks.add(newDrink);

        //Prints drinks into console for debugging
        System.out.println(drinks);
    }

    @FXML
    public void onAddDrink(ActionEvent actionEvent) {
        String name = nameField.getText();
        String type = typeField.getText();
        String origin = originField.getText();
        String description = descriptionField.getText();

        // Default to null if the image URL is invalid
        URL image = null;
        try {
            image = new URL(imageField.getText());
        } catch (Exception e) {
            System.out.println("Invalid image URL");
        }

        addDrink(name, type, origin, description, image);
        tableView.refresh();
    }

    @FXML
    protected void Back(){
        stage.setScene(mainScene);
    }
}