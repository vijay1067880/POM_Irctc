package pom.irctc.pages;

import wrappers.GenericWrappers;

public class GuestUserLoginPage extends GenericWrappers{
	
	public GuestUserLoginPage switchToNextWindow() {
	   	 switchToLastWindow();
	   	return this;
	   }
	public  GuestUserLoginPage clickOnGuestLoginButton() {
		clickByXpath("//*[text()='Guest User Login ']");
		return this;
	}
	public GuestUserLoginPage enterEmailGuest(String email) {
		enterByXpath("//*[contains(@placeholder,'Enter Email')]", email);
		return this;
	}
	public GuestUserLoginPage enterMobileNumber(String mblnum) {
		enterByXpath("//*[contains(@placeholder,'Enter Mobile Number')]", mblnum);
		return this;
	}
	public HotelBookingPage clickOnLoginToReturnHotelBookingPage() {
		clickByXpath("(//*[text()='Login'])[1]");
		return new HotelBookingPage();
	}
	public PassengerSummaryPage clickOnLoginToReturnPassengerSummaryPage() {
		clickByXpath("(//*[text()='Login'])[1]");
		return new PassengerSummaryPage();
	}
}
