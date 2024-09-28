package pom.irctc.testcases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName = "TC001";
		testCaseDescription = "To validate the IRCTC register form";
		author = "vijay";
		category="smoke";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";
	}
	@Test
	public void irctcRegistration() {
		
		new HomePage()
		.clickOnRegister()
		.enterUserName("Vijay123")
		.enterPassWord("Secret123%")
		.enterConfirmPassword("Secret123%")
		.clickOnSecurityQuestionDropdownField()
		.clickOnSecurityQuestionFromDropDown()
		.enterSecurityAnswer("Tiger")
		.clickOnPreferredLanguageDropDown()
		.clickOnLanguageOptionFormPreferredLanguageDropDown()
		.clickOnContinue()
		.enterFirstName("Gampala")
		.enterMiddleName("Vijay")
		.enterLastName("Kumar")
		.clickOnOccupationMenuField()
		.clickOnOccupationOption()
		.clickOnDateOfBirthField()
		.selectDateOfBirthYear("1997")
		.selectDateOfBirthMonth("April")
		.selectDateOFBirthDate()
		.clickOnMarriedRadioButton()
		.selectCountry("India")
		.clickOnGenderOption()
		.enterEmail("Vijay@gmail.com")
		.enterMobileNumber("9876543210")
		.selectNationality("India")
		.clickOnContinueToMoveAddressTab()
		.enterFlatNumber("103")
		.enterStreet("mainroad")
		.enterAreaOrLocality("lakenagar")
		.enterPinCode("533212")
		.selectCity(1)
		.selectPostOffice("Kandikuppa B.O")
		.enterPhoneNumber("08809876")
		.clickOnCopyResidenceToOfficeAddressRadioButton()
		.enterOfficeFlatNumber("0009")
		.enterOfficeArea("mindspace")
		.enterOfficeStreet("mainroad")
		.enterOfcPinCode("502032")
		.selectOfficeCity(1)
		.selectOfficePostOffice("Ameenpur B.O")
		.enterOfficePhoneNumber("0345675432");
	}

}
