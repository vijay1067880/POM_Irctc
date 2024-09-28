package pom.simplealert.pages;


import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{
 
	public HomePage closeAllOpenedBrowsers() {
		closeAllBrowsers();
		return this; 
	}
}
