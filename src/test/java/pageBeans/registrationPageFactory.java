package pageBeans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.DataTable;

public class registrationPageFactory {
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='email']")
	@CacheLookup
	WebElement remail;

	@FindBy(xpath="//input[@id='phone_number']")
	@CacheLookup
	WebElement rnumber;

	@FindBy(xpath="//input[@id='terms']")
	@CacheLookup
	WebElement rterms;

	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	@CacheLookup
	WebElement rsignup;
	
	@FindBy(xpath="//li")
	@CacheLookup
	WebElement remailmssg;
	
	
	@FindBy(xpath="//li[2]")
	@CacheLookup
	WebElement rnumbermssg;
	
	@FindBy(xpath="//li[3]")
	@CacheLookup
	WebElement rtermsmssg;
	
	@FindBy(xpath="//li[4]")
	@CacheLookup
	WebElement rcaptchamssg;
	
	
	//setters
	public void setsmail(String semaill) {
		remail.sendKeys(semaill);
	}
	
	public void setsnumber(String string) {
		rnumber.sendKeys(string);
	}

	public void setterms() {
		rterms.click();
	}
	

	public void setsignup() {
		rsignup.click();
	}
	
	
	//Getters
	public WebElement getsemail() {
		return remail;
	}
	
	public WebElement getsnumber() {
		return rnumber;
	}
	
	public String getremailmssg() {
		return remailmssg.getText();
	}
	public String getrnumbermssg() {
		return rnumbermssg.getText();
	}
	public String getrtermsmssg() {
		return rtermsmssg.getText();
	}
	public String getrcaptchamssg() {
		return rcaptchamssg.getText();
	}


//initializing 
	public registrationPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}


}

	
	
	

