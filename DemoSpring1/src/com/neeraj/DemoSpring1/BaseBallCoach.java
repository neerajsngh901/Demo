package com.neeraj.DemoSpring1;

public class BaseBallCoach implements Coach {

	private FortuneService fortuneService;
	public BaseBallCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "running";
	}
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	

}
