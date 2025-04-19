package JavaConditionalStatement;

import java.util.Scanner;

/*Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. 
 * For example, if the input is 12345, the output should be 54321*/
public class Digitsreversal {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int remainder =0;
		while(N!=0) {
			remainder=N%10;
			System.out.print(remainder);
			N=N/10;
		}

	}

}
