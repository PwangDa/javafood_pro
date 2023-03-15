package com.java.food.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.java.food.dto.FamousChartDTO;
import com.java.food.dto.PlayListDTO;
import com.java.food.dto.login_DTO;

@Service
public interface JavafoodService {
////////////////////////////////////////////////////////////
//다영
	List getArtist(String artist);
	List getComment(String artist);
	List getAlbum(String album);
////////////////////////////////////////////////////////////
//귀범
	List<FamousChartDTO> getChart(String songnumber);
	Map paging(String songnum, int pageNum, int countPerPage);
////////////////////////////////////////////////////////////
//범주
	List<PlayListDTO> selectPlayList(String id);
	List<PlayListDTO> selectPlayListContent(String pl_id);
////////////////////////////////////////////////////////////
//경용
	//로그인
	Map login(Map<String, Object> map);
	//회원가입
	int addid(Map<String, Object> map);

////////////////////////////////////////////////////////////
//용준
	// 장르
	Map getGenre(String song, int pageNum, int countPerPage);
	
////////////////////////////////////////////////////////////
	
}
