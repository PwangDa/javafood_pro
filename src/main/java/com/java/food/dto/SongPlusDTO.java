package com.java.food.dto;

public class SongPlusDTO {
	
	private String album_num;	//시퀀스로 올라감
	private String album_cover; //앨범링크
	private String album_name;	 //앨범명
	private String album_into;	 //앨범소개
	private String artist;		//가수이름
	private String artist_info;		//가수소개
	private String artist_img;	//가수이미지
	private String artistname;	 	
	
	private String album_key;	//앨범 1 설정중
	private String music_num;	//시퀀스로 올라감
	private String music_name;	//음악이름
	private String music_link;	//음악링크
	private String music_time;	//음악타임
	
	public String getArtist_img() {
		return artist_img;
	}
	public void setArtist_img(String artist_img) {
		this.artist_img = artist_img;
	}
	
	public String getArtist_info() {
		return artist_info;
	}
	public void setArtist_info(String artist_info) {
		this.artist_info = artist_info;
	}
	public String getArtistname() {
		return artistname;
	}
	public void setArtistname(String artistname) {
		this.artistname = artistname;
	}
	
	public String getAlbum_num() {
		return album_num;
	}
	public void setAlbum_num(String album_num) {
		this.album_num = album_num;
	}
	public String getAlbum_cover() {
		return album_cover;
	}
	public void setAlbum_cover(String album_cover) {
		this.album_cover = album_cover;
	}
	public String getAlbum_name() {
		return album_name;
	}
	public void setAlbum_name(String album_name) {
		this.album_name = album_name;
	}
	public String getAlbum_into() {
		return album_into;
	}
	public void setAlbum_into(String album_into) {
		this.album_into = album_into;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum_key() {
		return album_key;
	}
	public void setAlbum_key(String album_key) {
		this.album_key = album_key;
	}
	public String getMusic_num() {
		return music_num;
	}
	public void setMusic_num(String music_num) {
		this.music_num = music_num;
	}
	public String getMusic_name() {
		return music_name;
	}
	public void setMusic_name(String music_name) {
		this.music_name = music_name;
	}
	public String getMusic_link() {
		return music_link;
	}
	public void setMusic_link(String music_link) {
		this.music_link = music_link;
	}
	public String getMusic_time() {
		return music_time;
	}
	public void setMusic_time(String music_time) {
		this.music_time = music_time;
	}

}
