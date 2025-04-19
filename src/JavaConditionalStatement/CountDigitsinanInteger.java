package JavaConditionalStatement;

import java.util.Scanner;

/*Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has.

Test Data
Input an integer number less than ten billion: 125
Expected Output :

Number of digits in the number: 6*/
public class CountDigitsinanInteger {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int number = input.nextInt();

		int sum = 0;

		int rem = number % 10;
		int quo = number / 10;
//		System.out.println(rem); //3
//		System.out.println(quo); // 125

		int rem1 = quo % 10;
		int quo1 = quo / 10;
//		System.out.println(rem1); //3
//		System.out.println(quo1); // 12

		int rem2 = quo1 % 10;
		// System.out.println(rem2);

		sum = rem + rem1 + rem2;
		System.out.println(sum);
	}

}
