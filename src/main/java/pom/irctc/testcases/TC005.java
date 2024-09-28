package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers{
	
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC005";
		testCaseDescription="To validate the GST validation";
		author="vijay";
		category="Smoke";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";
	}
	
	@Test
	public void bookHotelGstValidation(){
		
		new HomePage()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToNextWindow()
		.clickOnHotel()
		.switchToNextWindow()
		.clickOnGuestLogin()
		.clickOnGuestLoginButton()
		.enterEmailGuest("vijay123@gmail.com")
		.enterMobileNumber("9876543210")
		.clickOnLoginOnGuestUserLoginPopUp()
		.enterDestination("vijayawada")
		.clickOnCityFromDropDown()
		.clickOnCheckInDateField()
		.clickOnCheckInDate()
		.clickOnCheckkOutDateField()
		.clickOnCheckOutDate()
		.clickOnGuestAndRoom()
		.selectNoOfRooms("1")
		.selectNoOfAdults("3")
		.clickOnDone()
		.clickOnSearchHotelButton()
		.clickOnFirstHotelContainer()
		.switchToNextWindow()
		.getHotelNamePrintInConsole()
		.getHotelRoomPricePrintInConsole()
		.clickOnContinueToBookButton()
		.selectTitle("Mr")
		.enterFirstName("Vijay")
		.enterLastName("kumar")
		.enterMobileNumber("0987654321")
		.enterEmailId("hgfdsa@gmail.com")
		.selectGstOptionYes("Yes")
		.enterCompanyName("ABCsolutions")
		.enterCompanyAddress("Hyderabad")
		.clickOnMakePaymentOrContinueButton()
		.verifyErrorMessageDisplayedForGst("Please Enter Valid GST Number")
		;
		
		
		
		
		
		
	}
}
