package Module_1;

import java.util.Scanner;
public class LoopExample {

	public static void main(String[] args) {
			int i;
			
			for(i=10; i>=1; i--)
			{
				System.out.print(i*3 +"     ");
				
			}
			System.out.println("");
			for(i=10; i>=1; i--)
			{
			System.out.print(i*4 +"     ");
			}
			System.out.println("");
			for(i=10; i>=1; i--)
			{
			System.out.print(i*4 + i*3 +"     ");
			}
			System.out.println("");
			
			//Sum of N Natural numbers (1.............N)
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt(); //10
			int result = 0;
			int M = sc.nextInt(); //10
			int result2 = 0;
			for(i=1; i<=N; i++)
			{
				result = result + i;
			}
			System.out.println(result);
			System.out.println("");

			//Sum of N Whole numbers (0.............N)
			
			for(i=0; i<=M; i++)
			{
				result2 = result2 + i;
			}
			System.out.println(result2);
	}

}
