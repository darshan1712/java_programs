package java_programs;

import java.util.Scanner;

public class SmallestIndexOfLargestElement {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter total input in array : ");
		int number = input.nextInt();
		
		double[] arrayN = new double[number];

		System.out.println("Enter "+ number + " array values :");
		for(int i = 0; i<number; i++)
		{
			arrayN[i] = input.nextDouble();

		}
		
		double max = arrayN[0];
		int indexOfMax = 0;
		
		for(int i = 0; i<number; i++)
		{
			if(arrayN[i] > max)
			{
				max = arrayN[i];
				indexOfMax = i;
			}
		}
		
		System.out.println("Smallest Index of largest Element is " + indexOfMax);
	}

}
