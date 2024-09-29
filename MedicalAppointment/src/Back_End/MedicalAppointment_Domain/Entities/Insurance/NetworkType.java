package Back_End.MedicalAppointment_Domain.Entities.Insurance;

import Back_End.MedicalAppointment_Domain.Base.BaseEntity;

public class NetworkType extends BaseEntity{
	
	private int NetworkTypeId;
	private String Name;
	private String Description;
	
	/// NetworkTypeId
	public int getNetworkTypeId() {
		return NetworkTypeId;
	}
	public void setNetworkTypeId(int networkTypeId) {
		NetworkTypeId = networkTypeId;
	}
	
	/// Name
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	/// Description
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
}
