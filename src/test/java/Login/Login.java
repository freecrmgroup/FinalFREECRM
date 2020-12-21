package Login;


import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertEquals;
import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageBeans.LoginPageFactory;

public class Login{
	private WebDriver driver;
	private LoginPageFactory obj;
	public String username;
	public String password;

	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "D:\\BACKUP\\Capgemini Notes\\jar files\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    obj = new LoginPageFactory(driver);
	    driver.get("https://ui.cogmento.com/");
	}

	@When("^user enters valid email, valid password$")
	public void user_enters_valid_email_valid_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	    //APACHE POI INTEGRATION
		
		File src1 = new File("D:\\BACKUP\\Capgemini Notes\\apache\\demo2.xlsx");
		FileInputStream fis = new FileInputStream(src1);
		XSSFWorkbook wb1 = new XSSFWorkbook(fis); 
		XSSFSheet sheet1 = wb1.getSheetAt(0);
		username = sheet1.getRow(1).getCell(0).getStringCellValue().toString();
		password = sheet1.getRow(1).getCell(1).getStringCellValue().toString();	

		obj.setlemail(username);
		Thread.sleep(2000);
		obj.setlpassword(password);
		Thread.sleep(2000);
	    obj.setlogin();

	}

	@Then("^navigate to homepage$")
	public void navigate_to_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.navigate().to("https://ui.cogmento.com/home");
		driver.close();

	}

	@When("^user enters incorrect email and correct password$")
	public void user_enters_incorrect_email_and_correct_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	    //APACHE POI INTEGRATION 
		File src1 = new File("D:\\BACKUP\\Capgemini Notes\\apache\\demo2.xlsx");
		FileInputStream fis = new FileInputStream(src1);
		XSSFWorkbook wb1 = new XSSFWorkbook(fis); 
		XSSFSheet sheet1 = wb1.getSheetAt(0);
		username = sheet1.getRow(2).getCell(0).getStringCellValue().toString();
		password = sheet1.getRow(2).getCell(1).getStringCellValue().toString();	

		obj.setlemail(username);
		Thread.sleep(2000);
		obj.setlpassword(password);
		Thread.sleep(2000);
	    obj.setlogin();


	}

	@Then("^display login failed message$")
	public void display_login_failed_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actionthrow new PendingException();
	    assertEquals(obj.getmssg(), "Something went wrong...");
	    driver.close();		
	}

	@When("^user enters correct email and incorrect password$")
	public void user_enters_correct_email_and_incorrect_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	    //APACHE POI INTEGRATION 
		File src1 = new File("D:\\BACKUP\\Capgemini Notes\\apache\\demo2.xlsx");
		FileInputStream fis = new FileInputStream(src1);
		XSSFWorkbook wb1 = new XSSFWorkbook(fis); 
		XSSFSheet sheet1 = wb1.getSheetAt(0);
		username = sheet1.getRow(3).getCell(0).getStringCellValue().toString();
		password = sheet1.getRow(3).getCell(1).getStringCellValue().toString();	

		obj.setlemail(username);
		Thread.sleep(2000);
		obj.setlpassword(password);
		Thread.sleep(2000);
	    obj.setlogin();
	}

	@When("^user enters incorrect email and incorrect password$")
	public void user_enters_incorrect_email_and_incorrect_password() throws Throwable {

	    //APACHE POI INTEGRATION 
		File src1 = new File("D:\\BACKUP\\Capgemini Notes\\apache\\demo2.xlsx");
		FileInputStream fis = new FileInputStream(src1);
		XSSFWorkbook wb1 = new XSSFWorkbook(fis); 
		XSSFSheet sheet1 = wb1.getSheetAt(0);
		username = sheet1.getRow(4).getCell(0).getStringCellValue().toString();
		password = sheet1.getRow(4).getCell(1).getStringCellValue().toString();	

		obj.setlemail(username);
		Thread.sleep(2000);
		obj.setlpassword(password);
		Thread.sleep(2000);
	    obj.setlogin();

	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^user doesnot enter either username or password$")
	public void user_doesnot_enter_either_username_or_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		File src1 = new File("D:\\BACKUP\\Capgemini Notes\\apache\\demo2.xlsx");
		FileInputStream fis = new FileInputStream(src1);
		XSSFWorkbook wb1 = new XSSFWorkbook(fis); 
		XSSFSheet sheet1 = wb1.getSheetAt(0);
		username = sheet1.getRow(5).getCell(0).getStringCellValue().toString();
		password = sheet1.getRow(5).getCell(1).getStringCellValue().toString();	

		obj.setlemail(username);
		Thread.sleep(2000);
		obj.setlpassword(password);
		Thread.sleep(2000);
	    obj.setlogin();

	}

	@Then("^display appropriate message$")
	public void display_appropriate_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(obj.getmssg(), "Something went wrong...");

	}

}
