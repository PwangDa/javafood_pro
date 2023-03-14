package com.java.food.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.food.dao.JavafoodDAO;

@Service
public class JavafoodServiceImpl implements JavafoodService {

	@Autowired
	JavafoodDAO javadao;
////////////////////////////////////////////////////////////
//다영

////////////////////////////////////////////////////////////
//귀범
	@Override
	public List getChart() {
		List list = null;

		list = javadao.selectChart();

		return javadao.selectChart();

	}
////////////////////////////////////////////////////////////
//범주

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
		List list = javadao.getGenre(song, start, end);
		int totalCount = javadao.pagetotal();

		Map map = new HashMap();
		map.put("list", list);
		map.put("totalCount", totalCount);
		return map;

	}

////////////////////////////////////////////////////////////

}
