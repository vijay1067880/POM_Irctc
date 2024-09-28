package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.formc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC006 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC006";
		testCaseDescription="To validate the Form C";
		author="vijay";
		category="Smoke";
		browserName="chrome";
		url="https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp";
	}
	
	@Test
	public void formcRegistration() {
		
		new HomePage()
		.clickOnRegistrationLink()
		.enterUserName("Vijay123456654")
		.enterPassword("Vijay@123")
		.enterConfirmPassword("Vijay@143")
		.selectSecurityQuestion(4)
		.selectSecurityAnswer("TIger")
		.enterName("vijay")
		.selectGender("Male")
		.enterDateOfBirth("21/04/1997")  
		.enterDesignation("Mr")
		.enterEmail("vijay@gmail.com")
		.enterMobile("1234567890")
		.enterPhoneNumber("0987654321")
		.enterNameHotelDetails("kumar")
		.enterCapacityHotelDetails("15")
		.enterAddressHotelDetails("hyderabad")
		.selectState("TELANGANA")
		.selectCityOrDistrict("HYDERABAD")
		.selectAccomodationType("Dharmshala")
		.selectAccommodationGrade("One Star")
		.enterEmailHotelDetails("Hotel@gmail.com")
		.enterMobileHotelDetails("3456534567")
		.enterPhoneHotel("0987654567")
		.enterNameOwnerDetails("vijay")
		.enterAddressOwnerDetails("hyderabad")
		.selectOwnerState("TELANGANA")
		.selectOwnerDist("SANGAREDDY")
		.enterEmailOwnerDetails("vijay@gmail.com")
		.enterPhoneOwnerDetails("0987654321")
		.enterMobileOwnerDetails("0987654321")
		.clickOnAddButton()
		.enterNameOwnerDetails("kumar")
		.enterAddressOwnerDetails("bangalore")
		.selectOwnerState("TELANGANA")//BIHAR
		.selectOwnerDist("SANGAREDDY")//MUZAFFARPUR
		.enterEmailOwnerDetails("kumar@gmail.com")
		.enterPhoneOwnerDetails("0987654321")
		.enterMobileOwnerDetails("0987654321")
		.clickOnAddButton()
		.enterNameOwnerDetails("venkat")
		.enterAddressOwnerDetails("Goa")
		.selectOwnerState("TELANGANA")//LADAKH
		.selectOwnerDist("SANGAREDDY")//LEH
		.enterEmailOwnerDetails("venkat@gmail.com")
		.enterPhoneOwnerDetails("0987654321")
		.enterMobileOwnerDetails("0987654321")
		.clickOnAddButton()
		;
	}
		
	}
