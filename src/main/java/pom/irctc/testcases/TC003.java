package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers{
    @BeforeClass	 
	public void beforeClass() {
		testCaseName="TC003";
		testCaseDescription="To validate saloon mandatory check flow";
		author="vijay";
		category="Smoke";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";
	}
	
	
	@Test
	public void saloonMandatoryCheck() {
		
		new HomePage()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToNextWindow()
		.clickOnSideMenuIcon()
		.clickOnCharter()
		.clickOnSideMenuDismiss()
		.clickOnEnquiryFormTab()
		.enterName("vijay")
		.enterOrganisationName("LTI")
		.enterAddress("ameenpur")
		.enterMobileNumber("98765432")
		.enterEmail("vijay123@gmail.com")
		.selectRequestOption("Saloon Charter")
		.enterOrginStation("bza")
		.enterDestinationStation("lpi")
		.clickOnDateOfDepartureField()
		.clickOnDateOfDepartureOnCalender()
		.clickOnDateOfArrivalField()
		.clickonDateOfArrivalCalenderDate()
		.enterDurationTour("4")
		.enterNumberOfCoaches("6")
		.enterNumberOfPassengers("145")
		.enterPurposeOfCharter("NA")
		.enterAdditionalServices("NA")
		.clickOnSubmit()
		.validateMobileErrorTextMessage("Mobile no not valid.") 
		;
		
		
		
	}
}
