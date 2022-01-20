package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObjects {

	@FindBy(xpath = "//a[@id='menu_pim_viewPimModule']/child::b")
	public static WebElement PIM;
	
	@FindBy(id = "menu_pim_addEmployee")
	public static WebElement addEmployee;
	
	@FindBy(id = "firstName")
	public static WebElement firstName;
	
	@FindBy(id = "lastName")
	public static WebElement lastName;
	
	@FindBy(id = "employeeId")
	public static WebElement empID;
	
	@FindBy(id = "btnSave")
	public static WebElement saveBtn;
}
