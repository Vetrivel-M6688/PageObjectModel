package testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.HomePageObjects;
import pageObjects.LoginPageObject;

public class LoginAndUpload {

	@Test
	public void testFunctionality() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		PageFactory.initElements(driver, LoginPageObject.class);
		LoginPageObject.userName.sendKeys("Admin");
		LoginPageObject.password.sendKeys("admin123");
		LoginPageObject.loginBtn.click();

		PageFactory.initElements(driver, HomePageObjects.class);
		Actions actions = new Actions(driver);
		actions.moveToElement(HomePageObjects.PIM).build().perform();
		HomePageObjects.addEmployee.click();

		HomePageObjects.firstName.sendKeys("Akshay");
		HomePageObjects.lastName.sendKeys("Kumar");
		HomePageObjects.empID.clear();
		HomePageObjects.empID.sendKeys("24568");
		HomePageObjects.saveBtn.click();

	}
}
