package com.java.food.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.food.dto.GenreDTO;

@Repository
public class JavafoodDAOImpl implements JavafoodDAO {
	
private static final Logger logger = LoggerFactory.getLogger(JavafoodDAOImpl.class);

@Autowired
SqlSession sqlSession;

////////////////////////////////////////////////////////////
//다영

////////////////////////////////////////////////////////////
//귀범
public List selectChart() {
	List list = sqlSession.selectList("mapper.javafood");
	
	logger.info("list.size : "+ list.size());
	return list;
}
////////////////////////////////////////////////////////////
//범주

////////////////////////////////////////////////////////////
//경용
	public String test() {
		return null;
	}
////////////////////////////////////////////////////////////
//용준
	public List<GenreDTO> getGenre(String a, int start, int end) {
		
		return null;
	}

////////////////////////////////////////////////////////////

}
