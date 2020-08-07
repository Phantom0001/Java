
/**
 * Name: David Phan
 *
 * Project/Class Description:
 * This program will let the user input an array of numbers.
 * The first output will ask the user how many numbers they want to add
 * into the array.
 * The second output will ask the user to enter those number of digits.
 * Then the array will be sent into a for loop and stored into an array variable.
 * The array will be then sent into a for loop where it will check if it is an even or
 * an odd number.
 * The while loop will check if the number is not zero.
 * Then it will divide the number until it reaches zero.
 * It will then be counted in the count variable where it will be sent into the if
 * else statement.
 * The if statement will check if it is even and the else will check if it is odd.
 *
 * Known bugs: None
 */

import java.util.Scanner;

// This is the class of the program where it will run the main method.
public class ArrayChecker {

    // This main method will run the program checking if numbers in the array is even or odd.
    public static void main(String[]args){

        // This variable will count the amount of times the number is even.
        int evenCount = 0;

        // This is the scanner of the program.
        Scanner keyboard = new Scanner(System.in);

        // This is the print statement which will ask the user how many numbers they want to add into
        // the array.
        System.out.println("How many numbers do you want to input?");

        // This variable will store the input from the user.
        int number = keyboard.nextInt();

        // This array variable will set how big the array is.
        int theArray[] = new int[number];

        // This print statement will ask the user to input the digits.
        System.out.println("Enter the " + number + " digits now");

        // This for loop will read the integer entered by the user and stored into
        // the array variable.
        for(int i = 0; i < theArray.length; i++){

            // This will store the integer into the index of the array.
            theArray[i] = keyboard.nextInt();

        }

        // This for loop will run through the length of the array.
        for(int i = 0; i < theArray.length; i++){

            // This is the counter variable that will store the divided numbers from the array.
            int count = 0;

            // This will loop will keep checking until the number inside the index becomes zero.
            while(theArray[i] != 0){

                // This will divide the array index by zero.
                theArray[i] /= 10;
                // This will count how many times it has been divided by 10.
                ++count;

            }

            // This if statement will check if the count is even.
            if(count % 2 == 0){

                // If it is even then it will increment the evenCount variable.
                evenCount++;

            }

            // This else statement will run if the count is odd.
            else{

                // This will print out telling the user that it is odd.
                System.out.println("This contains odd numbers");
            }

        }

        // This will print out how many times the numbers in the array were even.
        System.out.println(evenCount);

    }

}
