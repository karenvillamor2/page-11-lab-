/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime.number;

import java.util.Scanner;

/**
 *
 * @author Villamor_CPE
 */
public class multiplication {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an integer to generate its multiplication table: ");
            int number = scanner.nextInt();
            
            System.out.println("Multiplication Table for " + number + ":");
            
            // Use a for loop to iterate through numbers from 1 to 10
            for (int i = 1; i <= 10; i++) {
                int product = number * i;
                System.out.println(number + " x " + i + " = " + product);
            }
        }
    }
}
   
