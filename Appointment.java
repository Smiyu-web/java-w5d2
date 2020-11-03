package ca.java.group.projects;

import java.time.LocalDateTime;

public class Appointment {

	private Patient patients;
	private LocalDateTime appointmentDateTime;
	
	public Appointment(Patient patients, LocalDateTime appointmentDateTime) {
		
	}
	
	public Patient getPatients() {
		return patients;
	}
	
	public void setPatients(Patient patients) {
		this.patients = patients;
	}
	
	public LocalDateTime getAppointmentDateTime() {
		return appointmentDateTime;
	}
	
	public void setAppointmentDateTime(LocalDateTime appointmentDateTime) {
		this.appointmentDateTime = appointmentDateTime;
	}
	
	public String toString() {
		return "Appointment : " + appointmentDateTime + "\n" +
				"Patient : " + patients.toString() + "\n";
	}
}
