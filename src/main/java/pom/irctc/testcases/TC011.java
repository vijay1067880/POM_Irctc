package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.ssc.pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC011 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC011";
		testCaseDescription="To verify SSC sign up for the new user registration";
		author="vijay";
		category="smoke";
		browserName="Chrome";
		url="https://ssc.gov.in/login";
	}
	
	@Test
	public void sscLogin() {
		 
		 new LoginPage()
		.pageDownToClickOnRegister()
		.clickOnRegisterButton()
		.clickOnContinueButton()
		.clickOnAadharCardRadioButton()
		.enterAadharNumber("214124076629")
		.enterAadharNumberToVerify("214124076629")
		.enterCandidateName("Vijay")
		.enterVerifyCandidateName("Vijay")
		.clickOnChangeNameRadioButton()
		.clickOnGenderSelectDropDownField()
		.clickOnGenderOption()
		.clickOnVerifyGenderDropDownField()
		.clickOnVerifyGenderOption()
		.clickOnDateOfBirthCalenderIcon()
		.clickOnVerifyDobMonthAndYearButton()
		.clickOnVerifyDobPreviousYears()
		.clickOnPreviousYearsArrowKey()
		.clickOnYear()
		.clickOnMonth()
		.clickOnDate()
		.clickOnVerifyDateOfBirthOpenCalender()
		.clickOnVerifyDobMonthAndYearButton()
		.clickOnVerifyDobPreviousYears()
		.clickOnVerifyDobYear()
		.clickOnVerifyDobMonth()
        .clickOnVerifyDobDate()
        .enterFatherName("satish")
        .enterVerifyFartherName("satish")
        .enterMotherName("padma")
        .enterMotherNameVerify("padma")
        .clickOnMatriculationBoardDropdownField()
        .selectOnMatriculationBoardOption()
        .clickonMatriculationBoardVerifyDropDownField()
        .selectOnMatriculationBoardVerifyOption()
        .enterRollNmber("1456")
        .enterRollNumberVerify("1456")
        .clickOnYearOfPassingDropDownField()
        .selectYearOfPassing()
        .clickOnVerifyYearOfPassingDropDownField()
        .selectVerifyYearOfPassing()
        .clickOnHighestEducationDropDownField()
        .selectHighestQualificaiton()
        .clickOnVerifyHighestEducationDropDownField()
        .selectVerifyHighestEducation()
        .enterMobileNumber("2345678")
        .enterEmail("vijay@gmail.com")
        ;
	}
}
