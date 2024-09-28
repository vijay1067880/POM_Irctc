package pom.irctc.pages;


import wrappers.GenericWrappers;

public class FtrUserRegistrationPage extends GenericWrappers{
	
	public FtrUserRegistrationPage switchToNextWindow() {
	   	 switchToLastWindow();
	   	return this;
	   }
	 public FtrUserRegistrationPage enterUserId(String userid) {
		 enterByXpath("//*[@id='userId']", userid);
		 return this;
	 }
	 public FtrUserRegistrationPage enterPassword(String pwd) {
		 enterByXpath("//*[@id='password']", pwd);
		 return this;
	 }
	 public FtrUserRegistrationPage enterConfirmPassword(String cnfpwd) {
		 enterByXpath("//*[@id='cnfPassword']", cnfpwd);
		 return this;
	 }
	 public FtrUserRegistrationPage selectSecurityQuestion(int index) {
		 selectIndexByXpath("//*[@id='secQstn']", index);
		 return this;
	 }
	 public FtrUserRegistrationPage enterSecurityAnswer(String secans) {
		 enterByXpath("//*[@id='secAnswer']", secans);
		 return this;
	 }
	 public FtrUserRegistrationPage clickOnDateOfBirthField() {
		 clickByXpath("//*[@id='dateOfBirth']");
		 return this;
	 }
	 public FtrUserRegistrationPage selectDateOfBirthMonth(int month) {
		 selectIndexByXpath("//*[contains(@aria-label,'Select month')]", month);
		 return this;
	 }
	 public FtrUserRegistrationPage selectDateOfBirthYear(String yeardob) {
		 selectVisibleTextByXpath("//*[contains(@aria-label,'Select year')]", yeardob);
		 return this;
	 }
	 public FtrUserRegistrationPage clickOnDateOfBirthDate() {
		 clickByXpath("//*[contains(@data-date,'21')]");
		 return this;
	 }
	 public FtrUserRegistrationPage clickOnGender() {
		 clickByXpath("//*[@for='gender0']");
		 return this;
	 }
	 public FtrUserRegistrationPage clickOnMaritialStatus() {
		 clickByXpath("//*[@id='maritalStatus0']");
		 return this;
	 }
	 public FtrUserRegistrationPage enterEmail(String email) {
		 enterByXpath("//*[@id='email']", email);
		 return this;
	 }
	 public FtrUserRegistrationPage selectOccupation(String occupation) {
		 selectVisibleTextByXpath("//*[@id='occupation']", occupation);
		 return this;
	 }
	 public FtrUserRegistrationPage enterFirstName(String fname) {
		 enterByXpath("//*[@id='fname']", fname);
		 return this;
	 }
	 public FtrUserRegistrationPage enterMiddleName(String mname) {
		 enterByXpath("//*[@id='mname']", mname);
		 return this;
	 }
	 public FtrUserRegistrationPage enterLastName(String lname) {
		 enterByXpath("//*[@id='lname']", lname);
		 return this;
	 }
	 public FtrUserRegistrationPage selectNationality(String nationality) {
		 selectVisibleTextByXpath("//*[@id='natinality']", nationality);
		 return this;
	 }
	 public FtrUserRegistrationPage enterFlatNumber(String flatno) {
		 enterByXpath("//*[@id='flatNo']", flatno);
		 return this;
	 }
	 public FtrUserRegistrationPage enterStreet(String street) {
		 enterByXpath("//*[@id='street']", street);
		 return this;
	 }
	 public FtrUserRegistrationPage enterArea(String area) {
		 enterByXpath("//*[@id='area']", area);
		 return this;
	 }
	 public FtrUserRegistrationPage selectCountry(String country) {
		 selectVisibleTextByXpath("//*[@id='country']", country);
		 return this;
	 }
	 public FtrUserRegistrationPage enterMobileNumber(String number) {
		 enterByXpath("//*[@id='mobile']", number);
		 return this;
	 }
	 public FtrUserRegistrationPage enterPincode(String pincode) {
		 enterByXpathWithTabKey("//*[@id='pincode']", pincode);
		 return this;
	 }
	 public FtrUserRegistrationPage selectPostOffice(String postoffice) {
		 selectVisibleTextByXpath("//*[@id='postOffice']", postoffice);
		 return this;
	 }
	 public FtrUserRegistrationPage pageDownToClickSameAddressRadioButton() {
		pageDown("//html/body");
		 return this;
	 }
	 public FtrUserRegistrationPage clickOnRadioButton() {
		 clickByXpath("//*[@id='sameAddresses1']");
		 return this;
	 }
	 public FtrUserRegistrationPage enterOfficeFlatNmber(String numofc) {
		 enterByXpath("//*[@id='flatNoOffice']", numofc);
		 return this;
	 }
	 public FtrUserRegistrationPage enterOfficeStreetNumber(String street) {
		 enterByXpath("//*[@id='streetOffice']", street); 
		 return this;
	 }
	 public FtrUserRegistrationPage enterAreaOffice(String area) {
		enterByXpath("//*[@id='areaOffice']", area); 
		return this;
	 }
	 public FtrUserRegistrationPage selectCountryOffice(String countryofc) {
		 selectVisibleTextByXpath("//*[@id='countryOffice']", countryofc);
		 return this;
	 }
	 public FtrUserRegistrationPage enterOfficeMobile(String mblofc){
		 enterByXpath("//*[@id='mobileOffice']", mblofc);
		 return this;
	 }
	 public FtrUserRegistrationPage enterOfficePincode(String pincodeofc) {
		 enterByXpathWithTabKey("//*[@id='pincodeOffice']", pincodeofc);
		 return this;
	 }
	 public FtrUserRegistrationPage selectOfficePostOffice(String ofcpo) {
		 selectVisibleTextByXpath("//*[contains(@id,'postOfficeOffice')]", ofcpo);
		 return this;
	 }
	 public void closeAllBrowsersOfCurrentSession() {
		 closeAllBrowsers();
	 }
}
