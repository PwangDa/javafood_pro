package com.java.food.dto;

public class PlayListDTO
{
	private String pl_title;
	private String pl_explain;
	private String id;
	private int pl_id;
	private String songName;
	private int listNumber;
	private int songNumber;
	private String artistName;
	private String imageLink;
	private String album;
	private String link;
	
	
	
	
	
	

	//getter setter
	public String getpl_title() {
		return pl_title;
	}
	public void setpl_title(String pl_title) {
		this.pl_title = pl_title;
	}
	public String getpl_explain() {
		return pl_explain;
	}
	public void setpl_explain(String pl_explain) {
		this.pl_explain = pl_explain;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPl_id() {
		return pl_id;
	}
	public void setPl_id(int pl_id) {
		this.pl_id = pl_id;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public int getListNumber() {
		return listNumber;
	}
	public void setListNumber(int listNumber) {
		this.listNumber = listNumber;
	}
	public int getSongNumber() {
		return songNumber;
	}
	public void setSongNumber(int songNumber) {
		this.songNumber = songNumber;
	}
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public String getimageLink() {
		return imageLink;
	}
	public void setimageLink(String imageLink) {
		this.imageLink = imageLink;
	}
	public String getAlbum() {
		return album;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
}
