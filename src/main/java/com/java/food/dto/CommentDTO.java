package com.java.food.dto;

import java.sql.Date;

public class CommentDTO {
	
	private String comment_num;
	private String comment_id;
	private String comment_cont;
	private Date comment_Date;
	private int level;
	private int articleNO;
	private int parentNO = 0;
	private int artistlist_num;
	private String artistname;
	private String myimg;
	private String id;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMyimg() {
		return myimg;
	}
	public void setMyimg(String myimg) {
		this.myimg = myimg;
	}
	public String getArtistname() {
		return artistname;
	}
	public void setArtistname(String artistname) {
		this.artistname = artistname;
	}
	public int getArtistlist_num() {
		return artistlist_num;
	}
	public void setArtistlist_num(int artistlist_num) {
		this.artistlist_num = artistlist_num;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getArticleNO() {
		return articleNO;
	}
	public void setArticleNO(int articleNO) {
		this.articleNO = articleNO;
	}
	public int getParentNO() {
		return parentNO;
	}
	public void setParentNO(int parentNO) {
		this.parentNO = parentNO;
	}
	
	
	public String getComment_num() {
		return comment_num;
	}
	public void setComment_num(String comment_num) {
		this.comment_num = comment_num;
	}
	public String getComment_id() {
		return comment_id;
	}
	public void setComment_id(String comment_id) {
		this.comment_id = comment_id;
	}
	public String getComment_cont() {
		return comment_cont;
	}
	public void setComment_cont(String comment_cont) {
		this.comment_cont = comment_cont;
	}
	public Date getComment_Date() {
		return comment_Date;
	}
	public void setComment_Date(Date comment_Date) {
		this.comment_Date = comment_Date;
	}


}
