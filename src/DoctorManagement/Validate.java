/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoctorManagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hoan
 */
public class Validate {

    private static final Scanner in = new Scanner(System.in);

    //check user input number limit
    public static int checkInputIntLimit(int min, int max) {
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    //check user input string
    public static String checkInputString() {
        //loop until user input correct
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }

    //allow user input username
    public static String checkInputUsername() {
        System.out.print("Enter username: ");
        //loop until user input correct
        while (true) {
            String result = checkInputString();
            if (result.matches("^([\\w\\d]+){5,}$")) {
                return result;
            }
            System.err.println("You must enter least at 5 character, and no space!");
            System.out.print("Enter again: ");
        }
    }

    //allow user input password
    public static String checkInputPassword() {
        System.out.print("Enter password: ");
        //loop until user input correct
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[!\"#$%&'()*+,-./\\\\\\[\\]:;<=>?@^_`{|}~])(?=\\S+$).{8,}$";
        while (true) {
            String result = checkInputString();
            if (result.matches(regex)) {
                return result;
            }
            System.err.println("You must enter least at 8 character, no space and must contain at least 1 special character!");
            System.out.print("Enter again: ");
        }
    }
}

class TestValidate {

}
