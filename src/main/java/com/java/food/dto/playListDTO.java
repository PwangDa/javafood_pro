package com.java.food.dto;

public class playListDTO
{
	private String listTitle;
	private String listExplain;
	private String id;
	private int pl_id;
	private String songName;
	private int listNumber;
	private int songNumber;
	private String artistName;
	private String imgLink;
	private String album;
	
	
	
	
	
	
	//getter setter
	public String getListTitle() {
		return listTitle;
	}
	public void setListTitle(String listTitle) {
		this.listTitle = listTitle;
	}
	public String getListExplain() {
		return listExplain;
	}
	public void setListExplain(String listExplain) {
		this.listExplain = listExplain;
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
	public String getImgLink() {
		return imgLink;
	}
	public void setImgLink(String imgLink) {
		this.imgLink = imgLink;
	}
	public String getAlbum() {
		return album;
	}
}
