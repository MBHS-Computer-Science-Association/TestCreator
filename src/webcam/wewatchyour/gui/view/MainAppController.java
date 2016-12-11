package webcam.wewatchyour.gui.view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;
import webcam.wewatchyour.gui.MainApp;

public class MainAppController {

    // Reference to the main application.
    private MainApp mainApp;
    
    @FXML
    private CheckBox manualEntryOff;
    @FXML
    private CheckBox manualEntryOn;

    /**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public MainAppController() {
    }

    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
        
    }
    
    @FXML
    private void handleCheckBoxAction(ActionEvent e) throws IOException{
    	Stage stage;
    	Parent root;   	
    	
    	if(e.getSource()==manualEntryOff){
    		//get reference to the button's stage
    		stage = (Stage) manualEntryOff.getScene().getWindow();
    		//load other FXML document
    		root = FXMLLoader.load(getClass().getResource("MainAppManual.fxml"));
    	}else{
    		stage = (Stage)manualEntryOn.getScene().getWindow();
    		root = FXMLLoader.load(getClass().getResource("MainApp.fxml"));
    	}
    	
    	//make new scene with root and set the stage
    	Scene scene = new Scene(root);
    	stage.setScene(scene);
    	stage.show();
    }

    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param mainApp
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
}