package Module_1;

import java.util.Scanner;

public class If_Else_Demo {

	public static void main(String[] args) {
		// Finding Eligibility for employment
		// Diploma with 70%
		// Must have 1 training
		// Must have one certificate
		
		Scanner sc = new Scanner(System.in);
		System.out.println("-----Tell Me about Yourself-----");
		int percent = sc.nextInt();
		if(percent >= 70)
		{
			System.out.println("Congrats, First Criteria is Fulfilled");
		}
		else
		{
			System.out.println("Sorry, First Criteria is not Fulfilled");
			System.exit(0);
		}
		
		boolean training; //Boolean: True/False
		
		System.out.println("Have you done training?\nWrite True if yes or Write False");
		training = sc.nextBoolean();
		if(training) //True
		{
			System.out.println("Congrats, Second Criteria is Fullfilled");
		}
		else
		{
			System.out.println("Sorry, Second Criteria is not Fulfilled");
			System.exit(0);	
		}
		
		boolean certificate; //True or False
		
		System.out.println("Are you holding the Diploma Certificate?\nWrite True if yes or Write False");
		certificate = sc.nextBoolean();
		if(certificate)
		{
			System.out.println("Congrats, Third Criteria is Fullfilled");
		}
		else
		{
			System.out.println("Sorry, Third Criteria is not Fulfilled");
			System.exit(0);	
		}
		
		System.out.println("Congratulations You're eligible for the employment");
		sc.close();
	}

}
