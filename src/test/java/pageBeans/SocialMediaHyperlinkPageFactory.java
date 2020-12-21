package pageBeans;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SocialMediaHyperlinkPageFactory {
	
	WebDriver driver;
	
	//step 1 : identify elements
	
	@FindBy(name="email")
	@CacheLookup
	WebElement inpemail;

	@FindBy(name="password")
	@CacheLookup
	WebElement lpassword;

	@FindBy(xpath="//div[3]")
	@CacheLookup
	WebElement llogin;
	
	/*@FindBy(xpath="//body/div[@id='ui']/div[1]/div[1]/div[3]/a[1]")
	@CacheLookup
	WebElement contact;*/
	
	/*@FindBy(xpath="//a[contains(text(),'Shah Rukh Khan')]")
	@CacheLookup
	WebElement srkname;*/
	
	@FindBy(linkText = "Shah Rukh Khan")
	@CacheLookup
	WebElement srkname;
	
	@FindBy(xpath="//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/a[4]/i[1]")
	@CacheLookup
	WebElement hypinstagram;
	
	@FindBy(xpath="//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/i[1]")
	@CacheLookup
	WebElement hyptwitter;
	
	@FindBy(xpath="//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/a[3]/i[1]")
	@CacheLookup
	WebElement hyplinkedin;
	
	@FindBy(xpath="//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/a[2]/i[1]")
	@CacheLookup
	WebElement hypfacebook;
	
	@FindBy(xpath="//body/div[@id='ui']/div[1]/div[1]/div[3]/a[1]")
	@CacheLookup
	WebElement contact;
	
	//step 2 : setters
	
	public void setemail() {
		inpemail.sendKeys("yash.gole2@gmail.com");
	}
	
	public void setlpassword()
	{
		lpassword.sendKeys("yash27");
	}
	
	public void setlogin() {
		llogin.click();
	}
	
	public void settwitter() {
		hyptwitter.click();
	}
	
	public void setcontact() {
		contact.click();
	}
	
	public void setfacebook() {
		hypfacebook.click();
	}
	
	public void setlinkedin() {
		hyplinkedin.click();
	}
	
	public void setinstagram() {
		hypinstagram.click();
	}
	
	public void setsrkname() {
		srkname.click();
	}
	
	/*public void switchToTab() {
		//Switching between tabs using CTRL + tab keys.
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t");
		//Switch to current selected tab's content.
		driver.switchTo().defaultContent();  
	}
	
	public String getpagetitle() {
		switchToTab();
		String t;
		t = driver.getTitle();
		return t;
	}*/
	
	public SocialMediaHyperlinkPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

}