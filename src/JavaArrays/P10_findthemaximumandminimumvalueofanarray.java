package JavaArrays;

public class P10_findthemaximumandminimumvalueofanarray {

	public static void main(String[] args) {
		int a[]= {25,14,56,15,36,1,6,8,9};
		
		int len=a.length;
		
		int max_num=a[0];
		int min_num=a[0];
		
		for(int i=0;i<len;i++) {
			
			if(a[i]>max_num) {
				max_num=a[i];
			}
			
			if(a[i]<min_num) {
				min_num=a[i];
			}
			
		}
		
		System.out.println("Minimum value: " + min_num);
		System.out.println("Maximum value: " + max_num);
	}

}
