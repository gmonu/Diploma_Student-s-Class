package Module_1;

import java.util.Scanner;

public class Simple_Interest {

	public static void main(String[] args) {
	
		//Simple Interest = P*R*T/100 
		//where P is principal amount and R is rate of interest and T is time deposit
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Pricipal amount\n Enter rate of Interest\n Enter time in years");
		int p = sc.nextInt();
		double r = sc.nextDouble();
		int t = sc.nextInt();
		
		double interest = p*r*t/100;
		double final_amount = interest + p;
		System.out.println("Your Interest amount: "+interest);
		System.out.println("Your final amount(initial amount + interest) :  "+ final_amount);
				
		sc.close();

	}

}
