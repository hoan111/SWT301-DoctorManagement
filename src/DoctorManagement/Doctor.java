/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoctorManagement;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Admin
 */
public class Doctor implements Comparator<Doctor> {
    private static final AtomicInteger count = new AtomicInteger(0); 
    private final int id;
    private String name;
    private Date dob;
    private String specialization;
    private int availability;
    private String email;
    private String mobile;

    public Doctor(String name, Date dob, String specialization, int availability, String email, String mobile) {
        id = count.incrementAndGet();
        this.name = name;
        this.dob = dob;
        this.specialization = specialization;
        this.availability = availability;
        this.email = email;
        this.mobile = mobile;
    }
    public Doctor() {
        id = count.incrementAndGet();
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
  
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
    
    @Override
    public int compare(Doctor d1, Doctor d2) {
        return d1.getDob().getYear() - d2.getDob().getYear();
    }
    @Override
    public String toString() {
        DateFormat f = new SimpleDateFormat("dd/MM/yyyy");

        return "Doctor {" + "id=" + id + ", name=" + name + ", dob=" + f.format(dob) + ", specialization=" + specialization + ", availability=" + availability + ", email=" + email + ", mobile=" + mobile + '}';
    }
}
