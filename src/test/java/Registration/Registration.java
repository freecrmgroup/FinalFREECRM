package Registration;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageBeans.registrationPageFactory;

public class Registration {
	private WebDriver driver;
	private registrationPageFactory obj;


	
	@Given("^User is on registration page$")
	public void user_is_on_registration_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    obj = new registrationPageFactory(driver);
	    driver.get("https://api.cogmento.com/register/");

	    //throw new PendingException();
	}

	@When("^user leaves email blank$")
	public void user_leaves_email_blank() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		obj.setsmail("");
		obj.setsignup();

	    //throw new PendingException();
	}

	@Then("^display email not entered msg$")
	public void display_email_not_entered_msg() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(obj.getremailmssg(), "[[Email is required]]");
		//throw new PendingException();
	}

	@When("^user leaves mobileNo blank$")
	public void user_leaves_mobileNo_blank() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		obj.setsnumber("");
		obj.setsignup();

		//throw new PendingException();
	}

	@Then("^display mobile not entered msg$")
	public void display_mobile_not_entered_msg() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(obj.getrnumbermssg(), "[[Phone is required]]");
		
	    //throw new PendingException();
	}

	@When("^user doesnot select terms$")
	public void user_doesnot_select_terms() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		obj.setsignup();
	    //throw new PendingException();
	}

	@Then("^display terms not selected msg$")
	public void display_terms_not_selected_msg() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(obj.getrtermsmssg(), "[[Please accept the terms to continue]]");
		
	    //throw new PendingException();
	}

	@When("^user doesnot select captcha$")
	public void user_doesnot_select_captcha() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		obj.setsignup();
	    //throw new PendingException();
	}

	@Then("^display captcha not selected msg$")
	public void display_captcha_not_selected_msg() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(obj.getrcaptchamssg(), "[[Please complete the Captcha]]");
		
	    //throw new PendingException();
	}
}
