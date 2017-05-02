/**
 * 
 */
package com.mycompany.ass2.chapter4.Program_4_4and4_5;

/**
 * @author Miles
 *
 */
public class Student
{
	private String name;
	private double average;
	
	public Student(String name, double average)
	{
		this.name = name;
		
		if (average > 0.0)
			if (average <= 100.0)
				this.average = average;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void SetAverage(double studentAverage)
	{
		if (average > 0.0)
			if (average <= 100.0)
				studentAverage = average;
	}
	
	public double getAverage()
	{
		return average;
	}
	
	public String getLetterGrade()
	{
		String letterGrade = "";
		
		if (average >= 90.0)
			letterGrade = "A";
		else if (average >= 80.0)
			letterGrade = "B";
		else if (average >= 70.0)
			letterGrade = "C";
		else if (average >= 60.0)
			letterGrade = "D";
		else
			letterGrade = "F";
		
		return letterGrade;
	}
} //end of class Student