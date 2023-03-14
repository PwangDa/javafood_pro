package com.java.food.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.java.food.dto.PlayListDTO;
import com.java.food.dto.login_DTO;
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
	
	@RequestMapping(value = "/albumpage", method = RequestMethod.GET)
	public String java1_1(Model model,
			@RequestParam("album") String album
			) {
		System.out.println("앨범페이지 접속");
		System.out.println("album >>" + album);
		//아티스트 소개 페이지 출력 메소드(전달요소 > 아티스트명)
		List album_list = javaService.getAlbum(album);
		//댓글 출력 메소드(전달요소 > 아티스트명)
		
		model.addAttribute("album_list", album_list);
		
		return "hdy/Album";
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
		System.out.println("JavafoodController의 최종 리스트 크기는 : " + playList.size() );
				
		//리스트를 담은 필드를 모델을 통해서 보내기
		model.addAttribute("playList", playList);
		
		return result;
	}
////////////////////////////////////////////////////////////
	//경용
	@RequestMapping (value = "/login", method = RequestMethod.GET)
	public String loginpage(Model mo,
			@RequestParam(value = "Id1",required = false) String Id1,
			@RequestParam(value = "PW1",required = false) String PW1,
			@RequestParam(value = "name",required = false) String name,
			@RequestParam(value = "nic",required = false) String nic,
			@RequestParam(value = "mail",required = false) String mail,
			@RequestParam(value = "pn1",required = false) String pn1,
			@RequestParam(value = "pn2",required = false) String pn2,
			@RequestParam(value = "phone1",required = false) String phone1,
			@RequestParam(value = "phone2",required = false) String phone2,
			@RequestParam(value = "phone3",required = false) String phone3,
			@RequestParam(value = "page",required = false) String page
			 ){
		if(Id1!=null) {
			login_DTO dto = new login_DTO();
			dto.setId(Id1);
			dto.setPw(PW1);
			dto.setNic(nic);
			dto.setName(name);
			dto.setId(mail);
			dto.setPn(pn1+"-"+pn2);
			dto.setPhone(phone1+"-"+phone2+"-"+phone3);
			mo.addAttribute(javaService.addid(dto));
		}
		if(page!=null) {
			mo.addAttribute("membership",page);
		}
		mo.addAttribute(javaService.urselist());
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
