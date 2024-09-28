package pom.ssc.pages;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

import pom.formc.pages.RegistrationPage;
import wrappers.GenericWrappers;

public class PersonalDetailsPage extends GenericWrappers{
	 
	public PersonalDetailsPage clickOnAadharCardRadioButton(){
		clickByXpath("(//*[text()=' Yes ']/..)[1]");
		return this;
	}
	public PersonalDetailsPage enterAadharNumber(String aadharnum) {
		enterByXpath("//*[@aria-describedby='aadharInfo']", aadharnum);
		return this;
	}
	public PersonalDetailsPage enterAadharNumberToVerify(String verifyaadharnum) {
		enterByXpath("//*[@aria-describedby='aadharInfoVerify']", verifyaadharnum);
		return this;
	}
	public PersonalDetailsPage enterCandidateName(String name) {
		enterByXpath("//*[@aria-describedby='userName']", name);
		return this;
	}
	public PersonalDetailsPage enterVerifyCandidateName(String name) {
		enterByXpath("//*[@aria-describedby='userInfoVerify']", name);
		return this;
	}
	public PersonalDetailsPage clickOnChangeNameRadioButton() {
		clickByXpath("(//*[@name='changed'])[2]");
		return this;
	}
	public PersonalDetailsPage clickOnGenderSelectDropDownField() {
		clickByXpath("(//*[text()=' 5. Gender '])/following-sibling::div");
		return this;
	}
	public PersonalDetailsPage clickOnGenderOption() {
		clickByXpath("//*[text()=' Male ']");
		return this;
	}
	public PersonalDetailsPage clickOnVerifyGenderDropDownField() {
		clickByXpath("//*[text()=' a. Verify Gender ']/following-sibling::div");
		return this;
	}
	public PersonalDetailsPage clickOnVerifyGenderOption() {
		clickByXpath("//*[text()=' Male ']");
		return this;
	}
	public PersonalDetailsPage clickOnDateOfBirthCalenderIcon() {
		clickByXpath("(//*[@aria-label='Open calendar'])[1]");
		return this;
	}
	public PersonalDetailsPage clickOnMonthAndYearButton() {
		clickByXpath("//*[@aria-label='Choose month and year']");
		return this;
	}
	public PersonalDetailsPage clickOnPreviousYearsArrowKey() {
		clickByXpath("//*[@aria-label='Previous 24 years']");
		return this;
	}
	public PersonalDetailsPage clickOnYear() {
		clickByXpath("//*[text()=' 1997 ']");
		return this;
	}
	public PersonalDetailsPage clickOnMonth() {
		clickByXpath("//*[text()=' APR ']");
		return this;
	}
	public PersonalDetailsPage clickOnDate() {
		clickByXpath("//*[text()=' 21 ']");
		return this;
	}
	public PersonalDetailsPage clickOnVerifyDateOfBirthOpenCalender() {
		clickByXpath("(//*[@aria-label='Open calendar'])[2]");
		return this;
	}
	public PersonalDetailsPage clickOnVerifyDobMonthAndYearButton() {
		clickByXpath("//*[@aria-label='Choose month and year']");
	return this;
	}
	public PersonalDetailsPage clickOnVerifyDobPreviousYears() {
		clickByXpath("//*[@aria-label='Previous 24 years']");
		return this;
	}
	public PersonalDetailsPage clickOnVerifyDobYear() {
		clickByXpath("//*[text()=' 1997 ']");
		return this;
	}
	public PersonalDetailsPage clickOnVerifyDobMonth() {
		clickByXpath("//*[text()=' APR ']");
		return this;
	}
	public PersonalDetailsPage clickOnVerifyDobDate() {
		clickByXpath("//*[text()=' 21 ']");
		return this;
	}
	public PersonalDetailsPage enterFatherName(String fathername) {
		enterByXpath("//*[@for='forFatherName']/following-sibling::input", fathername);
		return this;
	}
	public PersonalDetailsPage enterVerifyFartherName(String verifyfathername) {
	enterByXpath("//*[@for='forVerifyFatherName']/following-sibling::input", verifyfathername);
	return this;
	}
	public PersonalDetailsPage enterMotherName(String mothername) {
	 enterByXpath("//*[@for='forMotherName']/following-sibling::input", mothername);
	 return this;
	}
	public PersonalDetailsPage enterMotherNameVerify(String verifymothername) {
		enterByXpath("//*[@aria-describedby='userMotherNameVerify']", verifymothername);  
		return this;
	}
	public PersonalDetailsPage clickOnMatriculationBoardDropdownField() {
		clickByXpath("//*[text()=' 9. Matriculation (10th class) Education Board ']/following-sibling::div");
		return this;
	}
	public PersonalDetailsPage selectOnMatriculationBoardOption() {
		clickByXpath("//*[text()=' Board of Secondary Education Andhra Pradesh ']");
		return this;
	}
	public PersonalDetailsPage clickonMatriculationBoardVerifyDropDownField() {
		clickByXpath("//*[text()=' a. Verify Matriculation (10th class) Education Board ']/following-sibling::div");
		return this;
	}
	public PersonalDetailsPage selectOnMatriculationBoardVerifyOption() {
		clickByXpath("(//*[text()=' Board of Secondary Education Andhra Pradesh '])[2]");
		return this;
	}
	public PersonalDetailsPage enterRollNmber(String rollnum) {
		enterByXpath("//*[@for='forMetricRollNumber']/following-sibling::input", rollnum);
		return this;
	}
	public PersonalDetailsPage enterRollNumberVerify(String verfrollnum) {
		enterByXpath("//*[@for='forMetricRollNumberVerfiy']/following-sibling::input", verfrollnum);
		return this;
	}
	public PersonalDetailsPage clickOnYearOfPassingDropDownField() {
		clickByXpath("//*[text()=' 11. Year of Passing ']/following-sibling::div");
		return this;
	}
	public PersonalDetailsPage selectYearOfPassing() {
		clickByXpath("//*[text()=' 2012 ']");
		return this;
	}
	public PersonalDetailsPage clickOnVerifyYearOfPassingDropDownField() {
		clickByXpath("//*[text()=' a. Verify Year of Passing ']/following-sibling::div");
		return this;
	}
	public PersonalDetailsPage  selectVerifyYearOfPassing() {
		clickByXpath("(//*[text()=' 2012 '])[2]");
		return this;
	}
	public PersonalDetailsPage clickOnHighestEducationDropDownField() {
		clickByXpath("(//*[text()=' 12. Highest Level of Education Qualification '])/following-sibling::div");
		return this;
	}
	public PersonalDetailsPage selectHighestQualificaiton() {
		clickByXpath("(//*[text()=' Graduation '])");
		return this;
	}
	public PersonalDetailsPage clickOnVerifyHighestEducationDropDownField() {
		clickByXpath("(//*[text()=' a. Verify Highest Level of Education Qualification '])/following-sibling::div");
		return this;
	}
	public PersonalDetailsPage selectVerifyHighestEducation() {
		clickByXpath("(//*[text()=' Graduation '])[2]");
		return this;
	}
	public PersonalDetailsPage enterMobileNumber(String mblno) {
		enterByXpath("//*[@aria-describedby='mobileInfo']", mblno);
		return this;
	}
	public PersonalDetailsPage enterEmail(String email) {
		enterByXpath("//*[@aria-describedby='userEmail']", email);
		return this;
	}
	public PersonalDetailsPage clickOnSaveNext() {
		clickByXpath("//*[text()='Save & Next']");
		return this;
	}
	public PersonalDetailsPage closeAllOpenedBrowsers() {
		closeAllBrowsers();
		return this;
	}
}
