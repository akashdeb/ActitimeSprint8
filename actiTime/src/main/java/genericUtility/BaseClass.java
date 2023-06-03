package genericUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import POMRepo.HomePage;
import POMRepo.LoginPage;

public class BaseClass {

	public WebDriver driver;
	@BeforeSuite
	public void bs() {
		System.out.println("Data base connection has been established");

	}
	
	@BeforeClass
	public void bc() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		System.out.println("The browser has been launched");
		driver.get("https://demo.actitime.com/login.do");

		System.out.println("The URL is navigated");

	}
	@BeforeMethod
	public void bm() {
		LoginPage login=new LoginPage(driver);
		login.loginAction("admin", "manager");
		System.out.println("Logged in to the application");

	}
	
	@AfterMethod
	public void am() {
		HomePage home=new HomePage(driver);
		home.logoutAction();
		System.out.println("Logged out from the application");

	}
	
	@AfterClass
	public void ac() {
		driver.quit();

		System.out.println("The browser has been closed");

	}
	
	@AfterSuite
	public void as() {
		System.out.println("Data base connection has been Closed");
	}
	
	
}
