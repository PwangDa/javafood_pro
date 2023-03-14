package com.java.food.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.food.dao.JavafoodDAO;

@Service
public class JavafoodServiceImpl implements JavafoodService {
	
	@Autowired
	JavafoodDAO javaDAO;
////////////////////////////////////////////////////////////
//다영
	@Override
	public List getArtist(String artist){
		List Artist_list = javaDAO.viewArtist(artist);
		
		return Artist_list;
	}
	@Override
	public List getComment(String artist) {
		List Comment_list = javaDAO.viewComment(artist);
		
		return Comment_list;
		
	}
////////////////////////////////////////////////////////////
//귀범
	@Override
	public List getChart() {
		List list = null;
		
		list = javaDAO.selectChart();
		
		return javaDAO.selectChart();
		
	}
////////////////////////////////////////////////////////////
//범주

////////////////////////////////////////////////////////////
//경용
	@Override
	public List list(){
		return null;
	}
////////////////////////////////////////////////////////////
//용준

////////////////////////////////////////////////////////////

}
