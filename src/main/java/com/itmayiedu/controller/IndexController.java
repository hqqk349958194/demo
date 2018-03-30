package com.itmayiedu.controller;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@RestController
@Controller
public class IndexController {
	@RequestMapping("/indexController")
	public String indexController(Map<String,Object> map){
		//int i=1/0;
		System.out.println("IndexController....index");
		map.put("name", "李白");
		map.put("sex", 0);
		ArrayList<String> list = new ArrayList<String>();
		list.add("zhangsan");
		list.add("lisi");
		map.put("userlist", list);
		return "index";
	}
	
}
