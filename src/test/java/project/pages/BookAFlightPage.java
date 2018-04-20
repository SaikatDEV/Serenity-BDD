package project.pages;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import jline.internal.Log;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import project.utils.HelperMethods;
import project.utils.Utilities;

/**
 * Page Object for Manifest Generator page
 * 
 * @author Saikat Barua
 *
 */

public class BookAFlightPage extends PageObject {

	HelperMethods helper = new HelperMethods();
	public Utilities util = new Utilities();

	// PAGE OBJECTs are located Here
	// *********************************HEADERs*******************************

	// *********************************CONTAINERs***************************

	// *********************************MENUs*******************************

	// *********************************CHEKBOXs*******************************

	// *********************************FIELDs*******************************
	@FindBy(css = "[name='userName']")
	private WebElementFacade fld_UserName;
	
	@FindBy(css = "[name='password']")
	private WebElementFacade fld_password;
	
	@FindBy(css = "[name='login']")
	private WebElementFacade fld_singin;
	
	@FindBy(css = "body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(1) > td > img")
	private WebElementFacade fld_flight_finder;
	
	
	
	
//	METHODS ARE HERE  **************************************







	public void navigateToApplication(String url) {
		getDriver().get(url);
		Log.info("Browser has opened");	
		
	}


	public void loginToApplication(String username, String password) {
		fld_UserName.waitUntilClickable().click();
		fld_UserName.sendKeys(username);
		
		fld_password.waitUntilClickable().click();
		fld_password.sendKeys(password);
		
		fld_singin.waitUntilClickable().click();
		
		Log.info("User has logged in to the Application");
		
	}


	public void verifyPageIsLoaded() {
		waitForWithRefresh();
//		helper.ignoreStaleElementError(fld_Primary_Scans, 15);
//		fld_flight_finder.withTimeoutOf(10, TimeUnit.SECONDS).waitUntilVisible();
//		fld_Secondary_Scans.waitUntilVisible();
//		fld_flight_finder.waitUntilVisible();
//		Assert.assertEquals("FLIGHT FINDER", fld_flight_finder.getText());
//		Log.info("Flight Finder page has been loaded");	
	
		
	}


}
