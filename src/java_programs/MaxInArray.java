package java_programs;

import java.util.Scanner;

public class MaxInArray {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter total input in array : ");
		int number = input.nextInt();
		
		double[] arrayN = new double[number];

		double max = 0;
		System.out.println("Enter "+ number + " array values :");
		for(int i = 0; i<number; i++)
		{
			arrayN[i] = input.nextDouble();
			if(arrayN[i] > max)
			{
				max = arrayN[i];
			}
		}
		
		System.out.println("Max value in array is " + max);
		
	}

}
