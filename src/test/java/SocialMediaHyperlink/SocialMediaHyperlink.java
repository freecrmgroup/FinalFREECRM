package SocialMediaHyperlink;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageBeans.SocialMediaHyperlinkPageFactory;


public class SocialMediaHyperlink {
	
	private WebDriver driver;
	private SocialMediaHyperlinkPageFactory smpf;
	private String title;
	
	@Before
	public void openBrowser() throws InterruptedException {
		
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	smpf = new SocialMediaHyperlinkPageFactory(driver);

	driver.get("https://ui.freecrm.com/");
	
	smpf.setemail();
	smpf.setlpassword();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	smpf.setlogin();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(5000);
	
	}
	
	@Given("^User is on contacts tab$")
	public void user_is_on_contacts_tab() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Himalay\\eclipse-workspace\\test1\\chromedriver.exe" );
		
		/*driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://ui.freecrm.com/contacts");*/
		
		//smpf.setcontact();
		Thread.sleep(2000);
		driver.navigate().to("https://ui.freecrm.com/contacts");
		smpf.setsrkname();
		Thread.sleep(5000);
		
	    //throw new PendingException();
	}
	
	public void switchToTab() {
		/*driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t");
		driver.switchTo().defaultContent(); */
		
		String oldTab = driver.getWindowHandle();
	    ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
	    newTab.remove(oldTab);
	    driver.switchTo().window(newTab.get(0));
	}
	
	public String getpagetitle() {
		switchToTab();
		String t;
		t = driver.getTitle();
		return t;
	}

	@When("^user clicks instagram hyperlink$")
	public void user_clicks_instagram_hyperlink() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		smpf.setinstagram();
	    //throw new PendingException();
	}

	@Then("^corresponding instagram link should open$")
	public void corresponding_instagram_link_should_open() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		title = getpagetitle();
		Assert.assertTrue(title.contains("Instagram"));
		System.out.println("Instagram link opened!! " + title);
	    //throw new PendingException();
	}

	@When("^user clicks facebook hyperlink$")
	public void user_clicks_facebook_hyperlink() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		smpf.setfacebook();
	    //throw new PendingException();
	}

	@Then("^corresponding facebook link should open$")
	public void corresponding_facebook_link_should_open() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		title = getpagetitle();
		Assert.assertTrue(title.contains("Facebook"));
		System.out.println("Facebook link opened!! " + title);
		
	}

	@When("^user clicks linkedin hyperlink$")
	public void user_clicks_linkedin_hyperlink() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		smpf.setlinkedin();
	    //throw new PendingException();
	}

	@Then("^corresponding linkedin link should open$")
	public void corresponding_linkedin_link_should_open() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		title = getpagetitle();
		Assert.assertTrue(title.contains("LinkedIn"));
		System.out.println("LinkedIn link opened!! " + title);
	    //throw new PendingException();
	}

	@When("^user clicks twitter hyperlink$")
	public void user_clicks_twitter_hyperlink() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		smpf.settwitter();
	    //throw new PendingException();
	}

	@Then("^corresponding twitter link should open$")
	public void corresponding_twitter_link_should_open() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		title = getpagetitle();
		Assert.assertTrue(title.contains("Twitter"));
		System.out.println("Twitter link opened!! " + title);
	    //throw new PendingException();
	}


}