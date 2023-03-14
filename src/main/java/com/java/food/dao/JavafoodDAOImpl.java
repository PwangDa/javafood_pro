package com.java.food.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.food.dto.GenreDTO;
import com.java.food.dto.playListDTO;

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
			logger.info("list.size >>>"+list.size()); 
			
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
			logger.info("JavafoodDAOImpl > viewArtist 실행");
			List list = new ArrayList();
			list = sqlSession.selectList("mapper.javafood.viewComment", artist);
			logger.info("list.size >>>"+list.size()); 
			
			return list;
		}

////////////////////////////////////////////////////////////
//귀범
public List selectChart() {
	List list = sqlSession.selectList("mapper.javafood");
	
	logger.info("list.size : "+ list.size());
	return list;
}
////////////////////////////////////////////////////////////
//범주
@Override
public List<playListDTO> selectPlayList(String id)
{
	List<playListDTO> result = null;
	
	
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
		
		return null;
	}
	
	// 페이징
	public int pagetotal() {
	
		return 0;
	}

////////////////////////////////////////////////////////////

}
