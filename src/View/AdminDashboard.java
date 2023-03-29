/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Yahya
 */
public class AdminDashboard extends Stage{
    
    // All Scenes that AdminDashboard page have
    private Scene usersManagmentScene;
    private Scene createUserScene;
    //private Scene accountsScene;
    //private Scene operationsScene;

    public AdminDashboard() throws IOException {
        
        //load UserManagment FXML File in UsersManagment Scene
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AdminFXML/UsersManagment.fxml"));
        Parent root = loader.load();     
        usersManagmentScene = new Scene(root);
        
        
        //load CreateUser FXML File in CreateUser Scene
        FXMLLoader loaderCreate = new FXMLLoader(getClass().getResource("AdminFXML/CreateUser.fxml"));
        Parent rootCreate = loaderCreate.load();     
        createUserScene = new Scene(rootCreate);
        
        // Set Main Scene in Admin Dasboard ( UsersManagment Scene )
        this.setScene(usersManagmentScene);
        this.setTitle("Admin Dasboard");
        
        
    }
    public void changeSceneToCreateUser(){
        this.setScene(createUserScene);
    }
    public void changeSceneToUsersManagment(){
        this.setScene(usersManagmentScene);
    }
    
    
    
}
