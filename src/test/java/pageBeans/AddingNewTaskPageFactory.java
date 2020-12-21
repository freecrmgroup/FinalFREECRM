package pageBeans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddingNewTaskPageFactory 
{
	WebDriver driver;

    @FindBy(name="email")
    @CacheLookup
    WebElement lemail;
    
    @FindBy(name="password")
    @CacheLookup
    WebElement lpassword;
    
    @FindBy(xpath="//div[3]")
    @CacheLookup
    WebElement llogin;

    @FindBy(xpath="//span[contains(text(),'Tasks')]")
    @CacheLookup
    WebElement pftask;
	
	@FindBy(xpath="//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]/button[1]")
	@CacheLookup
	WebElement pfnew;
	
	@FindBy(name="title")
	@CacheLookup
	WebElement pftitle;
	
	@FindBy(xpath="//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/button[2]/i[1]")
	@CacheLookup
	WebElement pfsave;
	
	@FindBy(xpath="//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/button[1]")
	@CacheLookup
	WebElement pfcancel;
	
	@FindBy(xpath="//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[4]/div[1]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement pftaskdeal;
	
	@FindBy(xpath="//span[contains(text(),'Deals')]")
	@CacheLookup
	WebElement pfdeal;
	
	@FindBy(className="ui icon button")
	@CacheLookup
	WebElement pfedit;
	
	@FindBy(xpath="//tbody/tr[1]/td[7]/div[1]/button[1]/i[1]")
	@CacheLookup
	WebElement pfdelete;
	
	
	// Setters
	public void setlemail() 
	{
		//semail="yash.gole2@gmail.com";
		lemail.sendKeys("yash.gole2@gmail.com");
	}
		
	public void setlpassword()
	{
		lpassword.sendKeys("yash27");
	}
		
	public void setlogin() 
	{
		llogin.click();
	}
	
	public void setpftask()
	{
		pftask.click();
	}
	
	public void setpfnew()
	{
		pfnew.click();
	}
	
	public void setpftitle(String stitle)
	{
		pftitle.sendKeys(stitle);
	}
	
	public void setpftaskdeal(String staskdeal)
	{
		pftaskdeal.sendKeys(staskdeal);
	}
	
	public void setpfsave()
	{
		pfsave.click();
	}
	
	public void setpfcancel()
	{
		pfcancel.click();
	}
	
	public void setpfdeal()
	{
		pfdeal.click();
	}
	
	public void setpfedit()
	{
		pfedit.click();
	}
	
	public void setpfdelete()
	{
		pfdelete.click();
	}
	
	
	//getters
	public WebElement getpfnew()
	{
		return pfnew;
	}
	
	public WebElement getpftitle()
	{
		return pftitle;
	}
	
	public WebElement getpfsave()
	{
		return pfsave;
	}
	
	public WebElement getpfcancel()
	{
		return pfcancel;
	}
	
	public WebElement getpfdeal()
	{
		return pfdeal;
	}
	
	public WebElement getpfedit()
	{
		return pfedit;
	}
	
	public WebElement getpfdelete()
	{
		return pfdelete;
	}

        public AddingNewTaskPageFactory (WebDriver driver) 
        {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


}