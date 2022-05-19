/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoctorManagement;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class Manage {

    ArrayList<Doctor> doctors = new ArrayList<>();

    //display menu
    public int menu() throws IOException, ParseException {
        System.out.println("1. Add a doctor.");
        System.out.println("2. Edit a doctor");
        System.out.println("3. Delete a doctor.");
        System.out.println("4. Search doctor by ID.");
        System.out.println("5. Search doctor by Name.");
        System.out.println("6. Sort doctor by DateOfBirth.");
        System.out.println("7. View all doctors.");
        System.out.println("8. Add test data.");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        int choice = Validate.checkInputIntLimit(0, 8);
        return choice;
    }

    public void addDoctor() throws ParseException {
        System.out.println("Enter doctor name: ");
        String name = Validate.checkInputString();

        System.out.println("Enter dob");
        Date dob = new SimpleDateFormat("dd/MM/yyyy").parse(Validate.checkInputString());

        System.out.println("Enter spec: ");
        String spec = Validate.checkInputString();

        System.out.println("Enter availability: ");
        int availability = Validate.checkInputIntLimit(0, 4);

        System.out.println("Enter email: ");
        String email = Validate.checkInputString();

        System.out.println("Enter mobile: ");
        String mobile = Validate.checkInputString();

        Doctor d = new Doctor(name, dob, spec, availability, email, mobile);
        doctors.add(d);
    }

    public void editDoctor() throws ParseException {
        System.out.println("Enter ID doctor you want to edit: ");
        int id = Validate.checkInputIntLimit(0, Integer.MAX_VALUE);

        System.out.println("Enter doctor name: ");
        String name = Validate.checkInputString();

        System.out.println("Enter dob");
        Date dob = new SimpleDateFormat("dd/MM/yyyy").parse(Validate.checkInputString());

        System.out.println("Enter spec: ");
        String spec = Validate.checkInputString();

        System.out.println("Enter availability: ");
        int availability = Validate.checkInputIntLimit(0, 4);

        System.out.println("Enter email: ");
        String email = Validate.checkInputString();

        System.out.println("Enter mobile: ");
        String mobile = Validate.checkInputString();

        Doctor d = new Doctor(name, dob, spec, availability, email, mobile);
        doctors.set(id - 1, d);
        System.out.println("Doctor edited successfully");
    }

    public void deleteDoctor() {
        System.out.println("Enter doctor ID you want to delete: ");
        int id = Validate.checkInputIntLimit(0, Integer.MAX_VALUE);
        doctors.remove(id - 1);
        System.out.println("Doctor deleted successfully");
    }

    public void searchDoctorByID() {
        System.out.println("Enter doctor ID you want to search: ");
        int id = Validate.checkInputIntLimit(0, Integer.MAX_VALUE);
        doctors.forEach((d) -> {
            if (d.getId() == id) {
                System.out.println(d.toString());
            }
        });
    }

    public void searchDoctorByName() {
        System.out.println("Enter doctor name you want to search: ");
        String name = Validate.checkInputString();
        doctors.forEach((d) -> {
            if (d.getName().contains(name)) {
                System.out.println(d.toString());
            }
        });
    }
    
    public void sortDoctorByDOB()
    {
        ArrayList<Doctor> newList = this.doctors;
        Collections.sort(newList, new Doctor());
        newList.forEach(e->System.out.println(e));
    }
    
    public void addTestData() throws ParseException {
        doctors.add(new Doctor("hoan1", new SimpleDateFormat("dd/MM/yyyy").parse("15/05/2001"), "Spec1", 1, "hoan1@", "089"));
        doctors.add(new Doctor("hoan2", new SimpleDateFormat("dd/MM/yyyy").parse("15/05/2002"), "Spec2", 1, "hoan2@", "0894444"));
        doctors.add(new Doctor("hoan2", new SimpleDateFormat("dd/MM/yyyy").parse("15/05/2007"), "Spec2", 1, "hoan2@", "0894444"));
        doctors.add(new Doctor("hoan2", new SimpleDateFormat("dd/MM/yyyy").parse("15/05/2004"), "Spec2", 1, "hoan2@", "0894444"));
    }
    public void viewDoctors() {
        doctors.forEach((d) -> {
            System.out.println(d.toString());
        });
    }
}
