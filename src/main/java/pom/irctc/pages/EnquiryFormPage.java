package pom.irctc.pages;

import wrappers.GenericWrappers;

public class EnquiryFormPage extends GenericWrappers{
	
	
	public EnquiryFormPage enterName(String name) {
		enterByXpath("//*[@placeholder='Name of Applicant']", name);
		return this;
	}
	public EnquiryFormPage enterOrganisationName(String orgname) {
		enterByXpath("//*[@placeholder='Name of Organisation']", orgname);
		return this;
	}
	public EnquiryFormPage enterAddress(String address) {
		enterByXpath("//*[@placeholder='Address']", address);
		return this;
	}
	public EnquiryFormPage enterMobileNumber(String num) {
		enterByXpath("//*[@placeholder='Mobile*']", num);
		return this;
	}
	public EnquiryFormPage enterEmail(String email) {
		enterByXpath("//*[@placeholder='Email']", email);
		return this;
	}
	public EnquiryFormPage selectRequestOption(String reqotion) {
		selectVisibleTextByXpath("//*[@name='requestFor']", reqotion);
		return this;
	}
	public EnquiryFormPage enterOrginStation(String orgstation) {
		enterByXpath("//*[@name='originStation']", orgstation);
		return this;
	}
	public EnquiryFormPage enterDestinationStation(String destnstation) {
		enterByXpath("//*[@name='destnStation']", destnstation);
		return this;
	}
	public EnquiryFormPage clickOnDateOfDepartureField() {
		clickByXpath("//*[@name='checkInDate']");
		return this;
	}
	public EnquiryFormPage clickOnDateOfDepartureOnCalender() {
		clickByXpath("//*[text()='27']");
		return this;
	}
	public EnquiryFormPage clickOnDateOfArrivalField() {
		clickByXpath("//*[@name='checkOutDate']");
		return this;
	}
	public EnquiryFormPage pageDown() {
		pageDown("//html/body");
		return this;
	}
	public EnquiryFormPage clickonDateOfArrivalCalenderDate() {
		clickByXpath("(//*[text()='29'])[2]");
		return this;
	}
	public EnquiryFormPage enterDurationTour(String durationdays) {
		enterByXpath("//*[@name='durationPeriod']", durationdays);
		return this;
	}
	public EnquiryFormPage enterNumberOfCoaches(String days) {
		enterByXpath("//*[@name='coachDetails']", days);
		return this;
	}
	public EnquiryFormPage enterNumberOfPassengers(String noofpassengers) {
		enterByXpath("//*[@name='numPassenger']", noofpassengers);
		return this;
	}
	public EnquiryFormPage enterPurposeOfCharter(String purpose) {
		enterByXpath("//*[@name='charterPurpose']", purpose);
		return this;
	}
	public EnquiryFormPage enterAdditionalServices(String addnalservices) {
		enterByXpath("//*[@name='services']", addnalservices);
		return this;
	}
	public EnquiryFormPage clickOnSubmit() {
		clickByXpath("//*[contains(text(),'Submit ')]");
		return this;
	}
	public EnquiryFormPage validateMobileErrorTextMessage(String errtxt) {
		verifyTextByXpath("//*[contains(text(),'Mobile no. not valid')]", errtxt);
		return this;
	}
	 public void closeAllBrowsersOfCurrentSession() {
		 closeAllBrowsers();
	 }
	
}
