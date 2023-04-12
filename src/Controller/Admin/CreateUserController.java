/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Admin;

import View.ViewManager;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author Yahya
 */
public class CreateUserController implements Initializable {

    @FXML
    private Button usersManagmentPageBtn;
    @FXML
    private Button accountsPageBtn;
    @FXML
    private Button operationsPageBtn;
    @FXML
    private Button saveNewUserBtn;
    @FXML
    private Button cancelBtn;
    @FXML
    private TextField usernameTF;
    @FXML
    private TextField passwordTF;
    @FXML
    private TextField emailTF;
    @FXML
    private ToggleGroup genderGroup;
    @FXML
    private ToggleGroup roleGroup;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void showUsersManagmentPage(ActionEvent event) {
        ViewManager.adminPage.changeSceneToUsersManagment();
    }

    @FXML
    private void showAccountsPage(ActionEvent event) {
        ViewManager.adminPage.changeSceneToAccountsManagment();
    }

    @FXML
    private void showOperationsPage(ActionEvent event) {
    }

    @FXML
    private void saveNewUser(ActionEvent event) {
    }

    @FXML
    private void cancelUserCreation(ActionEvent event) {
                ViewManager.adminPage.changeSceneToUsersManagment();

    }
    
}
