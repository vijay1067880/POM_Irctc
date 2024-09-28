package pom.formc.pages;



import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers {

	public RegistrationPage enterUserName(String username) {
		enterByXpath("//*[@name='u_id']", username);
		return this;
	}
	public RegistrationPage enterPassword(String pwd) {
		enterByXpath("//*[@name='u_pwd']", pwd);
		return this;
		}
	public RegistrationPage enterConfirmPassword(String cnfpwd) {
		enterByXpath("//*[@name='u_repwd']", cnfpwd);
		return this;
	}
	public RegistrationPage selectSecurityQuestion(int quesindex) {
		selectIndexByXpath("//*[@name='u_secques']", quesindex);
		return this;
	}
	public RegistrationPage selectSecurityAnswer(String secans) {
		enterByXpath("//*[@name='u_secans']", secans);
		return this;
	}
	public RegistrationPage enterName(String name) {
		enterByXpath("//*[@name='u_name']", name);
		return this;
	}
	public RegistrationPage selectGender(String gender) {
		selectVisibleTextByXpath("//*[@name='u_gender']", gender);
		return this;
	}
	public RegistrationPage enterDateOfBirth(String dob) {
		enterByXpath("//*[@name='u_dob']", dob);
		return this;
	}
	public RegistrationPage enterDesignation(String designation) {
		enterByXpath("//*[@name='u_designation']", designation);
		return this;
	}
	public RegistrationPage enterEmail(String email) {
		enterByXpath("//*[@name='u_emailid']", email);
		return this;
	}
	public RegistrationPage enterMobile(String mobilenum) {
		enterByXpath("//*[@name='u_mobile']", mobilenum);
		return this;
	}
	public RegistrationPage enterPhoneNumber(String phnnum) {
		enterByXpath("//*[@name='u_phone']", phnnum);
		return this;
	}
	public RegistrationPage enterNameHotelDetails(String name) {
		enterByXpath("//*[@name='name']", name);
		return this;
	}
	public RegistrationPage enterCapacityHotelDetails(String capacity) {
		enterByXpath("//*[@name='capacity']", capacity);
		return this;
	}
	public RegistrationPage enterAddressHotelDetails(String address) {
		enterByXpath("//*[@name='address']", address);
		return this;
	}
	public RegistrationPage selectState(String state) {
		selectVisibleTextByXpath("//*[@name='state']", state);
		return this;
	}
	public RegistrationPage selectCityOrDistrict(String cityordist) {
	selectVisibleTextByXpath("//*[@name='city_distr']", cityordist);//details sec
	return this;
}
	public RegistrationPage selectFrroDescription(String frrodes) {
		selectVisibleTextByXpath("//*[@name='frrodata']", frrodes);
		return this;
	}
	public RegistrationPage selectAccomodationType(String accotype) {
		selectVisibleTextByXpath("//*[@name='acco_type']", accotype);
		return this;
	}
	public RegistrationPage selectAccommodationGrade(String accograde) {
		selectVisibleTextByXpath("//*[@name='star_rat']", accograde);
		return this;
	}
	public RegistrationPage enterEmailHotelDetails(String email) {
		enterByXpath("//*[@name='email']", email);
		return this;
	}
	public RegistrationPage enterMobileHotelDetails(String mblhotel) {
		enterByXpath("//*[@name='mcontact']", mblhotel);
		return this;
	}
	public RegistrationPage enterPhoneHotel(String phnhotel) {
		enterByXpath("//*[@name='contact']", phnhotel);
		return this;
	}
	//pass1
	public RegistrationPage enterNameOwnerDetails(String name) {
		enterByXpath("//*[@name='name_o']", name);
		return this;
	}
	public RegistrationPage enterAddressOwnerDetails(String address) {
		enterByXpath("//*[@name='address_o']", address);
		return this;
	}
	public RegistrationPage selectOwnerState(String owrstate) {
		selectVisibleTextByXpath("//*[@name='state_o']", owrstate);
		return this;
	}
	public RegistrationPage selectOwnerDist(String owrdist) {
		selectVisibleTextByXpath("//*[@id='citydistr_o']", owrdist); 
		return this;
	}
	public RegistrationPage enterEmailOwnerDetails(String emailowr) {
		enterByXpath("//*[@name='emailid_o']", emailowr); 
		return this;
	}
	public RegistrationPage enterPhoneOwnerDetails(String owrphn) {
		enterByXpath("//*[@name='phoneno_o']", owrphn);
		return this;
	}
	public RegistrationPage enterMobileOwnerDetails(String owrmbl) {
		enterByXpath("//*[@name='mobile_o']", owrmbl);
		return this;
	}
	public RegistrationPage clickOnAddButton() {
		clickByXpath("//*[@value='Add']");
		return this;
	}
	//2ndpass	
	public RegistrationPage enterSecondPassengerName(String name2) {
		enterByXpath("//*[@name='name_o']", name2);
		return this;
	}
	public RegistrationPage enterSecondPassengerAddress(String adresspass2){
		enterByXpath("//*[@name='address_o']", adresspass2);
		return this;
	}
	public RegistrationPage selectSecondPassengerState(String addresspass2) {
		selectVisibleTextByXpath("//*[@name='state_o']", addresspass2);
		return this;
	}
	public RegistrationPage selectSecondPassengerCity(String ctiypass2) {
		selectVisibleTextByXpath("//*[@id='citydistr_o']", ctiypass2);
		return this;
	}
	public RegistrationPage enterSecondPassengerEmail(String emailpass2) {
		enterByXpath("//*[@name='emailid_o']", emailpass2);
		return this;
	}
	public RegistrationPage enterSecondPassengerPhone(String phonepass2) {
		enterByXpath("//*[@name='phoneno_o']", phonepass2);
		return this;
	}
	public RegistrationPage enterSecondPassengerMobile(String mobilepass2) {
		enterByXpath("//*[@name='mobile_o']", mobilepass2);
		return this;
	}
	public RegistrationPage clickOnAddToAddThirdPassenger() {
		clickByXpath("//*[@value='Add']");
		return this;
	}
	public RegistrationPage enterThirdPassengerName(String passname3) {
		enterByXpath("//*[@name='name_o']", passname3);
		return this;
	}
	public RegistrationPage enterThirdPassengerAdress(String passaddrees3) {
		enterByXpath("//*[@name='address_o']", passaddrees3);
		return this;
	}
	public RegistrationPage selectThirdPassengerState(String passstate3) {
		selectVisibleTextByXpath("//*[@name='state_o']", passstate3);
		return this;
	}
	public RegistrationPage selectThirdPassengerCity(String passcity3){
		selectVisibleTextByXpath("//*[@id='citydistr_o']", passcity3);
		return this;
	}
	public RegistrationPage enterThirdPassengerEmail(String passemail3) {
		enterByXpath("//*[@name='emailid_o']", passemail3);
		return this;
	}
	public RegistrationPage enterThirdPassengerPhone(String phonepass3) {
		enterByXpath("//*[@name='phoneno_o']", phonepass3);
		return this;
	}
	public RegistrationPage enterThirdPassengerMobile(String passmobile3) {
		enterByXpath("//*[@name='mobile_o']", passmobile3);
		return this;
	}
	

}
	
