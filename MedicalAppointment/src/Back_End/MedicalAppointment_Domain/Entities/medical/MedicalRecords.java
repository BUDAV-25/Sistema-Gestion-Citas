package Back_End.MedicalAppointment_Domain.Entities.medical;

import java.time.LocalDateTime;

import Back_End.MedicalAppointment_Domain.Base.BaseEntity;

public class MedicalRecords extends BaseEntity{
	
	private int RecordID;
	private int PatientID;
	private int DoctorID;
	private String Diagnosis;
	private String Treatment;
	private LocalDateTime DateOfVisit;
	
	/// RecordID
	public int getRecordID() {
		return RecordID;
	}
	public void setRecordID(int recordID) {
		RecordID = recordID;
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
	
	/// Diagnosis
	public String getDiagnosis() {
		return Diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		Diagnosis = diagnosis;
	}
	
	/// Treatment
	public String getTreatment() {
		return Treatment;
	}
	public void setTreatment(String treatment) {
		Treatment = treatment;
	}
	
	/// DateOfVisit
	public LocalDateTime getDateOfVisit() {
		return DateOfVisit;
	}
	public void setDateOfVisit(LocalDateTime dateOfVisit) {
		DateOfVisit = dateOfVisit;
	}
}
