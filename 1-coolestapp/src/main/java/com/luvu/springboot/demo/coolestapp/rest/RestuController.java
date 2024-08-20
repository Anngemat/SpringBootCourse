package com.luvu.springboot.demo.coolestapp.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class RestuController {

	@Value("${coach.name}")
	private String coachName;
	@Value("${team.name}")
	private String teamName;
	
	@GetMapping("/")
	public String SayHello() {
		return "Hello World";
	}
	
	@GetMapping("/teaminfo")
	public String GetTeamInfo() {
		return "Coach: " + coachName + " Team: " + teamName;
	}
	
	@GetMapping("/workout")
	public String GetDailyWorkout() {
		return "Play basketball";
	}
	
	@GetMapping("fortune")
	public String GetDailyFortune() {
		return "Today is your lucky day";
	}
	
	
	
}
