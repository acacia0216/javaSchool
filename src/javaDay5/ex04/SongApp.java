package javaDay5.ex04;

public class SongApp {
	public static void main(String args[]) {
		Song song = new Song();
		
		song.setArtist("아이유");
		song.setTitle("좋은날");
		song.setAlbum("Real");
		song.setYear(2010);
		song.setTrack("3번트랙");
		song.setComposer("이민수 작곡");
		System.out.println(song.getArtist()+","+song.getTitle()+","
				+song.getAlbum()+","+song.getYear()+","+song.getTrack()+","+song.getComposer());
		song.showInfo();
		
		song.setArtist("빅뱅");
		song.setTitle("거짓말");
		song.setAlbum("Always");
		song.setYear(2007);
		song.setTrack("2번트랙");
		song.setComposer("G-Dragon 작곡");
		System.out.println(song.getArtist()+","+song.getTitle()+","
				+song.getAlbum()+","+song.getYear()+","+song.getTrack()+","+song.getComposer());
		song.showInfo();
		
		song.setArtist("버스커버스커");
		song.setTitle("벚꽃엔딩");
		song.setAlbum("버스커버스커 1집");
		song.setYear(2012);
		song.setTrack("4번트랙");
		song.setComposer("장범준 작곡");
		System.out.println(song.getArtist()+","+song.getTitle()+","
		+song.getAlbum()+","+song.getYear()+","+song.getTrack()+","+song.getComposer());
		song.showInfo();
		
	}
}
