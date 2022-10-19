package com.springdemo;

public class BaseBallCoach implements Coach{

    // define private field for the dependency
    private FortuneService fortuneService;

    public BaseBallCoach() {
    }

    // define constructor for dependency injection
    public BaseBallCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practise";
    }

    @Override
    public String getDailyFortune() {
        // use dependency to get fortune
        return fortuneService.getFortune();
    }
}
