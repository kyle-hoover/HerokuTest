package com.tts.HerokuTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	//most basic way to return home page
	@GetMapping
	public String main() {
		return "index";
	}
}