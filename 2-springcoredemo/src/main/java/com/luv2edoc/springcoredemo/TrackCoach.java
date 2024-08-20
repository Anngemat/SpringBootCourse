package com.luv2edoc.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

	@Override
	public String GetDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

}
