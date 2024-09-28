package pom.ssc.pages;

import wrappers.GenericWrappers;

public class LoginPage extends GenericWrappers{
	public LoginPage pageDownToClickOnRegister() {
		pageDown("//html/body");
		return this;
	}
	public OneTimeRegistrationHomePage clickOnRegisterButton() {
		clickByXpath("//*[text()=' Register Now ']");
		return new OneTimeRegistrationHomePage();
	}
}
