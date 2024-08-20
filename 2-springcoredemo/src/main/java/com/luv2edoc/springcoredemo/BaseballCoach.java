package com.luv2edoc.springcoredemo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class BaseballCoach implements Coach {

	@Override
	public String GetDailyWorkout() {
		// TODO Auto-generated method stub
		return "Spend 30 minutes batting";
	}

}
