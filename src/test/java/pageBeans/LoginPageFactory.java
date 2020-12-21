package pageBeans;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
	
	WebDriver driver;	
	//step 1 : identify elements
	@FindBy(name="email")
	@CacheLookup
	WebElement lemail;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement lpassword;
	
	@FindBy(xpath="//div[3]")
	@CacheLookup
	WebElement llogin;
	
	@FindBy(xpath="//a[contains(text(),'Forgot your password?')]")
	@CacheLookup
	WebElement forgot;
	
	@FindBy(className="header")
	@CacheLookup
	WebElement mssg;
	
	//Setters
	public void setlemail(String semail) {
		lemail.sendKeys(semail);
	}
	public void setlpassword(String spassword) {
		lpassword.sendKeys(spassword);
	}
	public void setforgot() {
		forgot.click();
	}
	public void setlogin() {
		llogin.click();
	}
	
	//Getters
	public String getmssg() {
		return mssg.getText();
	}
	public LoginPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	


}
