package sphin.view;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Song {

	private SimpleStringProperty name;
	private SimpleStringProperty album;
	private SimpleStringProperty artist;
	private SimpleStringProperty time;
	private SimpleStringProperty bitRate;
	private SimpleStringProperty fileLocation;


	public Song(String name, String album, String artist, String time, String bitRate, String fileLocation) {
		this.name         = new SimpleStringProperty(name);
		this.album        = new SimpleStringProperty(album);
		this.artist       = new SimpleStringProperty(artist);
		this.time         = new SimpleStringProperty(time);
		this.bitRate      = new SimpleStringProperty(bitRate);
		this.fileLocation = new SimpleStringProperty(fileLocation);
	}
	public StringProperty songProperty(){
		return name;
	}
	public String getSongName(){
		return name.get();
	}
	public String getAlbumName(){
		return album.get();
	}
	public String getArtistName(){
		return artist.get();
	}
	public String getTime(){
		return time.get();
	}
	public String getBitRate(){
		return bitRate.get();
	}
	public String getFileLocation(){
		return fileLocation.get();
	}
}
