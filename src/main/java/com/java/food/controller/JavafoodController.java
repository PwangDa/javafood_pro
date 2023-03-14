package com.java.food.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.java.food.dto.PlayListDTO;
import com.java.food.service.JavafoodService;

@Controller
public class JavafoodController {
	
	@Autowired
	JavafoodService javaService;

////////////////////////////////////////////////////////////
	//다영
	@RequestMapping(value = "/artistpage", method = RequestMethod.GET)
	public String java1(Model model,
			@RequestParam("artist") String artist
			) {
		System.out.println("아티스트페이지 접속");
		System.out.println("artist >" + artist);
		//아티스트 소개 페이지 출력 메소드(전달요소 > 아티스트명)
		List artist_list = javaService.getArtist(artist);
		//댓글 출력 메소드(전달요소 > 아티스트명)
		List comment_list = javaService.getComment(artist);
		
		model.addAttribute("album_list", artist_list);
		model.addAttribute("commentList", comment_list);
		
		return "hdy/artist";
	}
////////////////////////////////////////////////////////////
	//귀범
	@RequestMapping(value = "/chart", method = RequestMethod.GET)
	public String java2(Model model, @RequestParam("songnumber") Integer songnumber) {
		List chart = javaService.getChart();
		
		model.addAttribute("chart", chart);
		
		return "chart/chart";
		
		
	}
////////////////////////////////////////////////////////////
	//범주
	@RequestMapping("playList")
	public String selectPlayList(HttpServletRequest request, Model model)
	{
		String result = "playList/playList"; // /view/playList/playList.jsp로 이동.
		
		System.out.println("JavafoodController의 selectPlayList 메서드 실행됨."); //확인용
		
		//세션에 저장된 id값 받아오기
//		String id = (String)request.getSession().getAttribute("login");
		String id = "testAdmin"; //테스트 용 아이디.
		System.out.println("해당 플레이 리스트를 요청한 아이디 : " + id ); //확인용
		
		//Service에서 플레이 리스트를 불러오는 메서드 실행하기
		//메서드 실행 결과(리스트)를 필드에 담기
		List<PlayListDTO> playList = javaService.selectPlayList(id);
		System.out.println("javaService.selectPlayList가 가져온 최종 리스트 크기는 : " + playList.size() );
				
		//리스트를 담은 필드를 모델을 통해서 보내기
		model.addAttribute("playList", playList);
		
		return result;
	}
	
	@RequestMapping("plsyListContent")
	public String selectPlayListContent(HttpServletRequest request, Model model)
	{
		System.out.println("JavafoodController의 selectPlayListContent 메서드 실행됨."); //확인용
		
		String result = "playList/playListContent"; // /view/playList/playListContent.jsp로 이동.
		
		//주소에서 받은 값 가져오기
		String pl_id = request.getParameter("pl_id");
		System.out.println("selectPlayListContent 메서드를 실행하며 받은 pl_id의 값은 : " + pl_id); //확인용
		
		//Service에서 플레이 리스트 내역을 불러오는 메서드 실행하기
		//메서드 실행 결과(리스트)를 필드에 담기
//		List<PlayListDTO> playListContent = javaService.selectPlayListContent(pl_id);
//		System.out.println("javaService.selectPlayListContent가 가져온 최종 리스트 크기는 : " + playListContent); //확인용
		
		//리스트를 담은 필드를 모델을 통해서 보내기
//		model.addAttribute("playListContent", playListContent);
		
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
	//용준
	@RequestMapping (value = "/genre", method = RequestMethod.GET)
	public String java5() {
		
		return "lyj/Genre";
	}
////////////////////////////////////////////////////////////
}
