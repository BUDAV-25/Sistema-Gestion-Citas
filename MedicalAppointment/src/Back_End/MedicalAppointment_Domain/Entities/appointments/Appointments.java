package Back_End.MedicalAppointment_Domain.Entities.appointments;

import java.util.Date;

import Back_End.MedicalAppointment_Domain.Base.BaseEntity;

public class Appointments extends BaseEntity{
	
	private int AppointmentsID;
	private int PatientID;
	private int DoctorID;
	private Date AppointmentsDate;
	private int StatusID;
	
	/// AppointmentsID
	public int getAppointmentsID() {
		return AppointmentsID;
	}
	public void setAppointmentsID(int appointmentsID) {
		AppointmentsID = appointmentsID;
	}
	
	/// PatientID
	public int getPatientID() {
		return PatientID;
	}
	public void setPatientID(int patientID) {
		PatientID = patientID;
	}
	
	/// DoctorID
	public int getDoctorID() {
		return DoctorID;
	}
	public void setDoctorID(int doctorID) {
		DoctorID = doctorID;
	}
	
	/// AppointmentsDate
	public Date getAppointmentsDate() {
		return AppointmentsDate;
	}
	public void setAppointmentsDate(Date appointmentsDate) {
		AppointmentsDate = appointmentsDate;
	}
	
	/// StatusID
	public int getStatusID() {
		return StatusID;
	}
	public void setStatusID(int statusID) {
		StatusID = statusID;
	}
}
