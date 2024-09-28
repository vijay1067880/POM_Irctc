package pom.facebooksignup.pages;

import java.lang.classfile.Signature;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers {

	public SignUpPage clickOnCreateNewButton() {
		clickByXpath(prop.getProperty("FacebookHomePage.CreateNewAccount.XPath"));
		return new SignUpPage();
	}
}
