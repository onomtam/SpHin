package sphin;
import java.io.IOException;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import sphin.view.PlayerLayoutController;
import sphin.view.Song;


public class MainApp extends Application {

    public Stage primaryStage;
    private BorderPane rootLayout;
    public MediaPlayer mediaPlayer;

    final ObservableList<Song> songData = FXCollections.observableArrayList();


    @Override
    public void start(Stage primaryStage) throws Exception {
       this.primaryStage = primaryStage;
       primaryStage.setTitle("SpHin v0.2");

       initRootLayout();
       playerLayout();
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

    public void playerLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/playerLayout.fxml"));


            // Show the scene containing the root layout.
            AnchorPane playerOverview = (AnchorPane) loader.load();

            // Set person overview into the center of root layout.
            rootLayout.setCenter(playerOverview);

            // Give the controller access to the main app.
            PlayerLayoutController controller = loader.getController();
            controller.setMainApp(this);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public MainApp(){
    	songData.add(new Song("Song 1", "Album 1", "Artist 1", "Time 1", "Bitrate 1" , "Location 1"));
    	songData.add(new Song("Song 2", "Album 1", "Artist 1", "Time 1", "Bitrate 1" , "Location 1"));
    }

    public ObservableList<Song> getSongData() {
        return songData;
    }




    public static void main(String[] args) {
        launch(args);
    }
}