/**
 * Name: David Phan
 *
 * Project/Class Description:
 * This program will ask the user to input an ip address.
 * Then it will replace the "." with "[]".
 *
 * Known bugs: None
 *
 */

import java.util.Scanner;

// This is the class of the program named Replace
public class Replace {

        // This is the main  method where it will use a scanner to store
        // the IP address into a string variable.
        public static void main(String[]args){

            // This is the scanner where it will read the input of the keyboard
            Scanner keyboard = new Scanner(System.in);

            // This is the print statement asking the user to input an ip address.
            System.out.println("Please enter an IP address number:");

            // The input will be stored into this String variable called theNumber
            String theNumber = keyboard.nextLine();

            // Then this print statement will call the method defang.
            System.out.println(defang(theNumber));
        }


        // This is the defang method where it will replace the "." with a "[]".
        public static String defang(String address) {

            // This will return the address which calls the replace method
            // which will replace a specific character with another.
            return address.replace("." , "[.]");
        }
}
