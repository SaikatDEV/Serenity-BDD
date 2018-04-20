package project.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import project.steps.MercurySteps;
import project.utils.HelperMethods;

public class MercuryStepDef {
	
	@Steps
	MercurySteps mercurysteps;
	HelperMethods helper;
	
	@Given("^User go to the Application \"([^\"]*)\"$")
	public void user_go_to_the_Application(String url) {
		mercurysteps.goToApplication(url);
	   
	}


	@When("^User logs in as username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_logs_in_as_username_and_password(String username, String password)  {
		mercurysteps.loginToApplication(username,password);
	   
	}

	@Then("^Verify the page has been loaded successfully$")
	public void verify_the_page_has_been_loaded_successfully()  {
		mercurysteps.verifyPageIsLoaded();
	}
}

