package com.neeraj.demoSpringAnnotation;

import org.springframework.stereotype.Component;

@Component("neeraj1")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice";
	}

	

}
