/**
 * Name: David Phan
 *
 * Project/Class Description:
 * This program will ask the user to input a integer
 * that will go through separate conditions.
 * If it is odd then it will be weird.
 * If it is even and between 2 and 5 then it is not weird.
 * If it is even and between 6 and 20 then it is weird.
 * If it is even and it is greater than 20 then it is not weird.
 * *
 * Known bugs: None
 */

import java.util.*;
public class WeirdConditions {

    // This is the global scanner used in the main method.
    private static final Scanner scanner = new Scanner(System.in);

    // This method will go through different if statements
    // and will print out an answer if the integer is weird or not.
    public static void main(String[] args) {

        // This will ask the user to enter an integer.
        System.out.println("Enter a number: ");

        // This will store the integer into the variable number.
        int number = scanner.nextInt();

        // This will skip specific unwanted characters.
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // This if statement will check if it is greater than 20 and if it is even.
        if(number > 20 && number % 2 == 0){
            // Then it will print "Not Weird"
            System.out.println("Not Weird");
        }

        // This else if statement will check if it is even and between 2 and 5.
        else if(number >= 2 && number <= 5 && number % 2 == 0){
            // Then it will print "Not Weird"
            System.out.println("Not Weird");
        }

        // This else if statement will check if it is even and between 6 and 20.
        else if(number >= 6 && number <= 20 && number % 2 == 0){
            // Then it will print "Weird"
            System.out.println("Weird");
        }

        // This else statement will check if it is odd.
        else{
            // Then it will print "Weird"
            System.out.println("Weird");
        }

        scanner.close();
    }
}
