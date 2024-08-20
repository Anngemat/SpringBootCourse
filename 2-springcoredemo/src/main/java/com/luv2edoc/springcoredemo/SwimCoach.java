package com.luv2edoc.springcoredemo;

public class SwimCoach implements Coach {

	@Override
	public String GetDailyWorkout() {
		return "Swim 100 meters as warm up";
	}
	
	public SwimCoach() {
		System.out.println("In Constructor: " + getClass().getSimpleName());
	}
	
}
