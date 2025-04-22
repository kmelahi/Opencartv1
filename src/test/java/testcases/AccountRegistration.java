package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.github.javafaker.Faker;
import pageobjectmodel.HomePage;
import pageobjectmodel.RegisterAccountPage;
import testbase.BaseClass;

public class AccountRegistration extends BaseClass{

	
	@Test(groups={"smoke","Master"})
	public void verifyAccount() {
		logger.info("**********Starting Account Registration*************");
		Faker faker = new Faker();
		logger.info("Created java faker class to generate data");
		HomePage hp = new HomePage(driver);
		logger.info("HomePage launched");
		hp.clickMyAccount();
		logger.info("My Account got clicked");
		hp.clickRegister();
		logger.info("Register link got clicked");
		RegisterAccountPage ra = new RegisterAccountPage(driver);
		logger.info("Registration page factory invoked");
		ra.insertFirstName(faker.name().firstName());
		logger.info("First name inserted");
		ra.insertLastName(faker.name().lastName());
		logger.info("Last name inserted");
		ra.insertEmail(faker.internet().emailAddress());
		logger.info("Email got inserted");
		ra.insertPhoneNumber(faker.phoneNumber().phoneNumber());
		logger.info("Phone number got inserted");
		ra.insertPasswd("minidr19");
		logger.info("Registration password inserted");
		ra.confirmPasswd("minidr19");
		logger.info("Registration password confirmed");
		ra.checkSubscription(false);
		logger.info("Subscription type confirmed");
		ra.privacyPolicy();
		logger.info("Privacy policy confirmed");
		ra.clickContinue();
		logger.info("Continue button got clicked");
		Assert.assertEquals(ra.getConfirmation(), "Your Account Has Been Created!");
		logger.info("Assertion massage validated");
	}

}
