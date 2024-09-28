package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC002";
		testCaseDescription ="To validate book your coach form";
		author="vijay";
		category="smoke";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";
	}
	
		@Test
		public void bookYourCoach() {
			
			new HomePage()
			.mouseHoverOnHolidays()
			.mouseHoverOnStays()
			.clickOnLounge()
			.switchToNextWindow()
			.clickOnSideMenuIcon()
			.clickOnBookYourCoachOrTrain()
			.switchToNextWindow()
			.clickOnSignUpButton()
			.enterUserId("Vijay_123456789")
			.enterPassword("Vijay@123")
			.enterConfirmPassword("Vijay@123")
			.selectSecurityQuestion(1)
			.enterSecurityAnswer("tiger")
			.clickOnDateOfBirthField()
			.selectDateOfBirthYear("1996")
			.selectDateOfBirthMonth(3)
			.clickOnDateOfBirthDate()
			.clickOnGender()
			.clickOnMaritialStatus()
			.enterEmail("vijay@gmail.com")
			.selectOccupation("Self Employed")
			.enterFirstName("gampala")
			.enterMiddleName("vijay")
			.enterLastName("kumar")
			.selectNationality("Indian")
			.enterFlatNumber("123")
			.enterStreet("street")
			.enterArea("hyderabad")
			.selectCountry("India")
			.enterMobileNumber("9876543210")
			.enterPincode("533212")
			.selectPostOffice("Kandikuppa B.O")
			.pageDownToClickSameAddressRadioButton() 
			.clickOnRadioButton()
			.enterOfficeFlatNmber("123")
			.enterOfficeStreetNumber("temple street")
			.enterAreaOffice("kphb")
			.selectCountryOffice("India")
			.enterOfficeMobile("9876543210")
			.enterOfficePincode("502032")
			.selectOfficePostOffice("Ameenpur B.O");
			
		}
}
