package pom.irctc.pages;


import wrappers.GenericWrappers;

public class AccommodationPage extends GenericWrappers{
	
    public AccommodationPage switchToNextWindow() {
    	 switchToLastWindow();
    	return this;
    }
    
	public AccommodationPage clickOnSideMenuIcon() {
		clickByXpath("//*[@id='sidebarCollapse']");
		return this;
	}
	public FtrLoginOrSignUpPage clickOnBookYourCoachOrTrain() {
		clickByXpath("//*[contains(text(),'Book Your Coach/Train')]");
		return new FtrLoginOrSignUpPage();
	}
	
	public CharterHomePage clickOnCharter() {
		clickByXpath("//*[text()='Charter']");
		return new CharterHomePage();
	}
	
	public HotelBookingPage clickOnHotel() {
		clickByXpath("(//*[contains(text(),'Hotels')])[2]");   //try to write xpath without indexing
		return new HotelBookingPage();
	}
}
