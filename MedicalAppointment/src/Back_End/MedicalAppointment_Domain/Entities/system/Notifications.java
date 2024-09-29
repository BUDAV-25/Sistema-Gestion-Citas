package Back_End.MedicalAppointment_Domain.Entities.system;

import java.time.LocalDateTime;

public class Notifications {
	
	int NotificationID;
	int UserID;
	String Message;
	LocalDateTime SentAt;
	
	/// NotificationID
	public int getNotificationID() {
		return NotificationID;
	}
	public void setNotificationID(int notificationID) {
		NotificationID = notificationID;
	}
	
	/// UserID
	public int getUserID() {
		return UserID;
	}
	public void setUserID(int userID) {
		UserID = userID;
	}
	
	/// Message
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	
	/// SentAt
	public LocalDateTime getSentAt() {
		return SentAt;
	}
	public void setSentAt(LocalDateTime sentAt) {
		SentAt = sentAt;
	}
	
}
