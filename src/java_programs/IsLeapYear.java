package java_programs;

import java.util.Scanner;

public class IsLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter year :");
		int year = input.nextInt();
		
		if (isLeapYear(year)) 
		{
			System.out.println("Year " + year +  ", is Leap year...!!");
		}
		else
		{
			System.out.println("Year " + year + ", is not Leap Year...!!");
		}
		
	}
	
	public static boolean isLeapYear(int year) 
	{
		return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
	}

}
