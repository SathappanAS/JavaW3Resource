package JavaArrays;

/*12. Write a Java program to find duplicate values in an array of integer values.*/
public class P12_findduplicatevaluesinanarrayofintegervalues {

	public static void main(String[] args) {
		int a[] = { 5, 2, 7, 7, 5 };//5

		int len = a.length;

		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				 if ((a[i] == a[j]) && (i != j)) {
	                    // If a duplicate is found, print the duplicate element.
	                    System.out.println("Duplicate Element : " + a[j]);
	                }
			}

		}
	}

}
