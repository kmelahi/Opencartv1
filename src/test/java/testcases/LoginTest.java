package testcases;

import org.testng.annotations.Test;

import pageobjectmodel.AccountLogin;
import pageobjectmodel.HomePage;
import pageobjectmodel.MyAccountPage;
import testbase.BaseClass;

public class LoginTest extends BaseClass {

	@Test(groups={"regression","Master"})
	public void login() {
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.cllickLogin();
		logger.info("**************Initiating Login Page****************");
		AccountLogin lg = new AccountLogin(driver);
		logger.info("**********Insert Email*************");
		lg.insertEmail("onlynitu@gmail.com");
		logger.info("**********Insert Pass*************");
		lg.insertPassword("Minidr190630#");
		logger.info("**********Click Login*************");
		lg.clickLogin();
		MyAccountPage ma = new MyAccountPage(driver);
		ma.clickOnMyLogoutLink();
		
		
	}

}
