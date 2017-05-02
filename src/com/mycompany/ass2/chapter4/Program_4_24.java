/**
 * 
 */
package com.mycompany.ass2.chapter4;
import java.util.Scanner;
/**
 * @author Miles
 *
 */

//	4.24 (Validating User Input) Modify the program in Fig. 4.12 
//	to validate its inputs. For any input, if the value 
//	entered is other than 1 or 2, keep looping until the user 
//	enters a correct value.

public class Program_4_24 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int passes = 0, failures = 0, studentCounter = 0;
		int result = 0;
		while ((studentCounter <= 10))
		{
			do 
			{
				System.out.print("Enter result (1 = pass, 2 = fail): ");
				result = input.nextInt();
				
				if (result == 1 || result == 2)
					break;
				else
					System.out.println("Please make sure you enter 1 or 2.");
			} while (result != 1 || result != 2);
			
			if (result == 1)
				passes += 1;
			else
				failures += 1;
			
			studentCounter += 1;
		}
		
		System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);
		
		if (passes > 8)
			System.out.println("Bonus to instructor!");
		
		System.out.println("End Class...");
	}
}
