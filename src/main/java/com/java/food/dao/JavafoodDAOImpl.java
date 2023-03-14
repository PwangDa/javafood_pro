package com.java.food.dao;

import java.sql.SQLException;
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
import com.java.food.dto.login_DTO;
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
public List<FamousChartDTO> selectChart(String fc, int start, int end) {
	List list = sqlSession.selectList("mapper.javafood");
	
	logger.info("list.size : "+ list.size());
	return list;
}

public int totalpaging() {
    List<FamousChartDTO> list = new ArrayList<FamousChartDTO>();
    int totalcount = 0;
    
    return totalcount;
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
/**
 * 아이디 리스트
 * @return list : 회원정보를 리턴해줍니다.
 */
public List listID() {
	List list = new ArrayList();
	list = sqlSession.selectList("mapper.javafood.login");
	return list;
}
/**
 * 회원가입
 * @param vo : 가입할 회원정보 DTO를 넣어줍니다.
 */
public int addId(login_DTO vo) {
	int i =0;
	try {
		sqlSession.selectList("mapper.javafood.newures",vo);
		i=1;
	} catch (Exception e) {
		e.printStackTrace();
	}
	return i;
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
