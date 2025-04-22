package JavaArrays;

import java.util.Arrays;
import java.util.HashSet;

/*	Write a Java program to find common elements between two arrays (string values) */
public class P14_FindCommonElementsBetweenTwoArrays {

	public static void main(String[] args) {

		// Declare and initialize two string arrays, array1 and array2.
		String[] array1 = { "Python", "JAVA", "PHP", "C#", "C++", "SQL" };
		String[] array2 = { "MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA" };

		// Print the original contents of array1 and array2.
		System.out.println("Array1 : " + Arrays.toString(array1));
		System.out.println("Array2 : " + Arrays.toString(array2));
		
		String[] array3=new String[array1.length];

//		HashSet<String> set = new HashSet<String>();

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i].equals(array2[j])) {
					array3[i]=array1[i];
//					  set.add(array1[i]);
				}
			}

		}
		System.out.println("Array3 : " + Arrays.toString(array3));
//		 System.out.println("Common element : " + (set));
	}

}
