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
