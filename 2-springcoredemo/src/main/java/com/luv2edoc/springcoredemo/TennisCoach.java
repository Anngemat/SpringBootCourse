package com.luv2edoc.springcoredemo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TennisCoach implements Coach {

	@PostConstruct
	public void MyStartUp() {
		System.out.println("My Bean Started");
	}
	
	@Override
	public String GetDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your back hand volley";
	}
	
	@PreDestroy
	public void myDeathDown() {
		System.out.println("My Bean is Dying");
	}

}
