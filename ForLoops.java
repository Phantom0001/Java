/**
 * Name: David Phan
 *
 * Project/Class Description:
 * This program will ask the user to input a integer
 * that they want to be multiplied.
 *
 * Then it will ask the user how many times it should be
 * multiplied.
 *
 * Known bugs: None
 */
import java.util.*;

public class ForLoops {

    // This is the scanner, it will view what the user inputs.
    private static final Scanner scanner = new Scanner(System.in);

    // This is the main method, it will ask the user to input a integer.
    // Then that integer will go through a loop.
    // Where the user enters how many times it should be multiplied.
    public static void main(String[] args) {

        // This print method asks the user to enter the integer.
        System.out.println("Enter an integer to be multiplied: ");

        // This will save that integer in the number variable.
        int number = scanner.nextInt();

        // This print method will ask the user to enter the loop integer.
        System.out.println("Enter the number of times it should be multiplied: ");

        // Then it will be stored into the multiplier variable.
        int multiplier = scanner.nextInt();

        // This will make sure it will skip unwanted characters.
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // This loop method will use the multiplier the user entered
        // And then multiply with the integer entered.
        for(int i = 1; i <= multiplier; i++){

            // Then it will print out the value.
            System.out.println(number + " x " + i + " = " + number * i);

        }
        scanner.close();
    }
}