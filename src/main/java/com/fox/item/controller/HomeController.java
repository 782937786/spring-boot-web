package com.fox.item.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {
	 
	@RequestMapping(value="/home")
	public String home(){
		System.out.println("redirect to home page!");
		return "index";
	}
	
	@RequestMapping(value="/home/page")
	@ResponseBody
	public ModelAndView goHome(){
		System.out.println("go to the home page!");
		ModelAndView mode = new ModelAndView();
		mode.addObject("name", "zhangsan");
		mode.setViewName("index");
		return mode;
	}
	@RequestMapping(value="/home/void")
	public void testVoid(){
		ModelAndView mode= new ModelAndView();
		mode.addObject("name","wagnwu");
	}
	@RequestMapping(value="/home/map")
	public Map<String,String> testMap(){
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "lisi");
		return map;
 	}


}
