package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebooksignup.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC010 extends ProjectWrappers{
	 
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC010";
		testCaseDescription="To verify facebook sign up for the new user registration";
		author="vijay";
		category="smoke";
		browserName="Chrome";
		url="https://www.facebook.com";
		sheetName="TC010";
	}
	
	
	
	@Test(dataProvider = "fetchData")
	public void facebookSignup(String firstName, String lastName, String emailId,String confemail , String password
			,String date, String month, String year) {
		
		new HomePage()
		.clickOnCreateNewButton()
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterEmail(emailId)
		.enterPassword(password)
		.selectBirthDayDate(date)
		.selectBirthDayMonth(month)
		.selectBirthDayYear(year)
		.clickOnGenderButton()
		.clickOnSignUp()
		;
	}
}
