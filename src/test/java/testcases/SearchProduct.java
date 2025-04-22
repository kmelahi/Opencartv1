package testcases;

import org.testng.annotations.Test;

import pageobjectmodel.MyAccountPage;
import testbase.BaseClass;

public class SearchProduct extends BaseClass{
	
	@Test(groups={"smoke","Master"})
	public void searchProduct() {
		logger.info("**********Starting Search Product Test*************");
		MyAccountPage myAccountPage = new MyAccountPage(driver);
		logger.info("**********Starting My Account Page*************");
		myAccountPage.clickOnSearch();
		logger.info("**********Clicking on Search Box*************");
		myAccountPage.insertSearchItem("macbook");
		logger.info("**********Inserting Product in Searchbox*************");
	}

}
