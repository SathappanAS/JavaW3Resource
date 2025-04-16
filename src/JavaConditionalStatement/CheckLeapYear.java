package JavaConditionalStatement;

import java.util.Scanner;
/*It is divisible by 4
AND
Not divisible by 100, 
OR
unless it is also divisible by 400.
*/
public class CheckLeapYear {

	public static void main(String[] args) {
	

		   Scanner in = new Scanner(System.in);
		    int year = in.nextInt();
		    
		    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
		        System.out.println(year + " is a leap year.");
		    } else {
		        System.out.println(year + " is not a leap year.");
		    }
	}

}
