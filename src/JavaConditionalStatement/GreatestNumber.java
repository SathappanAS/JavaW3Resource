package JavaConditionalStatement;

import java.util.Scanner;

/*Write a Java program that takes three numbers from the user and prints the greatest number.

Test Data
Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87
Expected Output :
The greatest: 87
*/

public class GreatestNumber {
	
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Input the 1st number: ");
		 int a = input.nextInt();
		 
		 System.out.println("Input the 2nd number: ");
		 int b = input.nextInt();
		 
		 System.out.println("Input the 3rd number: ");
		 int c = input.nextInt();

		 if(a>b && a>c) { // && short-circuit operators i
			 System.out.println("The greatest: " + a);
		 }
		 else if(b>c) {
			 System.out.println("The greatest: " + b);
		 }
		 else {
			 System.out.println("The greatest: " + c);
		 }
		 
		 
	}

}
