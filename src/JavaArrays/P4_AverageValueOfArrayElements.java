package JavaArrays;

public class P4_AverageValueOfArrayElements {

	public static void main(String[] args) {
		 
		double b[]= {10.0,10.0,10.0,10.0,10.0};
	
		int len = b.length;
		
		System.out.println("Lenght of an Array = "+len);
		System.out.println("Lowest Index = " + b[0]);
		System.out.println("Highest Index = " + (b.length-1));
		
		
		double sum=0;
		for(double e:b) {
			sum=sum+e;
		}
		
		double avg = sum/b.length;
		System.out.println("Average value of the array elements is = " + avg);
	}

}
