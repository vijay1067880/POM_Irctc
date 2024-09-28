package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC004 extends ProjectWrappers {
	
	 @BeforeClass	 
		public void beforeClass() {
			testCaseName="TC004";
			testCaseDescription="To validate the hotel booking OTP validation";
			author="vijay";
			category="Smoke";
			browserName="chrome";
			url="https://www.irctc.co.in/nget/train-search";
		}
		
	
	
	@Test
	public void bookHotelOtpValidation() {
		
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
		.enterDestination("hyderabad")
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
		.enterFirstName("vijay")
		.enterLastName("kumar")
		.selectState("ANDHRA PRADESH")
		.selectGstNo("No")
		.compareHotelNames("Park Paradise")
		.compareHotelPrices("1990")
		.pageDownToClickOnMakePayment()
		.clickOnMakePaymentOrContinueButton()
		.clickOnVerifyOnOtpPopUp()
		.verifyOtpValidatedText("OTP Field Is Required")
		
		
	;
	}
}
