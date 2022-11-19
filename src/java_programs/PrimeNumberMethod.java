package java_programs;

import java.util.Scanner;

public class PrimeNumberMethod {

	//Here we will write function that will give first 50 prime numbers
	public static void main(String[] args) 
	{
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter Number : ");
//		int n1 = input.nextInt();
		
//		int count = 0;
//		String primeOrNotPrime = givePrime(n1);
//		System.out.println(primeOrNotPrime);
		
		String output = "";
		int primeNumberCount = 0;
		int n = 2;
		while(primeNumberCount != 50) 
		{
			if(givePrime(n))
			{
				primeNumberCount++;
				if(primeNumberCount%10 != 0) 
				{
//					output = output +n + "     ";
					System.out.printf("%-5s", n);
				}
				else
				{
//					output = output + "\n" + n + "     ";
					System.out.printf("%-5s\n", n);
				}
			
			}
			n++;
		}
		System.out.println(output);
	}
	
	public static boolean givePrime(int n1) 
	{
		for(int i=2; i<n1/2; i++)
		{
			if(n1%i == 0) 
			{
				return false;
			}
		}
		return true;
	}
}
