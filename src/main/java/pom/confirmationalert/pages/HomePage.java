package pom.confirmationalert.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{
	public HomePage closeAllOpenedBrowsers() {
		closeAllBrowsers();
		return this;
	}
}
