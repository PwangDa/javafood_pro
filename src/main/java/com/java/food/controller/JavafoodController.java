package com.java.food.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JavafoodController {
////////////////////////////////////////////////////////////
	@RequestMapping
	public void java1() {
		//다영
	}
////////////////////////////////////////////////////////////
	@RequestMapping
	public void java2() {
		//귀범
	}
////////////////////////////////////////////////////////////
	@RequestMapping
	public void java3() {
		//범주
	}
////////////////////////////////////////////////////////////
	@RequestMapping (value = "login/mypage", method = RequestMethod.GET)
	public void java4() {
		//경용
	}
////////////////////////////////////////////////////////////
	@RequestMapping
	public void java5() {
		//용준
	}
////////////////////////////////////////////////////////////
}
