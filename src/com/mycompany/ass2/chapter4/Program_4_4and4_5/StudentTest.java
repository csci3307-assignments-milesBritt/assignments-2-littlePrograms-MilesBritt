package com.mycompany.ass2.chapter4.Program_4_4and4_5;

public class StudentTest 
{
	/**
	 * @author Miles
	 * 
	 */
	public static void main(String[] args) 
	{
		 Student account1 = new Student("Jane Green", 93.5); 
		 Student account2 = new Student("John Blue", 72.75); 
		 
		 System.out.printf("%s's letter grade is: %s%n", 
				 account1.getName(), account1.getLetterGrade()); 
		 System.out.printf("%s's letter grade is: %s%n", 
				 account2.getName(), account2.getLetterGrade());
		 
		 System.out.println("End of class StudentTest.....");
	}
} // end of StudentTest
