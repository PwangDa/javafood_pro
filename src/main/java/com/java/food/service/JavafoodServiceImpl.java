package com.java.food.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.food.dao.JavafoodDAO;
import com.java.food.dto.PlayListDTO;
import com.java.food.dto.FamousChartDTO;

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
	// 차트
	@Override
	public List getChart(){
		
		String songnumber = null;
		
		List<FamousChartDTO> chartlist = javaDAO.selectChart(songnumber);
		
		return chartlist;
		
		
	}
	
	// 페이징
	public Map getChart2(String fc, int pageNum, int countPerPage) {
		
		int start = 0;
		int end = 0;
		start = (countPerPage * (pageNum - 1)) + 1;
		end = start + countPerPage - 1;
		List list = javaDAO.getGenre(fc, start, end);
		int totalCount = javaDAO.pagetotal();

		Map map = new HashMap();
		map.put("list", list);
		map.put("totalCount", totalCount);
		return map;
		
	}
////////////////////////////////////////////////////////////
//범주
	/**
	 * 작성자 : 김범주
	 * 플레이 리스트를 불러옵니다.
	 * 리턴 타입 : PlayListDTO를 담은 List.
	 */
	@Override
	public List<PlayListDTO> selectPlayList(String id)
	{
		System.out.println("JavafoodServicelImpl의 selectPlayList 메서드 실행됨."); //확인용
		List<PlayListDTO> result = null;
		
		//JavafoodDAO의 selectPlayList 메서드를 실행하기
		//메서드의 결과(List)를 필드에 담기
		result = javaDAO.selectPlayList(id);
		System.out.println("javaDAO의 selectPlayList를 실행하여 얻은 리스트의 크기 : " + result.size() ); //확인용
		
		return result;
	}
	
	/**
	 * 작성자 : 김범주
	 * 플레이 리스트 내역(Content)를 불러옵니다.
	 * 리턴 타입 : PlayListDTO를 담은 List.
	 */
	@Override
	public List<PlayListDTO> selectPlayListContent(String pl_id)
	{
		System.out.println("JavafoodServicelImpl의 selectPlayListContent 메서드 실행됨."); //확인용
		List<PlayListDTO> result = null;
		
		//JavafoodDAO의 selectPlayList 메서드를 실행하기
		//메서드의 결과(List)를 필드에 담기
//		result = javaDAO.selectPlayListContent(pl_id);
		System.out.println("javaDAO의 selectPlayList를 실행하여 얻은 리스트의 크기 : " + result.size() ); //확인용
		
		return result;
	}
////////////////////////////////////////////////////////////
//경용
	@Override
	public List list() {
		return null;
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
