package JavaArrays;

import java.util.Arrays;

/*Write a Java program to remove duplicate elements from an array.*/
public class P16_RemoveDuplicateElementsFromAnArray {

	public static void main(String[] args) {

		int a[] = { 10, 20, 45, 10 , 55};

		int len = a.length;
		System.out.println(len);
		System.out.println("li of an array = + " + a[0]);
		System.out.println("li of an array = + " + a[len - 1]);

		for (int i = 0; i < len; i++) {
			for(int j=1;j<len;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[j]);
				}
			}

		}
	}

}