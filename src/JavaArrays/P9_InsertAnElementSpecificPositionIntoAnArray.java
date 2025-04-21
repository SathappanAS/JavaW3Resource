package JavaArrays;

import java.util.Arrays;

public class P9_InsertAnElementSpecificPositionIntoAnArray {
/*Write a Java program to insert an element (specific position) into an array.*/
	public static void main(String[] args) {
		
		//[25,14,56,15,36]
		//[25,14,35,56,15]
		
		int a[]= {25,14,56,15,36};
		
		int len=a.length-1;
		System.out.println(len);
		
		int index_position = 2;
		int value = 35;
		
		for(int i=len;i>index_position;i--) {
			a[i] = a[i - 1];
		}
		  a[index_position] = value;
		System.out.println(Arrays.toString(a));

	}

}
