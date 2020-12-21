package pageBeans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddingNewContactsPageFactory {

	WebDriver driver;
	
	//step 1 : identify elements
	
	/*@FindBy(name="first_name")
	@CacheLookup
	WebElement fname;*/
	
	@FindBy(name="last_name")
	@CacheLookup
	WebElement lname;
	
	@FindBy(xpath="//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement fname;
	
	/*@FindBy(className="save icon")
    @CacheLookup
    WebElement btsave;
	
	@FindBy(linkText = "Save")
	@CacheLookup
	WebElement btsave;*/
	
	@FindBy(xpath="//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/button[2]")
	@CacheLookup
	WebElement btsave;
	
	@FindBy(xpath="//body/div[@id='ui']/div[1]/div[1]/div[3]/a[1]")
	@CacheLookup
	WebElement btcontact;
	
	@FindBy(xpath="//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]/button[1]")
	@CacheLookup
	WebElement btnew;
	
	
	@FindBy(name="email")
	@CacheLookup
	WebElement inpemail;

	@FindBy(name="password")
	@CacheLookup
	WebElement lpassword;

	@FindBy(xpath="//div[3]")
	@CacheLookup
	WebElement llogin;

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/label[1]/span[1]")
	@CacheLookup
	WebElement lnamemsg;
	
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
	
	public void setfname(String sfname) {
		fname.sendKeys(sfname);
	}
	
	public void setlname(String slname) {
		lname.sendKeys(slname);
	}
	
	public void setsavebutton() {
		btsave.click();
	}
	
	public void setcontactbutton() {
		btcontact.click();
	}
	
	public void setnewbutton() {
		btnew.click();
	}
	
	//step 3 : getters
	
	public Boolean lnamecheck() {
		return (lnamemsg.isDisplayed());
	}
	
	public WebElement getfname() {
		return fname;
	}
	
	public WebElement getlfname() {
		return lname;
	}
	
	public String getmsg() {
		String msg = lnamemsg.getText();
		return msg;
	}
	
	
	//initiating Elements
	public AddingNewContactsPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
}