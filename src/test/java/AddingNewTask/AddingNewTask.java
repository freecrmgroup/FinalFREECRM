package AddingNewTask;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageBeans.AddingNewTaskPageFactory;

public class AddingNewTask 
{
	private WebDriver driver;
	private AddingNewTaskPageFactory antpf;
	
	@Before
	public void openBrowsser() 
	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS 167TS\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		antpf = new AddingNewTaskPageFactory(driver);
		driver.get("https://ui.freecrm.com/");
		antpf.setlemail();
		antpf.setlpassword();
		antpf.setlogin();
	}
	
	@Given("^User is on the home page$")
	public void user_is_on_the_home_page() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions		
	   //throw new PendingException();
	}

	@When("^user clicks on the task$")
	public void user_clicks_on_the_task() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
	    antpf.setpftask();
	    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    Thread.sleep(5000);
	   // throw new PendingException();
	}

	@When("^clicks the new button$")
	public void clicks_the_new_button() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		antpf.setpfnew();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
	   // throw new PendingException();
	}
	

	@Then("^an appropriate task tab is open$")
	public void an_appropriate_task_tab_is_open() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("new"));
		System.out.println("New Task is created");
	    //throw new PendingException();
	}

	@Given("^user is on the task tab$")
	public void user_is_on_the_task_tab() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		antpf.setpftask();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		antpf.setpfnew();
		Thread.sleep(5000);
	    //throw new PendingException();
	}
	

	@When("^user gives a title for the task$")
	public void user_gives_a_title_for_the_task() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		antpf.setpftitle("Ranbir Kapoor");
		Thread.sleep(5000);
	    //throw new PendingException();
	}

	@When("^clicks the save button$")
	public void clicks_the_save_button() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		antpf.setpfsave();
		Thread.sleep(5000);
	    //throw new PendingException();
	}
	
	@Then("^the title is saved$")
	public void the_title_is_saved() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertFalse(url.contains("new"));
		System.out.println("New title is given");
		
	   // throw new PendingException();
	}
	
	@When("^user does not enter the title for the task$")
	public void user_does_not_enter_the_title_for_the_task() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		antpf.setpftitle("");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		antpf.setpfsave();
		Thread.sleep(5000);
	   // throw new PendingException();
	}

	@Then("^displays appropriate message$")
	public void displays_appropriate_message() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("new"));
		System.out.println("Enter the title");
	    //throw new PendingException();
	}
	
	@Given("^user is on the task tab form$")
	public void user_is_on_the_task_tab_form() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		antpf.setpftask();
		Thread.sleep(5000);
		antpf.setpfnew();
		Thread.sleep(5000);
	    //throw new PendingException();
	}
	
	@When("^user gives a wrong title$")
	public void user_gives_a_wrong_title() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		antpf.setpftitle("Salman Khan");
		Thread.sleep(5000);
	    //throw new PendingException();
	}

	@When("^clicks the cancel button$")
	public void clicks_the_cancel_button() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		antpf.setpfcancel();
		Thread.sleep(5000);
	    //throw new PendingException();
	}

	@Then("^the form is removed$")
	public void the_form_is_removed() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertFalse(url.contains("new"));
		System.out.println("task is cancelled");
	    //throw new PendingException();
	}
	
	@Given("^user has enter the deal in the task form$")
	public void user_has_enter_the_deal_in_the_task_form() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		antpf.setpftask();
		Thread.sleep(5000);
		antpf.setpfnew();
		Thread.sleep(5000);
	    //throw new PendingException();
	}
	
	@When("^user clicks on the deal button$")
	public void user_clicks_on_the_deal_button() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		antpf.setpftitle("Salman Khan");
		Thread.sleep(5000);
		antpf.setpftaskdeal("Marriage");
		Thread.sleep(5000);
		antpf.setpfsave();
		Thread.sleep(5000);
	    // throw new PendingException();
	}

	@Then("^the deal is present in the deal drop down box$")
	public void the_deal_is_present_in_the_deal_drop_down_box() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		antpf.setpfdeal();
		Thread.sleep(5000);
	    //throw new PendingException();
	}


	
}