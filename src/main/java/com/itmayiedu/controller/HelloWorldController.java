package com.itmayiedu.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@EnableAutoConfiguration
@RestController
public class HelloWorldController {
	@RequestMapping("/index")
	public String index(){
		return "success";
	} 
	@RequestMapping("/getMap")
	public Map<String,Object> getMap(){
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("errorCode", 200);
		map.put("errorMsg", "成功...");
		return map;
	} 
	
	/*public static void main(String[] args) {
		SpringApplication.run(HelloWorldController.class, args);
	}*/
}
