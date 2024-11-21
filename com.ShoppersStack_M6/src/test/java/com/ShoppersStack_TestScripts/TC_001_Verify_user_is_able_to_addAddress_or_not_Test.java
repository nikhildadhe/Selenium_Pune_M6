package com.ShoppersStack_TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.ShoppersStack_GenericUtility.Base_Test;
import com.ShoppersStack_POM.AddressForm_Page;
import com.ShoppersStack_POM.MyAddress_Page;
import com.ShoppersStack_POM.MyProfile_Page;

public class TC_001_Verify_user_is_able_to_addAddress_or_not_Test extends Base_Test {

	@Test
	public void addAddress() throws InterruptedException, EncryptedDocumentException, IOException {

		Thread.sleep(2000);
		homePage.getAccountSettingsBtn().click();
		homePage.getMyProfileBtn().click();

		MyProfile_Page myProfilePage = new MyProfile_Page(driver);
		myProfilePage.getMyAddressesBtn().click();

		Thread.sleep(2000);
		MyAddress_Page myAddressPage = new MyAddress_Page(driver);
		myAddressPage.getAddAddressBtn().click();

		AddressForm_Page addressFormPage = new AddressForm_Page(driver);
		
		addressFormPage.getOfficeRB().click();
		addressFormPage.getNameTextField().sendKeys(fileUtility.readExcelFile("Sheet1",1,0));
		addressFormPage.getHouseTextField().sendKeys(fileUtility.readExcelFile("Sheet1",1,1));
		addressFormPage.getStreetTextField().sendKeys(fileUtility.readExcelFile("Sheet1",1,2));
		addressFormPage.getLandMarkTextField().sendKeys(fileUtility.readExcelFile("Sheet1",1,3));
		webDriverUtility.selectByValue(addressFormPage.getCountryDD(),fileUtility.readPropertyFile("country"));
		webDriverUtility.selectByValue(addressFormPage.getStateDD(),fileUtility.readPropertyFile("state"));
		webDriverUtility.selectByValue(addressFormPage.getCityDD(),fileUtility.readPropertyFile("city"));
		addressFormPage.getPincodeTextField().sendKeys(fileUtility.readExcelFile("Sheet1",1,4));
		addressFormPage.getPhoneNumberTextField().sendKeys(fileUtility.readExcelFile("Sheet1",1,5));
		addressFormPage.getAddAddressBtn().click();
		Thread.sleep(8000);		
		
	}

}
