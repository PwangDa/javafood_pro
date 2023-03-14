package com.java.food.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.java.food.service.JavafoodService;

@Controller
public class JavafoodController {
	
	JavafoodService javaService;

	@RequestMapping(value = "/dsaa",method = RequestMethod.GET)
	public String java(
			
			
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
	@Autowired
	
////////////////////////////////////////////////////////////
	//다영
	@RequestMapping(value = "/artistpage", method = RequestMethod.GET)
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
	@RequestMapping(value = "/chart", method = RequestMethod.GET)
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
		
//		List playList = javaService.selectPlayList(id);
				
	
		return result;
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
	//용준
	@RequestMapping (value = "/genre", method = RequestMethod.GET)
	public String java5() {
		
		return "lyj/Genre";
	}
////////////////////////////////////////////////////////////
}
