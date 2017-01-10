package webcam.wewatchyour.gui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import webcam.wewatchyour.gui.view.MainAppController;

public class MainApp extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;    
    
    /**
     * Constructor,can initialize window with some data if want
     */
   public MainApp(){
	   
   }
    
    public MainApp(String[] args) {
    	launch(args);
    }
   
    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("TestCreator");

        initRootLayout();

        showMainApp();
    }

    /**
     * Initializes the root layout.
     */
    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Shows the person overview inside the root layout.
     */
    public void showMainApp() {
    	
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/MainApp.fxml"));
            BorderPane mainApp = (BorderPane) loader.load();

            // Set person overview into the center of root layout.
            rootLayout.setCenter(mainApp);

            // Give the controller access to the main app.
            MainAppController controller = loader.getController();
            controller.setMainApp(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Returns the main stage.
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }

//    public static void main(String[] args) {
//        launch(args);
//    }
}