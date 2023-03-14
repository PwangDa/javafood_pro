package com.java.food.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.food.dao.JavafoodDAO;
import com.java.food.dto.login_DTO;

@Service
public class JavafoodServiceImpl implements JavafoodService {

	@Autowired
	JavafoodDAO javaDAO;
////////////////////////////////////////////////////////////
//다영
	/**
	 * 다영
	 * 아티스트 페이지 출력 메소드
	 * 전달인자 : String (아티스트 이름)
	 * @return : list
	 */
	@Override
	public List getArtist(String artist) {
		List Artist_list = javaDAO.viewArtist(artist);
		
		return Artist_list;
	}
	/**
	 * 다영
	 * 댓글 출력 메소드
	 * 전달인자 : String (아티스트 이름)
	 * @return : list
	 */
	@Override
	public List getComment(String artist) {
		List Comment_list = javaDAO.viewComment(artist);
		
		return Comment_list;
		
	}
////////////////////////////////////////////////////////////
//귀범
	@Override
	public List getChart(String fam, int pageNum, int countPerPage) {
		
		
		int start = 0;
		int end = 0;
		start = (countPerPage * (pageNum - 1)) + 1;
		end = start + countPerPage - 1;
		
		
		List list = null;
		
		Map map = new HashMap();

		
		list = javaDAO.selectChart(fam, start, end);
		
		return javaDAO.selectChart(fam, start, end);
		
	}
////////////////////////////////////////////////////////////
//범주
	@Override
	public List selectPlayList(String id)
	{
		List result = null;
		
//		result = javaDAO.selectPlayList(id);
		
		return result;
	}
////////////////////////////////////////////////////////////
//경용
	//회원 목록
	@Override
	public List urselist() {
		return javaDAO.listID();
	}
	//회원가입
	@Override
	public int addid(login_DTO vo) {
		return javaDAO.addId(vo);
	}
////////////////////////////////////////////////////////////
	// 용준 장르별 페이징

	@Override
	public Map getGenre(String song, int pageNum, int countPerPage) {
		System.out.println("6번 장르 실행");
		

		int start = 0;
		int end = 0;
		start = (countPerPage * (pageNum - 1)) + 1;
		end = start + countPerPage - 1;
		List list = javaDAO.getGenre(song, start, end);
		int totalCount = javaDAO.pagetotal();

		Map map = new HashMap();
		map.put("list", list);
		map.put("totalCount", totalCount);
		return map;

	}

////////////////////////////////////////////////////////////

}
