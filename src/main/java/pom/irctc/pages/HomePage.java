package pom.irctc.pages;



import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers {
	
	
	public RegistrationPage clickOnRegister() {
		clickByXpath("//*[text()=' REGISTER ']");
		return new RegistrationPage();
	}
	
	public HomePage mouseHoverOnHolidays() {
		mouseHoverByXpath("//*[text()=' HOLIDAYS ']");
		return this;
	}
	public HomePage mouseHoverOnStays() {
		mouseHoverByXpath("//*[contains(text(),'Stays')]/parent::a");
		return this;
	}
	public AccommodationPage clickOnLounge() {
		clickByXpath("//*[contains(@aria-label,'Sub Menu of Stays, Lounge.')]");
			return new AccommodationPage();	
	}
	

}
