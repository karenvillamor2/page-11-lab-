/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package febonacci;

import java.util.Scanner;

/**
 *
 * @author Villamor_CPE
 */
public class Febonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of Fibonacci numbers to generate: ");
            int n = scanner.nextInt();
            
            if (n <= 0) {
                System.out.println("Please enter a positive integer.");
            } else {
                printFibonacciSequence(n);
            }
        }
    }

    private static void printFibonacciSequence(int n) {
        int first = 0;
        int second = 1;
        int count = 2; // Already have the first two numbers (0 and 1)

        System.out.println("Fibonacci Sequence:");

        // Print the first two numbers
        System.out.print(first + ", " + second);

        // Generate and print the rest of the sequence
        while (count < n) {
            int next = first + second;
            System.out.print(", " + next);

            // Update values for the next iteration
            first = second;
            second = next;
            count++;
        }

        System.out.println(); // Move to the next line after printing the sequence
    }
} 
    
