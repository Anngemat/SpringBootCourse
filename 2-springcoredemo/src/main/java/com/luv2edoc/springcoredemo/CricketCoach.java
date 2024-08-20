package com.luv2edoc.springcoredemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class CricketCoach implements Coach{

	@Override
	public String GetDailyWorkout() {
		
		return "Practice Fast bowling for 15 minutes";
	}

}
