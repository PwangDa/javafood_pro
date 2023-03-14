package com.java.food.dao;

import java.util.List;
import java.util.Map;

import com.java.food.dto.FamousChartDTO;
import com.java.food.dto.PlayListDTO;

public interface JavafoodDAO {
	
////////////////////////////////////////////////////////////
//다영
	List viewArtist(String artist);
	
	List viewComment(String artist);
	
////////////////////////////////////////////////////////////
//귀범
	// 차트용
	List<FamousChartDTO> selectChart(String songnumber);
	// 페이징
	Map selectPaging(String fc, int start, int end);
	
////////////////////////////////////////////////////////////
//범주
	List<PlayListDTO> selectPlayList(String id);
	List<PlayListDTO> selectPlayListContent(String pl_id);
////////////////////////////////////////////////////////////
//경용
	String test(); 
////////////////////////////////////////////////////////////
//용준
	// 장르
	List getGenre(String a, int start, int end);
	
	// 페이징
	int pagetotal();
////////////////////////////////////////////////////////////

	

}
