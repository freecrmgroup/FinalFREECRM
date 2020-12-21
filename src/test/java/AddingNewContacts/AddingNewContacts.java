package AddingNewContacts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
//import org.testng.Assert;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageBeans.AddingNewContactsPageFactory;


public class AddingNewContacts {
	
	private WebDriver driver;
	private AddingNewContactsPageFactory contpf;
	
	@Before
	public void openBrowser() throws InterruptedException {
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	contpf = new AddingNewContactsPageFactory(driver);
	
	driver.get("https://ui.freecrm.com/");
	
	contpf.setemail();
	contpf.setlpassword();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	contpf.setlogin();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(5000);
	
	}
	
	
	@Given("^user is on contacts tab$")
	public void user_is_on_contacts_tab() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		contpf.setcontactbutton();
		Thread.sleep(2000);
		contpf.setnewbutton();
		//driver.navigate().to("https://ui.freecrm.com/contacts/new/");
		Thread.sleep(5000);
		
	    //throw new PendingException();
	}

	@When("^user enters all valid data$")
	public void user_enters_all_valid_data() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		contpf.setfname("Mukesh");
		contpf.setlname("Ambani");
		Thread.sleep(2000);
		contpf.setsavebutton();
		Thread.sleep(5000);
		
	    //throw new PendingException();
	}

	@Then("^Contact should be saved$")
	public void contact_should_be_saved() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		Assert.assertFalse(url.contains("new"));
		System.out.println("Contact SAVED!!");
		
		
	    //throw new PendingException();
	}

	@When("^user leaves last name field blank$")
	public void user_leaves_last_name_field_blank() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		contpf.setfname("Mukesh");
		
		contpf.setsavebutton();
		
	    //throw new PendingException();
	}

	@Then("^display alert message$")
	public void display_alert_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		Assert.assertTrue(contpf.lnamecheck());
		System.out.println("The message displayed is: "+contpf.getmsg());
		//Assert.assertTrue(url.contains("new"));
		System.out.println("Contact NOT SAVED!!");
		
	}


}