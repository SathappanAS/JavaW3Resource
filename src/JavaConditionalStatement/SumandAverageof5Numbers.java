package JavaConditionalStatement;

import java.util.Scanner;

/*Write a program in Java to input 5 numbers from the keyboard and find their sum and average.

Test Data
Input the 5 numbers : 1 2 3 4 5
Expected Output :

Input the 5 numbers :                                                            
1                                                                                
2                                                                                
3                                                                                
4                                                                                
5                                                                                
The sum of 5 no is : 15                                                          
The Average is : 3.0 */
public class SumandAverageof5Numbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int avg=0;
		for(int i=1;i<=5;i++) {
			int number = input.nextInt();
			avg = avg+number;
		}
		System.out.println(avg);
		
		double avgnum = avg/5;
		System.out.println(avgnum);

	}

}
