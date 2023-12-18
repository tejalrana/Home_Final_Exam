package one;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NthSmallestNumber {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get user input for N
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        // Generate an array of 500 random numbers
        int[] randomNumbers = generateRandomNumbers(500);

        // Find the Nth smallest number
        int nthSmallest = findNthSmallest(randomNumbers, N);

        // Print the result
        System.out.println("The " + N + "th smallest number is: " + nthSmallest);

        // Close the Scanner to avoid resource leak
        scanner.close();
    }

    // Function to generate an array of random numbers
    private static int[] generateRandomNumbers(int count) {
        Random random = new Random();
        int[] randomNumbers = new int[count];

        for (int i = 0; i < count; i++) {
            randomNumbers[i] = random.nextInt(500); 
            System.out.println(""+randomNumbers[i]);
        }

        return randomNumbers;
    }

    // Function to find the Nth smallest number in an array
    private static int findNthSmallest(int[] arr, int N) {
        // Sort the array
        Arrays.sort(arr);

        // Return the Nth element
        return arr[N - 1];
    }
}
