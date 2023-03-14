package com.java.food.controller;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JavafoodController {
	@RequestMapping(value = "/dsaa",method = RequestMethod.GET)
	public String java(
			
//			if(@RequestParam("me",Required=false) String ur ==null) {
//				
//			}
			
			@RequestParam(value = "me",required=false) String url
			) {
		System.out.println("접속");
		if(url != null) {
			if(url.equals("login/mypage")) {
				ja();
			}
			
		}else {
			url="menu";
		}
		
		return url;
	}
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
	public void java3()
	{
		//범주
	}
////////////////////////////////////////////////////////////
	//경용
	@RequestMapping (value = "/login/mypage", method = RequestMethod.GET)
	public String java4() {
		System.out.println("ddd");
		return "lky/login";
	}
	
	public String ja() {
		return "lky/login";
	}
////////////////////////////////////////////////////////////
	@RequestMapping (value = "/genre", method = RequestMethod.GET)
	public void java5() {
		//용준
	}
////////////////////////////////////////////////////////////
}
