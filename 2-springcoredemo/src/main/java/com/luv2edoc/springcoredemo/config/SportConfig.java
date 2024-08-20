package com.luv2edoc.springcoredemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.luv2edoc.springcoredemo.Coach;
import com.luv2edoc.springcoredemo.SwimCoach;

@Configuration
public class SportConfig {

	@Bean("aquatic")
	public Coach swimCoach() {
		return new SwimCoach();
		
	}
}
