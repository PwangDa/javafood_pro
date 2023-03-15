package com.java.food.dao;

import java.util.List;
import java.util.Map;

import com.java.food.dto.FamousChartDTO;
import com.java.food.dto.PlayListDTO;
import com.java.food.dto.login_DTO;

public interface JavafoodDAO {
	
////////////////////////////////////////////////////////////
//다영
	List viewArtist(String artist);
	
	List viewComment(String artist);
	
	List viewAlbum(String album);
	
////////////////////////////////////////////////////////////
//귀범
	// 차트용
	List<FamousChartDTO> getChart(String songnumber);
	// 페이징
	List paging(String fc, int start, int end);
	int totalpage();
	
////////////////////////////////////////////////////////////
//범주
	List<PlayListDTO> selectPlayList(String id);
	List<PlayListDTO> selectPlayListContent(String pl_id);
////////////////////////////////////////////////////////////
//경용
	//로그인 정보 확인
	List<login_DTO> listID(); 
	//회원가입
	int addId(login_DTO dto);
////////////////////////////////////////////////////////////
//용준
	// 장르
	List getGenre(String genre, int start, int end);
	
	// 페이징
	int pagetotal();
////////////////////////////////////////////////////////////

	

}
