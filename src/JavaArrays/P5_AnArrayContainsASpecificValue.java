package JavaArrays;
//Write a Java program to test if an array contains a specific value.

public class P5_AnArrayContainsASpecificValue {

	public static void main(String[] args) {
		
		int year[]= {1789,2035,1899,1456,2025};
		
		int len = year.length;
		
		System.out.println("Lenght of an Array = "+len);
		System.out.println("Lowest Index = " + year[0]);
		System.out.println("Highest Index = " + year[(year.length-1)]);
		
		for(int e:year) {
//			System.out.println(e);
//			System.out.println("-----");
			if(e==1456) {
				System.out.println(e);
				break;
			}
		}

	}

}
