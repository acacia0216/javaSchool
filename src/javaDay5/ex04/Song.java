package javaDay5.ex04;

public class Song {
	private String title, artist, album, composer, track;
	private int year;
	
	public Song() {}
	public Song(String artist, String title, String album, int year , String track, String composer) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.track = track;
		this.year = year;
	}
	public Song(String artist, String title) {
		this.artist = artist;
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public String getTrack() {
		return track;
	}
	public void setTrack(String track) {
		this.track = track;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void showInfo() {
		System.out.println(artist+","+title+"("+album+","+year+","+track+","+composer+")");
	}
}
