/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoctorManagement;

import java.io.IOException;
import java.text.ParseException;

/**
 *
 * @author hoan
 */
public class Main {

    public static void main(String[] args) throws ParseException, IOException {
        Manage m = new Manage();
        while (true) {
            int choice = m.menu();
            switch (choice) {
                case 1:
                    m.addDoctor();
                    break;
                case 2:
                    m.editDoctor();
                    break;
                case 3:
                    m.deleteDoctor();
                    break;
                case 4:
                    m.searchDoctorByID();
                    break;
                case 5:
                    m.searchDoctorByName();
                    break;
                case 6:
                    m.sortDoctorByDOB();
                    break;
                case 7:
                    m.viewDoctors();
                    break;
                case 8:
                    m.addTestData();
                    break;
                case 0:
                    return;
            }
        }
    }
}
