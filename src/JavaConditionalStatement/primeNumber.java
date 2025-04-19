package JavaConditionalStatement;

import java.util.Scanner;

/*Prime numbers are natural numbers that are divisible by only 1 and the number itself*/
//2, 3, 5, 7, 11, 13
public class primeNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		boolean flagIsPrime=true;
		
		for(int i=2;i<=((N/2)-1);i++) {
			if(N%i==0) {
				flagIsPrime=false;
				break;}}
		
		if(flagIsPrime) {
			System.out.println(N+ " is a prime number");
		}
		else {
			System.out.println(N+ " is a not prime number");
		}

	}

}
