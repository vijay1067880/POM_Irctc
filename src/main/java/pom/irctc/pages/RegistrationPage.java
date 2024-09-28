package pom.irctc.pages;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers{
	
	public RegistrationPage switchToNextWindow() {
	   	 switchToLastWindow();
	   	return this;
	   }
	public RegistrationPage enterUserName(String username) {
		 enterByXpath("//*[@id='userName']", username);
		 return this;
	 }
	 public RegistrationPage enterPassWord(String pwd) {
		 enterByXpath("//*[@id='usrPwd']", pwd);
		 return this;
	 }
	 public RegistrationPage enterConfirmPassword(String cnfpwd) {
		 enterByXpath("//*[@id='cnfUsrPwd']", cnfpwd);
		 return this;
	 }
	 public RegistrationPage clickOnPreferredLanguageDropDown() {
		 clickByXpath("//p-dropdown[@formcontrolname='prefLang']");
		 return this;
	 }
	 public RegistrationPage clickOnLanguageOptionFormPreferredLanguageDropDown() {
		 clickByXpath("//*[text()='English']/..");
		 return this;
	 }
	 public RegistrationPage clickOnSecurityQuestionDropdownField() {
		 clickByXpath("//*[@formcontrolname='secque']");
		 return this;
	 }
	 public RegistrationPage clickOnSecurityQuestionFromDropDown() {
		 clickByXpath("//*[@aria-label='What is your pet name?']");
		 return this;
	 }
	 public RegistrationPage enterSecurityAnswer(String secans) {
		 enterByXpath("//*[@formcontrolname='secAns']", secans);
		 return this;
	 }
	 public RegistrationPage clickOnContinue() {
		 clickByXpath("//*[text()='Continue ']");
		 return this;
	 }
	 public RegistrationPage enterFirstName(String fname) {
		 enterByXpath("//*[contains(@id,'firstName')]", fname);
		 return this;
	 }
	 public RegistrationPage enterMiddleName(String mname) {
		 enterByXpath("//*[contains(@name,'middleName')]", mname);
		 return this;
	 }
	 public RegistrationPage enterLastName(String lname) {
		 enterByXpath("//*[contains(@formcontrolname,'lastname')]", lname);
		 return this;
	 }
	 public RegistrationPage clickOnOccupationMenuField() {
		 clickByXpath("//*[contains(@formcontrolname,'occupation')]");
		 return this;
	 }
	 public RegistrationPage clickOnOccupationOption() {
		clickByXpath("//*[text()='PRIVATE']");
		return this;
	 }
	 public RegistrationPage clickOnDateOfBirthField() {
		 clickByClassName("//*[@placeholder='Date Of Birth']");
		 return this;
	 }
	 public RegistrationPage selectDateOfBirthMonth(String month) {
		 selectVisibleTextByXpath("//*[contains(@class,'ui-datepicker-month')]", month);
		 return this;
	 }
	 public RegistrationPage selectDateOfBirthYear(String year) {
		 selectVisibleTextByXpath("//*[contains(@class,'ui-datepicker-year')]",year );
		 return this;
	 }
	 public RegistrationPage selectDateOFBirthDate() {
		 clickByXpath("//*[text()='21']");
		 return this;
	 }
	 public RegistrationPage clickOnMarriedRadioButton() {
		 clickByXpath("//*[contains(text(),'Married')]/..");
		 return this;
	 }
	 public RegistrationPage selectCountry(String country) {
		 selectVisibleTextByXpath("//*[@formcontrolname='resCountry']", country);
		 return this;
	 }
	 public RegistrationPage clickOnGenderOption() {
		 clickByXpath("//*[text()='Male']");
		 return this;
	 }
	 public RegistrationPage enterEmail(String email) {
		 enterByXpath("//*[contains(@id,'email')]", email);
		 return this;
	 }
	 public RegistrationPage enterMobileNumber(String mblnum) {
		 enterByXpath("//*[contains(@id,'mobile')]",mblnum );
		 return this;
	 }
	 public RegistrationPage selectNationality(String country) {
		 selectVisibleTextByXpath("//*[@formcontrolname='nationality']",country );
		 return this;
	 }
	 public RegistrationPage clickOnContinueToMoveAddressTab() {
		 clickByXpath("//*[@label='Continue']");
	 return this;
	 }
	 public RegistrationPage enterFlatNumber(String flatno) {
		 enterByXpath("//*[contains(@id,'resAddress1')]", flatno);
		 return this;
	 }
	 public RegistrationPage enterStreet(String street) {
		 enterByXpath("//*[@placeholder='Street/Lane (Optional)']", street);
		 return this;
	 }
	 public RegistrationPage enterAreaOrLocality(String area) {
		 enterByXpath("//*[@placeholder='Area/Locality (Optional)']", area);
		 return this;
	 }
	 public RegistrationPage enterPinCode(String pincode) {
		 enterByXpathWithTabKey("//*[@placeholder='Pin code']", pincode);
		 return this;
	 }
	 public RegistrationPage selectCity(int index) {
		selectIndexByXpath(" //*[@formcontrolname='resCity']", index);
		return this;
	 }
	 public RegistrationPage selectPostOffice(String po) {
		 selectVisibleTextByXpath("//*[@formcontrolname='resPostOff']", po);
		 return this;
	 }
	 public RegistrationPage enterPhoneNumber(String phnnum) {
		 enterByXpath("//*[@formcontrolname='resPhone']", phnnum);
		 return this;
	 }
	 public RegistrationPage clickOnCopyResidenceToOfficeAddressRadioButton() {
		 clickByXpath("//*[text()='No']/parent::*");
		 return this;
	 }
	 public RegistrationPage enterOfficeFlatNumber(String ofcflatno) {
		 enterByXpath("//*[@placeholder='Office Flat/Door/Block No.']", ofcflatno);
		 return this;
	 }
	 public RegistrationPage enterOfficeStreet(String ofcstreet) {
		 enterByXpath("//*[@placeholder='Office Street/Lane (Optional)']", ofcstreet);
		 return this;
	 }
	 public RegistrationPage enterOfficeArea(String ofcarea) {
		 enterByXpath("//*[@placeholder='Office Area/Locality (Optional)']", ofcarea);
		 return this;
	 }
	 public RegistrationPage enterOfcPinCode(String ofcpincode) {
		 enterByXpathWithTabKey("//*[@placeholder='Office Pin code']", ofcpincode);
		 return this;
	 }
	 public RegistrationPage selectOfficeCity(int city) {
		selectIndexByXpath("//*[@formcontrolname='offCity']", city);
		return this;
	 }
	 public RegistrationPage selectOfficePostOffice(String ofcpo) {
		 selectVisibleTextByXpath("//*[@formcontrolname='offPostOff']", ofcpo);
		 return this;
	 }
	 public RegistrationPage enterOfficePhoneNumber(String ofcno) {
		 enterByXpath("//*[@formcontrolname='offPhone']", ofcno);
		 return this;
	 }
	 public RegistrationPage closeAllCurrentSessionBrowsers() {
		 closeAllBrowsers();
		 return this;
	 }
	
	
	

}
