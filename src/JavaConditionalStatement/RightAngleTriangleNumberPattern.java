package JavaConditionalStatement;
/*	*/
/*Write a Java program to display the pattern like a right angle triangle with a number.

Test Data
Input number of rows : 10
Expected Output :

1                                                                                
12                                                                               
123                                                                              
1234                                                                             
12345                                                                            
123456                                                                           
1234567                                                                          
12345678                                                                         
123456789                                                                        
12345678910*/
public class RightAngleTriangleNumberPattern {

	public static void main(String[] args) {
		
		
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				if(i>=j) {
				System.out.print(j + " ");}
			}
			System.out.println();
		}

	}

}
