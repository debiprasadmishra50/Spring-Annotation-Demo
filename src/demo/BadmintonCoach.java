package demo;

import org.springframework.stereotype.Component;

// @Component //if this is there, then the default bean id is "badmintonCoach"

@Component("theBadmintonCoach") //Spring will automatically register bean for this class
public class BadmintonCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "In Badminton : Practice Badminton smash 2 hours a day";
	}

}
