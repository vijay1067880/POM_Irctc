package pom.irctc.pages;

import wrappers.GenericWrappers;

public class PassengerSummaryPage extends GenericWrappers{
	
	public PassengerSummaryPage switchToNextWindow() {
	   	 switchToLastWindow();
	   	return this;
	   }
	public PassengerSummaryPage selectTitle(String title) {
		selectVisibleTextByXpath("//*[@formcontrolname='title']", title);
		return this;
	}
	public PassengerSummaryPage enterFirstName(String fname) {
		enterByXpath("//*[@formcontrolname='firstName']", fname);
		return this;
	}
	public PassengerSummaryPage enterLastName(String lname) {
		enterByXpath("//*[@formcontrolname='lastName']", lname);
		return this;
	}
	public PassengerSummaryPage selectState(String country) {
		selectVisibleTextByXpath("//*[@formcontrolname='stateName']", country);
		return this;
		}
	public PassengerSummaryPage enterMobileNumber(String mblno) {
		enterByXpath("//*[@formcontrolname='mobileNo']", mblno);
		return this;
	}
	public PassengerSummaryPage enterEmailId(String email) {
		enterByXpath("//*[@placeholder='Email Id']", email);
		return this;
	}
	public PassengerSummaryPage pageDownToClickOnMakePayment() {
		pageDown("//html/body");
		return this;
	}
	public PassengerSummaryPage selectGstOptionYes(String yesoption) {
		selectVisibleTextByXpath("//*[@formcontrolname='gst']", yesoption);
		return this;
	}
	public PassengerSummaryPage enterCompanyName(String companyname) {
		enterByXpath("//*[@formcontrolname='companyName']", companyname);
		return this;
	}
	public PassengerSummaryPage enterCompanyAddress(String compaddress) {
		enterByXpath("//*[@formcontrolname='companyAddress']", compaddress);
		return this;
	}

	public PassengerSummaryPage verifyErrorMessageDisplayedForGst(String txttobevalidated) {
		verifyTextByXpath("//*[contains(text(),'Customer GSTIN is required.')]", txttobevalidated);
		return this;
	}
	//to validate otp
	public PassengerSummaryPage selectGstNo(String Nooption) {
		selectVisibleTextByXpath("//*[@formcontrolname='gst']", Nooption);
		return this;
	}
	public PassengerSummaryPage compareHotelNames(String hotelnameinitial) {
		//HotelSummaryPage obj = new HotelSummaryPage();
		
		verifyTextByXpath("//*[contains(@class,'row')]/following::h1", hotelnameinitial );//need to confirm with basha bro how to get initial hotel price form other class
		return this;
	}
	public PassengerSummaryPage compareHotelPrices(String hotelpriceinitial) {
		//HotelSummaryPage obj = new HotelSummaryPage();
		verifyTextByXpath("(//i[contains(@class,'RupIcon')]/preceding::span)[21]",hotelpriceinitial );
		return this;
	}
	public PassengerSummaryPage clickOnMakePaymentOrContinueButton() {
		clickByXpath("//*[@class='ContinueBtn']");
		return this;
	}
	public PassengerSummaryPage clickOnVerifyOnOtpPopUp() {
		clickByXpath("//*[text()='Verify']");
		return this;
	}
	public PassengerSummaryPage verifyOtpValidatedText(String otptexttobevalidated) {
		verifyTextByXpath("//*[contains(@class,'OtpErrors')]", otptexttobevalidated);
		return this;
	}
	 public PassengerSummaryPage closeAllCurrentSessionBrowsers() {
		 closeAllBrowsers();
		 return this;
	 }
	
	
}
