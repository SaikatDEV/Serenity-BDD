package project.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import project.pages.BookAFlightPage;
import project.utils.HelperMethods;

/**
 * Scenario steps, can use across multiple scenarios (test cases)
 * @author FDEEXJD
 *
 */
@SuppressWarnings("serial")
public class MercurySteps extends ScenarioSteps {

	BookAFlightPage bookFlightPage;
	HelperMethods helper;
	
	
	
	
	@Step
	public void goToApplication(String url) {
		bookFlightPage.navigateToApplication(url);
		
		
	}



    @Step
	public void loginToApplication(String username, String password) {
    		bookFlightPage.loginToApplication(username,password);
		
	}


    @Step
	public void verifyPageIsLoaded() {
    	bookFlightPage.verifyPageIsLoaded();
		
	}
	
	
	
	
	
	
	
}
