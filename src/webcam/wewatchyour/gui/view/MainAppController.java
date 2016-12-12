package webcam.wewatchyour.gui.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import webcam.wewatchyour.gui.MainApp;

public class MainAppController {

    // Reference to the main application.
    private MainApp mainApp;
    
    @FXML
    private CheckBox manualEntryOff;
    @FXML
    private CheckBox manualEntryOn;
    @FXML
    private TextArea textArea;
    @FXML
    private Button submit;

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
    private void ManualEntryHandler(ActionEvent e){
    	String str = textArea.getText();
    	
    	try {
			PrintStream output = new PrintStream(new File("sample.txt"));
			output.print(str);
			mainApp.releaseLock();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
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