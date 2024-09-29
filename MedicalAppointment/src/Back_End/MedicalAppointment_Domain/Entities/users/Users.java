package Back_End.MedicalAppointment_Domain.Entities.users;

import Back_End.MedicalAppointment_Domain.Base.BaseEntity;

public class Users extends BaseEntity{
	
	int UserID;
	String FirstName;
	String LastName;
	String Email;
	String Password;
	int RoleID;
	
	///UserID
	public int getUserID() {
		return UserID;
	}
	public void setUserID(int userID) {
		UserID = userID;
	}
	
	/// FirstName
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	
	/// LastName
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	/// Email
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	/// Password
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	/// RoleID
	public int getRoleID() {
		return RoleID;
	}
	public void setRoleID(int roleID) {
		RoleID = roleID;
	}
}
