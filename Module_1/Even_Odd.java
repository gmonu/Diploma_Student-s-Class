package Module_1;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String args[]) 
		
	//Paste your program here
	{
	int num;
    System.out.println("Enter an Integer number:");
		
		Scanner input = new Scanner(System.in);
   		 num = input.nextInt();
		
	if ( num % 2 == 0 )
         System.out.println("Entered number is even");
        else
        System.out.println("Entered number is odd");
	}

}
