/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assch5;

import java.util.Map;
import java.util.TreeMap;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author rant
 */
public class Assch5 extends Application{

    /**
     * @param args the command line arguments
     */
    

    @Override
    public void start(Stage primaryStage) throws Exception {
    Pane paneTableView = FXMLLoader.load(getClass().getResource("fxml1.fxml"));
     
        
        Map<String,Pane>mapPanes=new TreeMap<>(); 
        mapPanes.put("tableView", paneTableView);
       
        
        Scene scene = new Scene(mapPanes.get("tableView"));
        
        primaryStage.setTitle("Student App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
    public static void main(String[] args) {
        launch(args);
    }
}
