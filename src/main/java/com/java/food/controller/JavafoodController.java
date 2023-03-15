package com.java.food.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.java.food.dto.FamousChartDTO;
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
	public String java2(Model model, HttpServletRequest request) {
		//DTO 값 가져옴
		FamousChartDTO dto = new FamousChartDTO();
		// 결과 전달 변수에 jsp 경로 지정
		String nextPage = "chart/chart";
		
		// songnumber 변수에 dto의 songnumber 가져옴
		String songnum = dto.getSongnumber();
		//  dto 데이터를 list로 가져와서 service에 getChart 메소드에 songnumber 전달
		List<FamousChartDTO> list = javaService.getChart(songnum);
			
		// Model에 list값 담음
		model.addAttribute("list", list);
		
		// 결과 페이지로 리턴
		return nextPage;

	}
	
	
	@RequestMapping(value = "/paging", method = RequestMethod.GET)
	public String java2_1(Model model, HttpServletRequest req) {
		List<FamousChartDTO> list = new ArrayList();
		int pageNum = 1;
		int countPerPage = 50;
		
		String songnum = " SELECT count(*) cnt FROM  Genre";
		if(req.getParameter("paging")!=null) {
			songnum = req.getParameter("paging");
		}
		
		// 페이징 
		String temp_pageNum = req.getParameter("pageNum");
		if(temp_pageNum != null) {
			pageNum = Integer.parseInt(temp_pageNum);
		}
		System.out.println("pageNum : " + pageNum);
		System.out.println("countPerPage : " + countPerPage);
		Map chart_paging = javaService.paging(songnum, pageNum, countPerPage);
		model.addAttribute("paging", chart_paging.get("list"));
		model.addAttribute("totalCount", chart_paging.get("totalCount"));
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("countPerPage", countPerPage);
		
		return temp_pageNum;
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
		String id = "id3"; //테스트 용 아이디.
		System.out.println("해당 플레이 리스트를 요청한 아이디 : " + id ); //확인용
		
		//Service에서 플레이 리스트를 불러오는 메서드 실행하기
		//메서드 실행 결과(리스트)를 필드에 담기
		List<PlayListDTO> playList = javaService.selectPlayList(id);
		System.out.println("javaService.selectPlayList가 가져온 최종 리스트 크기는 : " + playList.size() );
				
		//리스트를 담은 필드를 모델을 통해서 보내기
		model.addAttribute("playList", playList);
		
		return result;
	}
	
	@RequestMapping("playListContent")
	public String selectPlayListContent(HttpServletRequest request, Model model)
	{
		System.out.println("JavafoodController의 selectPlayListContent 메서드 실행됨."); //확인용
		
		String result = "playList/playListContent"; // /view/playList/playListContent.jsp로 이동.
		
		//주소에서 받은 값 가져오기
		String pl_id = request.getParameter("pl_id");
		System.out.println("selectPlayListContent 메서드를 실행하며 받은 pl_id의 값은 : " + pl_id); //확인용
		
		//Service에서 플레이 리스트 내역을 불러오는 메서드 실행하기
		//메서드 실행 결과(리스트)를 필드에 담기
		List<PlayListDTO> playListContent = javaService.selectPlayListContent(pl_id);
		System.out.println("javaService.selectPlayListContent가 가져온 최종 리스트 크기는 : " + playListContent); //확인용
		
		//리스트를 담은 필드를 모델을 통해서 보내기
		model.addAttribute("playListContent", playListContent);
		
		return result;
	}
	
	@RequestMapping("main")
	public String viewMain(Model model)
	{
		
		System.out.println("JavafoodController의 viewMain 메서드 실행됨.");
		
		String result = "main/main";
		
		//Service에서 인기 차트를 불러오는 메서드 실행하기
		//메서드 실행결과(리스트)를 필드에 담기
//		List<>
		
		return result;
	}
////////////////////////////////////////////////////////////
	//경용
	@RequestMapping (value = "/login")
	public String loginpage(Model mo,
			HttpServletRequest re,
			@RequestParam Map<String, Object> map
			 ){
		//로그인 정보 확인 or 세션ID에 로그인 id 값 저장
		if(map.get("ID")!=null) {
			mo.addAttribute("log",javaService.login(map));
			re.getSession().setAttribute("login", map.get("ID"));
		}
		if(map.get("Id1")!=null) {
			mo.addAttribute(javaService.addid(map));
		}
		//회원 가입 페이지 이동
		if(map.get("membership")!=null) {
			mo.addAttribute("membership",map.get("membership"));
		}
		return "lky/login";
	}
	@ResponseBody
	@RequestMapping("test")
	public String gd(login_DTO login_DTO) {
		
		return "";
	}
////////////////////////////////////////////////////////////
	//용준
	@RequestMapping (value = "/genre", method = RequestMethod.GET)
	public String java5(Model model,
			HttpServletRequest request) {
		// 페이징
				int pageNum = 1;		// 현재 페이지
				int countPerPage = 10;	// 한 페이지당 표시 수 

				// 장르별 리스트
				String song="발라드";
				if(request.getParameter("genre")!=null) {
					song = request.getParameter("genre");
				}
				// 페이징 
				String tmp_pageNum = request.getParameter("pageNum");
				if(tmp_pageNum != null) {
					pageNum = Integer.parseInt(tmp_pageNum);
				}
				System.out.println("song  전: " + song);
				System.out.println("pageNum : " + pageNum);
				System.out.println("countPerPage : " + countPerPage);
				Map genre_list = javaService.getGenre(song, pageNum, countPerPage);
				model.addAttribute("genre", genre_list.get("list"));
				model.addAttribute("totalCount", genre_list.get("totalCount"));
				model.addAttribute("pageNum", pageNum);
				model.addAttribute("countPerPage", countPerPage);
				model.addAttribute("song", song);
				System.out.println("song 후: " + song);
				
		return "lyj/genre";
	}
////////////////////////////////////////////////////////////
}
