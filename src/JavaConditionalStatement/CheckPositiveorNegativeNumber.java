package JavaConditionalStatement;

import java.util.Scanner;

public class CheckPositiveorNegativeNumber {
/*
 * Write a Java program to get a number from the user and print whether it is positive or negative.

Test Data
Input number: 35
Expected Output :
Number is positive
*/
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input Number : ");
		int number = input.nextInt();
		
		if (number >=0) {
			System.out.println("Number is positive");
		}
		else {
			System.out.println("Number is negative");
		}
		
	}

}
