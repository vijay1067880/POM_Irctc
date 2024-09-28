package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelBookingPage extends GenericWrappers{
	
	public HotelBookingPage switchToNextWindow() {
	   	 switchToLastWindow();
	   	return this;
	   }
	public HotelBookingPage clickOnGuestLogin() {
		clickByXpath("//*[@data-bs-target='#LoginModal']");
		return  this;
	}
	public  HotelBookingPage clickOnGuestLoginButton() {
		clickByXpath("//*[text()='Guest User Login ']");
		return this;
	}
	public HotelBookingPage enterEmailGuest(String email) {
		enterByXpath("//*[contains(@placeholder,'Enter Email')]", email);
		return this;
	}
	public HotelBookingPage enterMobileNumber(String mblnum) {
		enterByXpath("//*[contains(@placeholder,'Enter Mobile Number')]", mblnum);
		return this;
	}
	public HotelBookingPage clickOnLoginOnGuestUserLoginPopUp() {
		clickByXpath("(//*[text()='Login'])[1]");
		return this;
	}
	public PassengerSummaryPage clickOnLoginToReturnPassengerSummaryPage() {
		clickByXpath("(//*[text()='Login'])[1]");
		return new PassengerSummaryPage();
	}
	public HotelBookingPage enterDestination(String destination) {
		enterByXpath("//*[@placeholder='e.g. - City, Location or Hotel Name']", destination);
		return this;
	}
	public HotelBookingPage clickOnCityFromDropDown() {
		clickByXpath("(//li[@style='border-bottom: 1px solid #e3e3e3; padding: 7px 0 7px 0;'])[1]");
		return this;
	}
	public HotelBookingPage clickOnCheckInDateField() {
		clickByXpath("//*[@formcontrolname='checkInDate']");
		return this;
	}
	public HotelBookingPage clickOnCheckInDate() {
		clickByXpath("(//*[text()='28'])[2]");
		return this;
	}
	public HotelBookingPage clickOnCheckkOutDateField() {
		clickByXpath("//*[@formcontrolname='checkOutDate']");
		return this;
	}
	public HotelBookingPage clickOnCheckOutDate() {
		clickByXpath("(//*[text()='30'])[2]");
		return this;
	}
	public HotelBookingPage clickOnGuestAndRoom() {
		clickByXpath("//*[contains(@placeholder,'Guests')]");
		return this;
	}
	public HotelBookingPage selectNoOfRooms(String rooms) {
		selectVisibleTextByXpath("//*[@formcontrolname='rooms']", rooms);
		return this;
	}
	public HotelBookingPage selectNoOfAdults(String adults) {
		selectVisibleTextByXpath("//*[@formcontrolname='adults']", adults);
		return this;
	}
	public HotelBookingPage clickOnDone() {
		clickByXpath("//*[text()='Done']");
		return this;
	}
	public HotelSearchResultsPage clickOnSearchHotelButton() {
		clickByXpath("//*[text()='Search Hotel']");
		return new HotelSearchResultsPage();
	}
	
}
