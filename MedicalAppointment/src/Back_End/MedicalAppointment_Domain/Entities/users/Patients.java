package Back_End.MedicalAppointment_Domain.Entities.users;

import java.util.Date;

import Back_End.MedicalAppointment_Domain.Base.BaseEntity;

public class Patients extends BaseEntity{
	
	int PatientID;
	Date DateOfBirth;
	char Gender;
	String PhoneNumber;
	String Address;
	String EmergencyContactName;
	String EmergencyContactPhone;
	String BloodType;
	String Allergies;
	int InsuranceProviderID;
	
	/// PatientID
	public int getPatientID() {
		return PatientID;
	}
	public void setPatientID(int patientID) {
		PatientID = patientID;
	}
	
	/// DateOfBirth
	public Date getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	
	/// Gender
	public char getGender() {
		return Gender;
	}
	public void setGender(char gender) {
		Gender = gender;
	}
	
	/// PhoneNumber
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	
	/// Address
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	/// EmergencyContactName
	public String getEmergencyContactName() {
		return EmergencyContactName;
	}
	public void setEmergencyContactName(String emergencyContactName) {
		EmergencyContactName = emergencyContactName;
	}
	
	/// EmergencyContactPhone
	public String getEmergencyContactPhone() {
		return EmergencyContactPhone;
	}
	public void setEmergencyContactPhone(String emergencyContactPhone) {
		EmergencyContactPhone = emergencyContactPhone;
	}
	
	/// BloodType
	public String getBloodType() {
		return BloodType;
	}
	public void setBloodType(String bloodType) {
		BloodType = bloodType;
	}
	
	/// Allergies
	public String getAllergies() {
		return Allergies;
	}
	public void setAllergies(String allergies) {
		Allergies = allergies;
	}
	
	/// InsuranceProviderID
	public int getInsuranceProviderID() {
		return InsuranceProviderID;
	}
	public void setInsuranceProviderID(int insuranceProviderID) {
		InsuranceProviderID = insuranceProviderID;
	}
}
