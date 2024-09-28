package pom.formc.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers {
 public RegistrationPage clickOnRegistrationLink() {
	 clickByXpath("//a[text()='Sign Up (Registration)']");
	 return new RegistrationPage();
 }
}
