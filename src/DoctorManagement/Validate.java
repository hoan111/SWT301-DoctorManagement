/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoctorManagement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    
    public static Date checkInputDate() throws ParseException
    {
        while(true)
        {
            String input = checkInputString();
            try
            {
               Date dob = new SimpleDateFormat("dd/MM/yyyy").parse(input); 
               return dob;
            }
            catch(ParseException e)
            {
                System.err.println("Invalid date!");
                System.out.println("Enter again (dd/MM/yyyy): ");
            }
        }
    }
    
    public static String checkInputByRegex(String regex, String err)
    {
        while(true)
        {
            String input = checkInputString();
            if(input.matches(regex))
            {
                return input;
            }
            System.err.println(err);
            System.out.println("Enter again: ");
        }
    }
}
