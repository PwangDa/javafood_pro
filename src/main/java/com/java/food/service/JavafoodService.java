package com.java.food.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.java.food.dto.PlayListDTO;
import com.java.food.dto.login_DTO;

@Service
public interface JavafoodService {
////////////////////////////////////////////////////////////
//다영
	List getArtist(String artist);
	List getComment(String artist);
////////////////////////////////////////////////////////////
//귀범
	List getChart();
	Map getChart2(String fc, int pageNum, int countPerPage);
////////////////////////////////////////////////////////////
//범주
	List<PlayListDTO> selectPlayList(String id);
////////////////////////////////////////////////////////////
//경용
	List urselist();
	int addid(login_DTO vo);

////////////////////////////////////////////////////////////
//용준
	// 장르
	Map getGenre(String song, int pageNum, int countPerPage);
	
////////////////////////////////////////////////////////////
	
}
