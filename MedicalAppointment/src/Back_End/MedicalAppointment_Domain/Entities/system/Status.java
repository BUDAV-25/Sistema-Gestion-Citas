package Back_End.MedicalAppointment_Domain.Entities.system;

public class Status {
	
	int StatusID;
	String StatusName;
	
	/// StatusID
	public int getStatusID() {
		return StatusID;
	}
	public void setStatusID(int statusID) {
		StatusID = statusID;
	}
	
	/// StatusName
	public String getStatusName() {
		return StatusName;
	}
	public void setStatusName(String statusName) {
		StatusName = statusName;
	}
	
}
