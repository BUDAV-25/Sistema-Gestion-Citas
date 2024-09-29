package Back_End.MedicalAppointment_Domain.Entities.Insurance;

import Back_End.MedicalAppointment_Domain.Base.BaseEntity;

public class InsuranceProviders extends BaseEntity{
	
	private int InsuranceProvider;
	private String Name;
	private String ContactNumber;
	private String Email;
	private String Website;
	private String Address;
	private String City;
	private String State;
	private String Country;
	private String ZipCode;
	private String CoverageDetails;
	private String LogoUrl;
	private boolean IsPreferred;
	private int NetworkTypeId;
	private String CustomerSupportContact;
	private String AcceptedRegion;
	private double MaxCoverageAmount;
	
	/// InsuranceProvide
	public int getInsuranceProvider() {
		return InsuranceProvider;
	}
	public void setInsuranceProvider(int insuranceProvider) {
		InsuranceProvider = insuranceProvider;
	}
	
	/// Name
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	/// ContactNumber
	public String getContactNumber() {
		return ContactNumber;
	}
	public void setContactNumber(String contactNumber) {
		ContactNumber = contactNumber;
	}
	
	/// Email
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	/// Website
	public String getWebsite() {
		return Website;
	}
	public void setWebsite(String website) {
		Website = website;
	}
	
	/// Address
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	/// City
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
	/// State
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	
	/// Country
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	
	/// ZipCode
	public String getZipCode() {
		return ZipCode;
	}
	public void setZipCode(String zipCode) {
		ZipCode = zipCode;
	}
	
	/// CoverageDetails
	public String getCoverageDetails() {
		return CoverageDetails;
	}
	public void setCoverageDetails(String coverageDetails) {
		CoverageDetails = coverageDetails;
	}
	
	/// LogoUrl
	public String getLogoUrl() {
		return LogoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		LogoUrl = logoUrl;
	}
	
	/// IsPreferred
	public boolean isIsPreferred() {
		return IsPreferred;
	}
	public void setIsPreferred(boolean isPreferred) {
		IsPreferred = isPreferred;
	}
	
	/// NetworkTypeId
	public int getNetworkTypeId() {
		return NetworkTypeId;
	}
	public void setNetworkTypeId(int networkTypeId) {
		NetworkTypeId = networkTypeId;
	}
	
	/// CustomerSupportContact
	public String getCustomerSupportContact() {
		return CustomerSupportContact;
	}
	public void setCustomerSupportContact(String customerSupportContact) {
		CustomerSupportContact = customerSupportContact;
	}
	
	/// AcceptedRegion
	public String getAcceptedRegion() {
		return AcceptedRegion;
	}
	public void setAcceptedRegion(String acceptedRegion) {
		AcceptedRegion = acceptedRegion;
	}
	
	/// MaxCoverageAmount
	public double getMaxCoverageAmount() {
		return MaxCoverageAmount;
	}
	public void setMaxCoverageAmount(double maxCoverageAmount) {
		MaxCoverageAmount = maxCoverageAmount;
	}
	
}
