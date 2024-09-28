package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelSearchResultsPage extends GenericWrappers{
	

	public HotelSummaryPage clickOnFirstHotelContainer() {
		clickByXpath("(//*[@class='HotelListBoxMain ng-star-inserted'])[1]");
		return new HotelSummaryPage();
	}
}
