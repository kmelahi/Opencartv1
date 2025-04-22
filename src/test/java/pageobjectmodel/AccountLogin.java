package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountLogin extends BasePage {

	public AccountLogin(WebDriver driver) {
		super(driver);

	}

	// Locators

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement emailId;
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement passId;
	@FindBy(xpath = "//input[@value='Login']")
	WebElement loginBtn;
	
	// Methods for the above locators

	public void insertEmail(String email) {
		emailId.sendKeys(email);
	}

	public void insertPassword(String passwd) {
		passId.sendKeys(passwd);
	}

	public void clickLogin() {
		loginBtn.click();
	}

}
