package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelSummaryPage extends GenericWrappers {
	
	public HotelSummaryPage switchToNextWindow() {
	   	 switchToLastWindow();
	   	return this;
	   }
	public HotelSummaryPage getHotelNamePrintInConsole() {
		String hotelname= getTextByXpath("(//*[contains(@class,'row')]/following::h1)[1]");
		System.out.println(hotelname);
		return this;
	}
	public HotelSummaryPage getHotelRoomPricePrintInConsole() {
		String hotelprice =  getTextByXpath("(//*[contains(@class,'RupeeIcon')]/following::span)[1]");
		System.out.println(hotelprice);
		return this;
	}
	public PassengerSummaryPage clickOnContinueToBookButton() {
		clickByXpath("//*[contains(text(),'Continue to Book')]");
		return new PassengerSummaryPage();
	}
}
