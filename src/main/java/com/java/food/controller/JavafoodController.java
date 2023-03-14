package com.java.food.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JavafoodController {
////////////////////////////////////////////////////////////
	@RequestMapping(value = "/artist")
	public void java1() {
		//다영
	}
////////////////////////////////////////////////////////////
	@RequestMapping(value = "chart", method = RequestMethod.GET)
	public void java2() {
		//귀범
	}
////////////////////////////////////////////////////////////
	@RequestMapping("playList")
	public void java3() {
		//범주
	}
////////////////////////////////////////////////////////////
	//경용
	@RequestMapping (value = "/login/mypage", method = RequestMethod.GET)
	public String java4() {
		System.out.println("ddd");
		return "lky/login";
	}
////////////////////////////////////////////////////////////
	//용준
	@RequestMapping (value = "/genre", method = RequestMethod.GET)
	public String java5() {
		
		return "lyj/Genre";
	}
////////////////////////////////////////////////////////////
}
