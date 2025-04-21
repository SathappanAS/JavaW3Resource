package JavaArrays;

import java.util.Arrays;

//Write a Java program to copy an array by iterating the array.
public class P8_CopyAnArrayByIteratingTheArray {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,35,45};
	
		System.out.println(Arrays.toString(a));
	
		int len=a.length;
		System.out.println(len);
		
		int b[]=new int[len];
		System.out.println(Arrays.toString(b));
		for(int i=0;i<len;i++) {
			b[i]=a[i];
		}
		System.out.println(Arrays.toString(b));
	}

}
