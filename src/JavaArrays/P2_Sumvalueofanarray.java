package JavaArrays;

import java.util.Arrays;

public class P2_Sumvalueofanarray {

	public static void main(String[] args) {

		int a[] = new int[5];
		a[1] = 10;
		a[2] = 20;
		a[3] = 30;
		a[4] = 40;

		System.out.println(Arrays.toString(a));
		System.out.println(a.length);

		int sum=0;
		for (int e : a) {
			System.out.println(e);
			sum=sum+e;
		}
		System.out.println(sum);
	}
}
