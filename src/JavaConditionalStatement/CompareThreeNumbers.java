package JavaConditionalStatement;

import java.util.Scanner;

/*Write a Java program that accepts three numbers and prints "All numbers are equal" if all three numbers are equal, "All numbers are different" if all three numbers are different and "Neither all are equal or different" otherwise.

Test Data
Input first number: 2564
Input second number: 3526
Input third number: 2456*/
public class CompareThreeNumbers {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Input first number: ");
		double x = in.nextDouble();
		System.out.print("Input first number: ");
		double y = in.nextDouble();
		System.out.print("Input first number: ");
		double z = in.nextDouble();

		if (x == y && x == z) {
			System.out.println("All numbers are equal");
		} else if ((x == y) || (x == z) || (z == y)) {
			System.out.println("Neither all are equal or different");
		} else {
			System.out.println("All numbers are different");
		}

	}

}