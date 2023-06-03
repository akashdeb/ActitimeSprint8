package Home_Test;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtility.BaseClass;

public class ToVerifyHomePageTest extends BaseClass {

	@Test
	public void verifyHomePageTest() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains("Enter"));
		
		String actualHomePageTitle = driver.getTitle();
		
		Assert.assertTrue(actualHomePageTitle.contains("Enter"));
		System.out.println("Pass: the home page title has been verified");	

	}

}
