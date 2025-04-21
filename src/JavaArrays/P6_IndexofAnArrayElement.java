package JavaArrays;

import java.util.OptionalInt;

public class P6_IndexofAnArrayElement {

//	public static OptionalInt findIndex(int[] my_array, int t) {
//
//		if (my_array == null)
//			return OptionalInt.empty();
//		
//		int len = my_array.length;
//		int i = 0;
//		
//		while (i < len) {
//			
//			if (my_array[i] == t)
//				return OptionalInt.of(i);
//			else
//				i++;
//		}
//		return OptionalInt.empty();
//	}
//
//	public static void main(String[] args) {
//		
//		int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
//	
//		findIndex(my_array, 25).ifPresent(index -> System.out.println("Index position of 25 is: " + index));
//	
//		findIndex(my_array, 877).ifPresent(index -> System.out.println("Index position of 877 is: " + index));
//
//		findIndex(my_array, 29).ifPresent(index -> System.out.println("Index position of 29 is: " + index));
//	}

	public static int my_array(int a[],int num) {
		
		if (a == null) {
			System.out.println("empty array");
		}
		
		int len = a.length;
		int i=0;
		while(i<a.length) {
			if(a[i]==num) {
				System.out.println(i);
				break;
			}
			else {
				i++;
			}
		}
		
		
		return 0;
	}
	
	public static void main(String[] args) {
		
	int a[]= new int[5];
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	a[4]=50;
	
	
	
	my_array(a,10);
	
	
	
}}