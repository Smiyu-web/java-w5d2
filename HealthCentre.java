package ca.java.group.projects;

import java.time.LocalDate;
import java.util.ArrayList;

public class HealthCentre {

	public static void main(String[] args) {
        ArrayList<Patient> patients = new ArrayList<Patient>();
		
		Patient p1 = new Patient("Marwan", "Pace", "111-123-4567", "marwan@gmail.com", LocalDate.of(1981, 1, 2), "m");
		Patient p2 = new Patient("Farrah", "Hook", "222-123-4567", "farrah@yahoo.ca", LocalDate.of(1985, 3, 21), "f");
		Patient p3 = new Patient("Clare", "Levine", "333-123-4567", "clairelevine@gmail.com", LocalDate.of(1990, 10, 2), "f");
		Patient p4 = new Patient("Rares", "Daniels", "444-123-4567", "danielsrares@yahoo.ca", LocalDate.of(1991, 3, 1), "f");
		Patient p5 = new Patient("Youssef", "Tapia", "555-123-4567", "tapis@outlook.com", LocalDate.of(1983, 11, 12), "m");
		Patient p6 = new Patient("Odin", "Mcculloch", "666-123-4567", "odin@yahoo.ca", LocalDate.of(1999, 5, 21), "f");
		Patient p7 = new Patient("Tabatha", "Cousins", "777-123-4567", "tabatha@outlook.com", LocalDate.of(1994, 7, 24), "m");
		Patient p8 = new Patient("Hamid", "Gilmore", "888-123-4567", "hamid@yahoo.ca", LocalDate.of(1997, 8, 31), "f");
		Patient p9 = new Patient("Emmie", "Edwards", "999-123-4567", "emmie@gmail.com", LocalDate.of(1997, 12, 5), "m");
		Patient p10 = new Patient("Tylor", "Johnston", "111-111-4567", "tylorjohnston@yahoo.ca", LocalDate.of(1999, 6, 11), "f");
		
		patients.add(p1);
		patients.add(p2);
		patients.add(p3);
		patients.add(p4);
		patients.add(p5);
		patients.add(p6);
		patients.add(p7);
		patients.add(p8);
		patients.add(p9);
		patients.add(p10);
	}

}
