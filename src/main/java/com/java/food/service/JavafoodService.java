package com.java.food.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

<<<<<<< HEAD
import com.java.food.dto.login_DTO;
import com.java.food.dto.playListDTO;
=======
import com.java.food.dto.PlayListDTO;
>>>>>>> acfe032095a82c2481308922d241d7fd304ca6f5

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
