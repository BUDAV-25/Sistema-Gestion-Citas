package Back_End.MedicalAppointment_Domain.Entities.medical;

import Back_End.MedicalAppointment_Domain.Base.BaseEntity;

public class Specialties extends BaseEntity{
	
	short SpecialtyID;
	String SpecialtyName;
	
	/// SpecialtyID
	public short getSpecialtyID() {
		return SpecialtyID;
	}
	public void setSpecialtyID(short specialtyID) {
		SpecialtyID = specialtyID;
	}
	
	/// SpecialtyName
	public String getSpecialtyName() {
		return SpecialtyName;
	}
	public void setSpecialtyName(String specialtyName) {
		SpecialtyName = specialtyName;
	}
	
}
