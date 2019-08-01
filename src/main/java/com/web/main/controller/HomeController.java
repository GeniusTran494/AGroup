package com.web.main.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@Value("${spring.application.name}")
	String appName;
	
	@RequestMapping("/")
	public String index(Model model) 	{
		model.addAttribute("appName", appName);
		return "homepage";
	}
	
	@RequestMapping("/itemList")
	public String itemList(@RequestParam String type, Model model) 	{
		model.addAttribute("type", type);
		return "itemListPage";
	}
	
	@RequestMapping("/about")
	public String about(Model model) 	{
		return "aboutUsPage";
	}
}
