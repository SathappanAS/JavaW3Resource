package JavaArrays;

import java.util.Arrays;

//Write a Java program to remove a specific element from an array.
public class P7_RemoveASpecificElementFromAnArray {

	public static int removeElement(int my_array[],int num) {
		
		int len=my_array.length;
		
		for(int i=0;i<len;i++) {
			if (my_array[i]==num) {
				my_array[i]=my_array[i+1];	
				break;
			}
		}
		 System.out.println("After removing the  element: " + Arrays.toString(my_array));
		
		return 0;
	}
	
	public static void main(String[] args) {
		int my_array[]= {25,14,56,15,36};
		
		
		P7_RemoveASpecificElementFromAnArray.removeElement(my_array,14);

	}

}
