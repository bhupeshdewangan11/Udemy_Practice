package com.demo.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("thatCoach")
@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

//	private FortuneService fortuneService;
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">> TennisCoach: Inside default constructor");
	}
	
	//define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">>TennisCoach: Inside of doMyStartupStuff()");
	}
	
	//define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">>TennisCoach: Inside of doMyCleanupStuff()");
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
