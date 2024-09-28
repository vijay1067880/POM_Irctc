package pom.facebooksignup.pages;

import wrappers.GenericWrappers;

public class SignUpPage extends GenericWrappers {

	public SignUpPage enterFirstName(String fname) {
		enterByXpath(prop.getProperty("FacebookSignupPage.FirstName.XPath"), fname);
		return this;
	}
	public SignUpPage enterLastName(String lname){
		enterByXpath(prop.getProperty("FacebookSignup.LastName.XPath"), lname);
		return this;
	}
	public SignUpPage enterEmail(String email) {
		enterByXpath(prop.getProperty("FacebookSignupPage.EnterEmail.Xpath"), email);
		return this;
	}
	public SignUpPage confirmEmail(String confemail) {
		enterByXpath("//*[@name='reg_email_confirmation__']", confemail);
		return this;
	}
	public SignUpPage enterPassword(String pwd) {
		enterByXpath(prop.getProperty("FacebookSignupPage.EnterPassword.Xpath"), pwd);
		return this;
	}
	public SignUpPage selectBirthDayDate(String day) {
		selectVisibleTextByXpath(prop.getProperty("FacebookSignupPage.BirthdayDate.Xpath"), day);
		return this;
	}
	public SignUpPage selectBirthDayMonth(String month) {
		selectIndexByXpath(prop.getProperty("FacebookSignupPage.BirthdayMonth.Xpath"),Integer.parseInt(month));
		return this;
	}
	public SignUpPage selectBirthDayYear(String year) {
		selectVisibleTextByXpath(prop.getProperty("FacebookSignupPage.BirthdayYear.Xpath"), year);
	return this;
	}
	public SignUpPage clickOnGenderButton() {
		clickByXpath(prop.getProperty("FacebookSignupPage.SelectGender.Xpath"));
		return this;
	}
	public VerificationPage clickOnSignUp() {
		clickByXpath(prop.getProperty("FacebookSignupPage.ClickOnSignUp.Xpath"));
		return new VerificationPage();
	
	}
}
