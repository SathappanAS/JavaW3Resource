package JavaArrays;

import java.util.Arrays;

public class P11_ReverseAnArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int b[]=new int[a.length];
		System.out.println(Arrays.toString(a));

		int len=a.length; //10
		System.out.println(len);
		
		for (int i = 0; i < len/2; i++) {
            // Swap the elements at positions 'i' and 'length - i - 1'.
            int temp = a[i];
            a[i] = a[len - i - 1];
            a[len- i - 1] = temp;
        }
		
		System.out.println(Arrays.toString(a));
		
	}

}
