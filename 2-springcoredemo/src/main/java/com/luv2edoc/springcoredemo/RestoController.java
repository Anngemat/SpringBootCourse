package com.luv2edoc.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class RestoController {

	private Coach myCoach;
	//private Coach anotherCoach;
	/*
	@Autowired
	public void GetCoach(Coach myCoach) {
		this.myCoach = myCoach;
	}
	
	@Autowired
	public RestoController(Coach myCoach) {
		this.myCoach = myCoach;
	}
	*/
	
	@Autowired
	public RestoController(@Qualifier("aquatic") Coach myCoach,@Qualifier("tennisCoach")Coach anotherCoach) {
		this.myCoach = myCoach;
		//this.anotherCoach = anotherCoach;
	}
	
	
	@GetMapping("/dailyworkout")
	public String GetDailyWorkout() {
		return myCoach.GetDailyWorkout();
	}
	/*
	@GetMapping("/check")
	public String Check() {
		return "Comparing beans: myCoach == anotherCoach : " + (myCoach == anotherCoach);
	}
	*/
	
	
}
