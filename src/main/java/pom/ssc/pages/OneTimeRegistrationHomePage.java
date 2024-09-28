package pom.ssc.pages;

import wrappers.GenericWrappers;

public class OneTimeRegistrationHomePage extends GenericWrappers{
	 
	public PersonalDetailsPage clickOnContinueButton() {
		clickByXpath("//*[text()='Continue']");
		return new PersonalDetailsPage();
	}
}
