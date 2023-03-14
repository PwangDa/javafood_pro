package com.java.food.controller;

import javax.servlet.http.HttpServletRequest;

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
	@RequestMapping("playList")
	public void selectPlayList(HttpServletRequest request)
	{
		//범주
		System.out.println("JavafoodController의 selectPlayList 메서드 실행됨.");//확인용
		System.out.println("해당 플레이 리스트를 요청한 아이디 : " + request.getSession().getAttribute("login") );
		
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
