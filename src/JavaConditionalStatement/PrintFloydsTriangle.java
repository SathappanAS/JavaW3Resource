package JavaConditionalStatement;
/*Write a Java program to print Floyd's Triangle.

Test Data
Input number of rows : 5
Expected Output :

Input number of rows :  5
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15*/
public class PrintFloydsTriangle {

	public static void main(String[] args) {
		int number=1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i >= j) {
					System.out.print(number + " ");
				       number++;
				}
			}
			System.out.println();
		}
	}
}