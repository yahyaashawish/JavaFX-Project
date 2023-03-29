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

/**
 * FXML Controller class
 *
 * @author Yahya
 */
public class UsersManagmentController implements Initializable {

    @FXML
    private Button usersManagmentPageBtn;
    @FXML
    private Button accountsPageBtn;
    @FXML
    private Button operationsPageBtn;
    @FXML
    private Button createNewUserBtn;
    @FXML
    private Button showAllUsersBtn;
    @FXML
    private Button updateSelectedUserBtn;
    @FXML
    private Button deleteSelectedUserBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void showUsersManagmentPage(ActionEvent event) {
    }

    @FXML
    private void showAccountsPage(ActionEvent event) {
    }

    @FXML
    private void showOperationsPage(ActionEvent event) {
    }

    @FXML
    private void showUserCreationPage(ActionEvent event) {
        ViewManager.adminPage.changeSceneToCreateUser();
    }

    @FXML
    private void showAllUsers(ActionEvent event) {
    }

    @FXML
    private void updateSelectedUser(ActionEvent event) {
    }

    @FXML
    private void deleteSelectedUser(ActionEvent event) {
    }
    
}
