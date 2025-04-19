package JavaConditionalStatement;
/**/
public class Fibonaccisequence {
//0 1 1 2 3 5 8 13 21 ...
	public static void main(String[] args) {
		
		int num = 0;
		int num1 = 1;
		int sum=0;
		System.out.println(num);
		System.out.println(num1);
		
		for(int i=1;i<=10;i++) {
			sum=num+num1;
			System.out.println(sum);
			num=num1;
			num1=sum;
		}

	}

}