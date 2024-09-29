package Back_End.MedicalAppointment_Domain.Entities.appointments;

import java.time.LocalTime;
import java.util.Date;

public class DoctorAvailability {
	
	private int AvailabilityID;
	private int DoctorID;
	private Date AvailableDate;
	private LocalTime StartTime;
	private LocalTime EndTime;
	
	/// AvailabilityID
	public int getAvailabilityID() {
		return AvailabilityID;
	}
	public void setAvailabilityID(int availabilityID) {
		AvailabilityID = availabilityID;
	}
	
	/// DoctorID
	public int getDoctorID() {
		return DoctorID;
	}
	public void setDoctorID(int doctorID) {
		DoctorID = doctorID;
	}
	
	/// AvailableDate
	public Date getAvailableDate() {
		return AvailableDate;
	}
	public void setAvailableDate(Date availableDate) {
		AvailableDate = availableDate;
	}
	
	/// StartTime
	public LocalTime getStartTime() {
		return StartTime;
	}
	public void setStartTime(LocalTime startTime) {
		StartTime = startTime;
	}
	
	/// EndTime
	public LocalTime getEndTime() {
		return EndTime;
	}
	public void setEndTime(LocalTime endTime) {
		EndTime = endTime;
	}
		
}
