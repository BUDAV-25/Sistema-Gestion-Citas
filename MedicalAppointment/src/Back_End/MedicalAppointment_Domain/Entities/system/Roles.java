package Back_End.MedicalAppointment_Domain.Entities.system;

import Back_End.MedicalAppointment_Domain.Base.BaseEntity;

public class Roles extends BaseEntity{
	
	int RolesID;
	String RolesName;
	
	/// RolesID
	public int getRolesID() {
		return RolesID;
	}
	public void setRolesID(int rolesID) {
		RolesID = rolesID;
	}
	
	/// RolesName
	public String getRolesName() {
		return RolesName;
	}
	public void setRolesName(String rolesName) {
		RolesName = rolesName;
	}
}
