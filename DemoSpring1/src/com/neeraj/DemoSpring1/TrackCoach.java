package com.neeraj.DemoSpring1;

public class TrackCoach implements Coach {
	private FortuneService fortuneService; 

	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "run";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Neeraj "+fortuneService.getFortune();
	}
	public void doMyStartupStuff() {
		System.out.println("Init method New");
	}
	public void doMyStartupStuffYOYO() {
		System.out.println("Destroyed method");
	}

}
