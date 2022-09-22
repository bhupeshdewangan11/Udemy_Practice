package com.demo.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("thatCoach")
@Component
public class TennisCoach implements Coach {

//	private FortuneService fortuneService;
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">> TennisCoach: Inside default constructor");
	}
	/*
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}*/
	
	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: Inside setFortuneService() method");
		this.fortuneService=fortuneService;
	}*/
	
	/*@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: Inside doSomeCrazyStuff() method");
		this.fortuneService=fortuneService;
	}*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
