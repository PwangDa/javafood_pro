package com.java.food.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.java.food.service.JavafoodService;

@Controller
public class JavafoodController {
	
	@Autowired
	JavafoodService javaService;
	
////////////////////////////////////////////////////////////
	//다영
	@RequestMapping(value = "/artist", method = RequestMethod.GET)
	public String java1(Model model,
			@RequestParam("artist") String artist
			) {
		System.out.println("아티스트페이지 접속");
		System.out.println("artist >" + artist);
		List artist_list = javaService.getArtist(artist);
		List comment_list = javaService.getComment(artist);
		
		model.addAttribute("album_list", artist_list);
		model.addAttribute("commentList", comment_list);
		
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
