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
import com.java.food.dto.login_DTO;

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
		 * 앨범 페이지 출력 메소드
		 * @param  : album > String (앨범이름)
		 * @return : list
		 */
		@Override
		public List viewAlbum(String album) {
			logger.info("JavafoodDAOImpl > viewAlbum 실행");
			List list = new ArrayList();
			list = sqlSession.selectList("mapper.javafood.viewAlbum", album);
			logger.info("Album list.size >>>"+list.size()); 
			
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
public List<FamousChartDTO> getChart(String songnumber) {
	List list = new ArrayList();
	list = sqlSession.selectList("mapper.javafood.getChart", songnumber);
	logger.info("list.size : "+ list.size());
	return list;
}

@Override
public List paging(String fc, int start, int end) {
	
	Map map = new HashMap();
	map.put("fc", fc);
	map.put("start", start);
	map.put("end", end);
	
	List list = sqlSession.selectList("mapper.javafood.paging", map);
	return list;
	
}

@Override
public int totalpage() {
	
	int totalcount = sqlSession.selectOne("mapper.javafood.totalpage");
	
	return totalcount;
}
////////////////////////////////////////////////////////////
//범주
@Override
/**
 * 플레이 리스트를 List에 담아 return 합니다.
 * 전달인자 : id(String)
 */
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

@Override
/**
 * 플레이 리스트의 내역(Content)를 List에 담아 return 합니다.
 * 전달인자 : 플레이 리스트의 id(String)
 */
public List<PlayListDTO> selectPlayListContent(String pl_id)
{
	System.out.println("JavafoodDAOImpl의 selectPlayList 메서드 실행됨."); //확인용
	
	List<PlayListDTO> result = null;
	
	//sql을 이용하여 DB에 접속 후 플레이 리스트 가져오기
//	//가져온 리스트를 필드에 담기
	result = sqlSession.selectList("mapper.javafood.selectPlayListContent", pl_id);
	System.out.println("sqlSession을 이용하여 가져온 리스트의 크기는 : " + result.size() ); //확인용
	
	return result;
}
////////////////////////////////////////////////////////////
//경용
/**
 * 아이디 리스트
 * @return list : 회원정보를 리턴해줍니다.
 */
public List<login_DTO> listID() {
	return sqlSession.selectList("mapper.javafood.login");
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
	public List getGenre(String genre, int start, int end) {
		
		Map map = new HashMap();
		map.put("genre", genre);
		map.put("start", start);
		map.put("end", end);
		
		List list = sqlSession.selectList("mapper.javafood.genre",map);
		return list;
	}
	
	// 페이징
	public int pagetotal() {
		int totalcnt = sqlSession.selectOne("mapper.javafood.pagetotal");
		System.out.println(totalcnt);
		return totalcnt;
	}

	


////////////////////////////////////////////////////////////

}
