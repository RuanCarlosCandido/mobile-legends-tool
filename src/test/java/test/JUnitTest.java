package test;

import org.junit.jupiter.api.Test;
import org.services.HeroService;

public class JUnitTest {

	HeroService heroService = new HeroService();
	
	@Test
	public void moving_rover_two_success_expected() {
		heroService.getCounterHeroes("akai");
		
	}
}