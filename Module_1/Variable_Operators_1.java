package Module_1;

import java.util.Scanner;

public class Variable_Operators_1 {

	public static void main(String[] args) {
				
		//Variable Operators (+, -, *, /, %, ++, --)
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); //20   // -infinity to +infinity 
		int b = sc.nextInt(); //10
		
		System.out.println(a+b); // 30
		
		System.out.println(a-b); // 10
		                                                   
		System.out.println(a*b); // 200
		
	
		System.out.println(a%b); //Output = remainder 21%10 = 1 
		
		System.out.println(a/b); //Output = quotient  25/10 = 2
		
		System.out.println(++a); // Output = 21
		System.out.println(a++); // Output = 21
		
		System.out.println(a+b);  //Post Increment 
		System.out.println(++a+b); //Pre Increment
		
		sc.close();
		

	}

}
