package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);

	}

	// Locators in the home page
	// My Account
	// Register
	// Login

	@FindBy(xpath = "//span[@class='caret']")
	WebElement myAccount;

	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement register;

	@FindBy(xpath = "//a[normalize-space()='Login']")
	WebElement login;

	// Action methods for the above locators

	public void clickMyAccount() {
		myAccount.click();
	}

	public void clickRegister() {
		register.click();
	}

	public void cllickLogin() {
		login.click();
	}

}
