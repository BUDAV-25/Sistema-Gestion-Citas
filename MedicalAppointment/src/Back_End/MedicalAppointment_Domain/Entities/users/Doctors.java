package Back_End.MedicalAppointment_Domain.Entities.users;

import java.util.Date;

import Back_End.MedicalAppointment_Domain.Base.BaseEntity;

public class Doctors extends BaseEntity{
	
	int DoctorID;
	short SpecialtyID;
	String LicenseNumber;
	String PhoneNumber;
	int YearsOfExperience;
	String Education;
	String Bio;
	double ConsultationFee;
	String ClinicAddress;
	short AvailabilityModeId;
	Date LicenseExpirationDate;
	
	/// DoctorID
	public int getDoctorID() {
		return DoctorID;
	}
	public void setDoctorID(int doctorID) {
		DoctorID = doctorID;
	}
	
	/// SpecialtyID
	public short getSpecialtyID() {
		return SpecialtyID;
	}
	public void setSpecialtyID(short specialtyID) {
		SpecialtyID = specialtyID;
	}
	
	/// LicenseNumber
	public String getLicenseNumber() {
		return LicenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		LicenseNumber = licenseNumber;
	}
	
	/// PhoneNumber
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	
	/// YearsOfExperience
	public int getYearsOfExperience() {
		return YearsOfExperience;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		YearsOfExperience = yearsOfExperience;
	}
	
	/// Education
	public String getEducation() {
		return Education;
	}
	public void setEducation(String education) {
		Education = education;
	}
	
	/// Bio
	public String getBio() {
		return Bio;
	}
	public void setBio(String bio) {
		Bio = bio;
	}
	
	/// ConsultationFee
	public double getConsultationFee() {
		return ConsultationFee;
	}
	public void setConsultationFee(double consultationFee) {
		ConsultationFee = consultationFee;
	}
	
	/// ClinicAddress
	public String getClinicAddress() {
		return ClinicAddress;
	}
	public void setClinicAddress(String clinicAddress) {
		ClinicAddress = clinicAddress;
	}
	
	/// AvailabilityModeId
	public short getAvailabilityModeId() {
		return AvailabilityModeId;
	}
	public void setAvailabilityModeId(short availabilityModeId) {
		AvailabilityModeId = availabilityModeId;
	}
	
	/// LicenseExpirationDate
	public Date getLicenseExpirationDate() {
		return LicenseExpirationDate;
	}
	public void setLicenseExpirationDate(Date licenseExpirationDate) {
		LicenseExpirationDate = licenseExpirationDate;
	}
}
