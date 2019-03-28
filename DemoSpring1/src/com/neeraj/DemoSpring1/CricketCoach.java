package com.neeraj.DemoSpring1;

public class CricketCoach implements Coach{
	private FortuneService fortuneService;
	public CricketCoach() {}
	private String email;
	public FortuneService getFortuneService() {
		return fortuneService;
	}
	public String getEmail() {
		return email;
	}
	public String getTeam() {
		return team;
	}
	private String team;
	public void setEmail(String email) {
		this.email = email;
	}
	public void setTeam(String team) {
		this.team = team;
	}

	
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "play Cricket";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
