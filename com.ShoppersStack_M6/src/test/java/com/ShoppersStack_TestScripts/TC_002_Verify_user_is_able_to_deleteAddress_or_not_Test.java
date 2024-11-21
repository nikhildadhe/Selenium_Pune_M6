package com.ShoppersStack_TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ShoppersStack_GenericUtility.Base_Test;
import com.ShoppersStack_POM.MyAddress_Page;
import com.ShoppersStack_POM.MyProfile_Page;

public class TC_002_Verify_user_is_able_to_deleteAddress_or_not_Test extends Base_Test {

	@Test
	public void deleteAddress() throws InterruptedException, IOException {

		homePage.getAccountSettingsBtn().click();
		homePage.getMyProfileBtn().click();

		MyProfile_Page myProfilePage = new MyProfile_Page(driver);
		myProfilePage.getMyAddressesBtn().click();

		Thread.sleep(2000);
		MyAddress_Page myAddressPage = new MyAddress_Page(driver);
		myAddressPage.getDeleteBtn().click();
		Thread.sleep(2000);
		myAddressPage.getYesBtn().click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		webDriverUtility.webPageScreenShot(driver);

	}

}
