package Back_End.MedicalAppointment_Domain.Base;

import java.time.LocalDateTime;

public class BaseEntity {
	
	private LocalDateTime CreatedAt;
	private LocalDateTime UpdatedAt;
	private boolean IsActive;
	
	/// CreatedAt
	public LocalDateTime getCreatedAt() {
		return CreatedAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		CreatedAt = createdAt;
	}
	
	/// UpdatedAt
	public LocalDateTime getUpdatedAt() {
		return UpdatedAt;
	}
	public void setUpdatedAt(LocalDateTime updatedAt) {
		UpdatedAt = updatedAt;
	}
	
	/// IsActive
	public boolean isIsActive() {
		return IsActive;
	}
	public void setIsActive(boolean isActive) {
		IsActive = isActive;
	}
	
}
