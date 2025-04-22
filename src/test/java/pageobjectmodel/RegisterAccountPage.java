package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterAccountPage extends BasePage {

	public RegisterAccountPage(WebDriver driver) {
		super(driver);

	}

	// Locators in the registration page

	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement firstName;

	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement lastName;

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement emailId;

	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement phoneNum;

	@FindBy(xpath = "//input[@id='input-password']")
	WebElement passWrd;

	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement confirmPasswd;

	@FindBy(xpath = "//label[normalize-space()='Yes']")
	WebElement subscribeYes;

	@FindBy(xpath = "//input[@value='0']")
	WebElement subscribeNo;

	@FindBy(xpath = "//input[@name='agree']")
	WebElement privacyPolicy;

	@FindBy(xpath = "//input[@value='Continue']")
	WebElement contnew;

	@FindBy(xpath = "//*[@id=\"content\"]/h1")
	WebElement confText;

	// Action methods for the above locators

	public void insertFirstName(String fname) {
		firstName.sendKeys(fname);
	}

	public void insertLastName(String lname) {
		lastName.sendKeys(lname);
	}

	public void insertEmail(String email) {
		emailId.sendKeys(email);
	}

	public void insertPhoneNumber(String phoneNumber) {
		phoneNum.sendKeys(phoneNumber);
	}

	public void insertPasswd(String passNumber) {
		passWrd.sendKeys(passNumber);
	}

	public void confirmPasswd(String confPass) {
		confirmPasswd.sendKeys(confPass);
	}

	public void checkSubscription(boolean val) {
		if (val) {
			subscribeYes.click();
		} else {
			subscribeNo.click();
		}
	}

	public void privacyPolicy() {
		privacyPolicy.click();
	}

	public void clickContinue() {
		contnew.click();
	}

	public String getConfirmation() {
		try {
			return confText.getText();
		} catch (Exception e) {
			return (e.getMessage());
		}
	}

}
