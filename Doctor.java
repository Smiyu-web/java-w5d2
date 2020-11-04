package ca.java.group.projects;

import java.util.ArrayList;
import java.util.regex.Pattern;



public class Doctor {
	private int doctorId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private String specialty;
	
	private ArrayList<Appointment> appointments;
	
	public Doctor(String firstName, String lastName, String phoneNumber, String email, String specialty) {
		super();
		setDoctorID();
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNumber(phoneNumber);
		setEmail(email);
		setSpecialty(specialty);
		this.appointments = new ArrayList<Appointment>();
	}

	public void addAppoitment(Appointment a) {
		this.appointments.add(a);
	}
	
	//getters
	public int getDoctorId() {
		return doctorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getEmail() {
		return email;
	}
	public String getSpecialty() {
		return specialty;
	}
	public ArrayList<Appointment> getAppointments() {
		return appointments;
	}
	
	
	//setters
	public void setDoctorID() {
		int randomtNumber = (int)((Math.random() * 99001) + 1000);
		this.doctorId = randomtNumber;
	}
	public void setFirstName(String firstName) {
		if (!firstName.isEmpty() && !firstName.equalsIgnoreCase(null)) {
			this.firstName = firstName;
		} else {
			this.firstName = "Unknown";
		}
	}
	public void setLastName(String lastName) {
		if (!lastName.isEmpty() && !lastName.equalsIgnoreCase(null)) {
			this.lastName = lastName;
		} else {
			this.lastName = "Unknown";
		}
	}
	public void setPhoneNumber(String phoneNumber) {
		String pattern = "^\\d{3}-\\d{3}-\\d{4}$";
		Pattern p = Pattern.compile(pattern);
		
		if (!phoneNumber.isEmpty() && !phoneNumber.equalsIgnoreCase(null)) {
			
			if (p.matcher(phoneNumber).find()) {
				this.phoneNumber = phoneNumber;
			} else {
				this.phoneNumber = "Invalid phone number";
			}
		} else {
			this.phoneNumber = "Unknown";
		}
	}
	public void setEmail(String email) {
		String pattern = "^([a-zA-Z0-9])+([a-zA-Z0-9\\._-])*@([a-zA-Z0-9_-])+([a-zA-Z0-9\\._-]+)+$";
	    Pattern p = Pattern.compile(pattern);
	    
	    if (!email.isEmpty() && !email.equalsIgnoreCase(null)) {
	    	
	    	if (p.matcher(email).find()) {
	    		this.email = email;
	    	} else {
	    		this.email = "Invalid email";
	    	}
		} else {
			this.email = "Unknown";
		}
	}
	public void setSpecialty(String specialty) {
		if (!specialty.isEmpty() && !specialty.equalsIgnoreCase(null)) {
			this.specialty = specialty;
		} else {
			this.specialty = "Unknown";
		}
	}
	
	
	@Override
	public String toString() {
		return "Doctor ID : " + doctorId + "\n" +
	            "Name : " + firstName + " " + lastName + "\n" +
				"Phone Number : " + phoneNumber + "\n" +
	            "Email : " + email + "\n" +
				"Specialty : " + specialty + "\n";
	}
}
