package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {
		super(driver);

	}

	// Locators in my account page

	@FindBy(xpath = "//input[@placeholder='Search']")
	WebElement searchBox;
	@FindBy(xpath = "//i[@class='fa fa-search']")
	WebElement searchIcon;
	@FindBy(xpath = "//span[@id='cart-total']")
	WebElement shoppingCart;
	@FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='My Account']")
	WebElement myAccountLink;
	@FindBy(xpath = "//a[normalize-space()='Edit Account']")
	WebElement editAccount;
	@FindBy(xpath = "//a[normalize-space()='Password']")
	WebElement myPassword;
	@FindBy(xpath = "//a[normalize-space()='Address Book']")
	WebElement addressBook;
	@FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='Wish List']")
	WebElement wishList;
	@FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='Order History']")
	WebElement orderHistory;
	@FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='Downloads']")
	WebElement myDownloads;
	@FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='Recurring payments']")
	WebElement recurringPmnts;
	@FindBy(xpath = "//a[normalize-space()='Reward Points']")
	WebElement rewardPoints;
	@FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='Returns']")
	WebElement myReturns;
	@FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='Transactions']")
	WebElement myTransactions;
	@FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='Newsletter']")
	WebElement myNewsletter;
	@FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='Logout']")
	WebElement myLogout;
	
	
	// Methods for the above locators

	public void insertSearchItem(String items) {
		searchBox.sendKeys(items);
	}

	public void clickOnSearch() {
		searchIcon.click();
	}

	public void clickOnCart() {
		shoppingCart.click();
	}

	public void clickOnMyAccountLink() {
		myAccountLink.click();
	}

	public void clickOnEditAccountLink() {
		editAccount.click();
	}

	public void clickOnMyPasswordLink() {
		myPassword.click();
	}

	public void clickOnAddressBookLink() {
		addressBook.click();
	}

	public void clickOnWishListLink() {
		wishList.click();
	}

	public void clickOnOrderHistoryLink() {
		orderHistory.click();
	}

	public void clickOnMyDownloadsLink() {
		myDownloads.click();
	}

	public void clickOnRecurringPmntsLink() {
		recurringPmnts.click();
	}

	public void clickOnRewardPointsLink() {
		rewardPoints.click();
	}

	public void clickOnMyReturnsLink() {
		myReturns.click();
	}

	public void clickOnMyTransactionsLink() {
		myTransactions.click();
	}

	public void clickOnMyNewsletterLink() {
		myNewsletter.click();
	}

	public void clickOnMyLogoutLink() {
		myLogout.click();
	}

}
