package com.java.food.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.food.dto.FamousChartDTO;
import com.java.food.dto.GenreDTO;
import com.java.food.dto.PlayListDTO;

@Repository
public class JavafoodDAOImpl implements JavafoodDAO {
	
private static final Logger logger = LoggerFactory.getLogger(JavafoodDAOImpl.class);

@Autowired
SqlSession sqlSession;

////////////////////////////////////////////////////////////
//다영
		/**
		 * 다영
		 * 아티스트 페이지 출력 메소드
		 * 전달인자 : String (아티스트 이름)
		 * @return : list
		 */
		@Override
		public List viewArtist(String artist) {
			logger.info("JavafoodDAOImpl > viewArtist 실행");
			List list = new ArrayList();
			list = sqlSession.selectList("mapper.javafood.viewArtist", artist);
			logger.info("Artist list.size >>>"+list.size()); 
			
			return list;
		}

		/**
		 * 다영
		 * 댓글 출력 메소드
		 * 전달인자 : String (아티스트 이름)
		 * @return : list
		 */
		@Override
		public List viewComment(String artist) {
			logger.info("JavafoodDAOImpl > viewComment 실행");
			List list = new ArrayList();
			list = sqlSession.selectList("mapper.javafood.viewComment", artist);
			logger.info("Comment list.size >>>"+list.size()); 
			
			return list;
		}

////////////////////////////////////////////////////////////
//귀범

@Override
public List<FamousChartDTO> selectChart(String songnumber) {
	List list = new ArrayList();
	list = sqlSession.selectList("mapper.javafood.selectChart", songnumber);
	logger.info("list.size : "+ list.size());
	return list;
}

public Map selectPaging(String fc, int start, int end) {
	
	Map map = new HashMap();
	map.put("start", start);
	map.put("end", end);
	return null;
	
}
////////////////////////////////////////////////////////////
//범주
@Override
public List<PlayListDTO> selectPlayList(String id)
{
	System.out.println("JavafoodDAOImpl의 selectPlayList 메서드 실행됨."); //확인용
	
	List<PlayListDTO> result = null;
	
	//sql을 이용하여 DB에 접속 후 플레이 리스트 가져오기
	//가져온 리스트를 필드에 담기
	result = sqlSession.selectList("mapper.javafood.selectPlayList", id);
	System.out.println("sqlSession을 이용하여 가져온 리스트의 크기는 : " + result.size() ); //확인용
	
	return result;
}
////////////////////////////////////////////////////////////
//경용
	public String test() {
		return null;
	}
////////////////////////////////////////////////////////////
//용준
	// 장르별
	public List<GenreDTO> getGenre(String a, int start, int end) {
		
		Map map = new HashMap();
		map.put("start", start);
		map.put("end", end);
		return null;
	}
	
	// 페이징
	public int pagetotal() {
	
		return 0;
	}

	


////////////////////////////////////////////////////////////

}
