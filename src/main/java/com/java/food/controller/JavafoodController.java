package com.java.food.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JavafoodController {
////////////////////////////////////////////////////////////
	//다영
	@RequestMapping(value = "/artist")
	public String java1() {
		System.out.println("아티스트페이지 접속");
		return "hdy/artist";
	}
////////////////////////////////////////////////////////////
	@RequestMapping(value = "chart", method = RequestMethod.GET)
	public void java2() {
		//귀범
	}
////////////////////////////////////////////////////////////
	//범주
	@RequestMapping("playList")
	public String selectPlayList(HttpServletRequest request)
	{
		String result = "playList/playList"; 
		
		System.out.println("JavafoodController의 selectPlayList 메서드 실행됨."); //확인용
		
		//세션에 저장된 id값 받아오기
		String id = (String)request.getSession().getAttribute("login");
		System.out.println("해당 플레이 리스트를 요청한 아이디 : " + id ); //확인용
		
		//Service에서 플레이 리스트를 불러오는 메서드 실행하기
		//메서드 실행 결과(리스트)를 리스트에 담기
		
		List playList = 
				
	
		return result;
	}
////////////////////////////////////////////////////////////
	//경용
	@RequestMapping (value = "/login/mypage", method = RequestMethod.GET)
	public String java4() {
		System.out.println("ddd");
		return "lky/login";
	}
////////////////////////////////////////////////////////////
	@RequestMapping (value = "/genre", method = RequestMethod.GET)
	public void java5() {
		//용준
	}
////////////////////////////////////////////////////////////
}
