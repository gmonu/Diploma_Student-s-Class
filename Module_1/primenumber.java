package Module_1;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		boolean f;  //false or true
		
		for(int i = 2; i<=a; i++)
		{
			if(a%i == 0)
			{
				f = true;
				break;
			}
			
		}
		if(f = false)
		{
		System.out.println("Prime");
		}
		else
		{
		System.out.println("Not prime");
		}	
	}

}
