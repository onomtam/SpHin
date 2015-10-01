package sphin.view;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import sphin.MainApp;

public class PlayerLayoutController implements Initializable {

	@FXML
	private MainApp mainApp;

	@FXML
	private Slider volumeSlider;

	@FXML private TableView<Song> songView;
	@FXML private TableColumn<Song, String> Name;
	@FXML private TableColumn<Song, String> Album;
	@FXML private TableColumn<Song, String> Artist;
	@FXML private TableColumn<Song, String> Time;
	@FXML private TableColumn<Song, String> Bitrate;
	@FXML private TableColumn<Song, String> Location;



	ObservableList<Song> data;


    public PlayerLayoutController() {


    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    	Name.setCellValueFactory(cellData -> cellData.getValue().songProperty());


    }
    @FXML
    private void playPause(){
		System.out.println("play pause");
    }
    @FXML
    private void previous(){
		System.out.println("prev");
    }
    @FXML
    private void next(){
		System.out.println("next");
    }
    @FXML
    private void volumeSlider(){

    	volumeSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
//    		mediaPlayer.setVolume((double) newValue);
    		System.out.println("Slider Value Changed (newValue: " + newValue.doubleValue() + ")\n");
		});
    }


    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;

        songView.setItems(mainApp.getSongData());
    }


}