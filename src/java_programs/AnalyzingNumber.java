package java_programs;

import java.util.Scanner;

public class AnalyzingNumber {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter total input in array : ");
		int number = input.nextInt();
		
		double[] arrayN = new double[number];
		double sum = 0;
		System.out.println("Enter "+ number + " array values :");
		for(int i = 0; i<number; i++)
		{
			arrayN[i] = input.nextDouble();
			sum = sum + arrayN[i];
		}
		
		double average = sum / number;
		
		int count = 0;
		for(int i = 0; i<number; i++)
		{
			if(arrayN[i] > average)
			{
				count++;
			}
		}
		System.out.println("Average is " + average);
		System.out.println("Total " + count + " numbers are above Average value.");
	}
	
}
