package com.java.food.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.food.dao.JavafoodDAO;
import com.java.food.dto.FamousChartDTO;
import com.java.food.dto.PlayListDTO;
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
	/**
	 * 다영
	 * 댓글 출력 메소드
	 * 전달인자 : String (아티스트 이름)
	 * @return : list
	 */
	@Override
	public List getAlbum(String album) {
		List Album_list = javaDAO.viewAlbum(album);
		
		return Album_list;
		
	}
////////////////////////////////////////////////////////////
//귀범
	// 차트
	/**
	 * 인기차트 출력 메소드
	 * 전달인자 : String 노래번호
	 * @return : list
	 */
	@Override
	public List<FamousChartDTO> getChart(String songnumber){
		
		List<FamousChartDTO> chartlist = null;
		
		chartlist = javaDAO.getChart(songnumber);
		
		return chartlist;
		
		
	}
	
	// 페이징
	/**
	 * 페이징 출력 메소드
	 * 전달인자 : 노래번호, 페이지넘버, 출력개수
	 * @return : map
	 */
	@Override
	public Map paging(String songnum, int pageNum, int countPerPage) {

		int start = 0;
		int end = 0;
		start = (countPerPage * (pageNum - 1)) + 1;
		end = start + countPerPage - 1;
		List list = javaDAO.paging(songnum, start, end);
		int totalCount = javaDAO.totalpage();
		
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
	//회원 목록
	@Override
	public List urselist() {
		return javaDAO.listID();
	}
	//회원가입
	@Override
	public int addid (Map<String, Object> map) {
		login_DTO dto = new login_DTO();
		dto.setId( (String) map.get("Id1") );
		dto.setPw( (String) map.get("PW1") );
		dto.setNic( (String) map.get("nic") );
		dto.setName( (String) map.get("name") );
		dto.setEmail( (String) map.get("mail") );
		dto.setPn( (String) map.get("pn1")+"-"+map.get("pn2") );
		dto.setPhone( (String) map.get("phone1")+"-"+map.get("phone2")+"-"+map.get("phone3") );
		return javaDAO.addId(dto);
	}
////////////////////////////////////////////////////////////
	// 용준 장르별 페이징

	@Override
	public Map getGenre(String song, int pageNum, int countPerPage) {
		

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
