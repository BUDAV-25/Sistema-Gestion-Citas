package Back_End.MedicalAppointment_Domain.Entities.medical;

import Back_End.MedicalAppointment_Domain.Base.BaseEntity;

public class AvailabilityModes extends BaseEntity{
	
	private short SAvailabilityModeID;
	private String AvailabilityMode;
	
	/// SAvailabilityModeID
	public int getSAvailabilityModeID() {
		return SAvailabilityModeID;
	}
	public void setSAvailabilityModeID(short sAvailabilityModeID) {
		SAvailabilityModeID = sAvailabilityModeID;
	}
	
	/// AvailabilityMode
	public String getAvailabilityMode() {
		return AvailabilityMode;
	}
	public void setAvailabilityMode(String availabilityMode) {
		AvailabilityMode = availabilityMode;
	}
	
}
