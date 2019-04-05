package com.neeraj.demoSpringAnnotation;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneServices {
	private String[] data= {
			"RandomFortuneService-Neeraj",
			"RandomFortuneService-Neeraj Kumar",
			"RandomFortuneService-Neeraj kumar Singh"
	};
	private Random myRandom=new Random();
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		int index=myRandom.nextInt(data.length);
		String n=data[index];
		return n;
	}

}
