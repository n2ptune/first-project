package com.firstproject.app.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
	
	@RequestMapping("/user")
	public List<Map<String, Object>> user() {
		List<Map<String, Object>> list = new ArrayList<>();
		Map<String, Object> map = null;
		
		for(int i=1; i<=3; i++) {
			map = new HashMap<String, Object>();
			
			map.put("id", i);
			map.put("name", "jack"+i);
			map.put("age", 17+i);
			
			list.add(map);
		}
		
		return list;
		
	}
	
	@RequestMapping("/user/{id}")
	public Map<String, Object> userbyid(@PathVariable("id") int idx){
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("id", idx);
		map.put("name", "jack"+idx);
		map.put("age", 17+idx);
		
		return map;
	}
}
