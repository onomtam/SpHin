package sphin.view;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import sphin.MainApp;

public class RootLayoutController {

	@FXML
	private MainApp mainApp;


    public RootLayoutController() {

    }
    @FXML
    private void initialize() {

    }
    @FXML
    private void chooseDirectory(){
		System.out.println("Choose Directory.");
    }
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
}