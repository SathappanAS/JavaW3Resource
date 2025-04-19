package JavaConditionalStatement;

import java.util.Scanner;

public class factorial {
	/*
	 * Write a program to find the factorial value of any number entered through the
	 * keyboard
	 */
	// N! = 1*2*3.....N
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Input Number : ");
		int number = input.nextInt();
		int fac = 1;
		for (int i = 1; i <= number; i++) {
			fac = fac*i;
			
		}
		System.out.println(fac);

	}

}
