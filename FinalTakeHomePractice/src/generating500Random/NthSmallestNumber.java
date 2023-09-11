package generating500Random;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NthSmallestNumber {

	public static void main(String[] args) {
		 // Create an array to store 500 random numbGenerate 500 random numbers and print the nth smallest number in Java.ers
        int[] numbers = new int[500];

        // Generate random numbers and fill the array
        Random random = new Random();
        for (int i = 0; i < 500; i++) {
            numbers[i] = random.nextInt(1000); // Change 1000 to the desired range of random numbers
        }

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Ask the user for the value of "n"
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n (1 to 500): ");
        int n = scanner.nextInt();

        // Check if the user input is valid
        if (n < 1 || n > 500) {
            System.out.println("Invalid input. Please enter a value between 1 and 500.");
        } else {
            // Print the nth smallest number
            int nthSmallest = numbers[n - 1];
            System.out.println("The " + n + "th smallest number is: " + nthSmallest);
        }

        scanner.close();
    }	

	

}
