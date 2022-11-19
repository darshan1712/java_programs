package java_programs;

import java.util.Scanner;

public class GreatestCommonDivisor 
{
	// Here we take two numbers from users and will 
	//find out greatest common divisor from two.
	
	public static void main(String[] args) 
	{	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Number One : ");
		int input1 = input.nextInt();
		
		System.out.println("Enter Number Two : ");
		int input2 = input.nextInt();
		
		gcd(input1, input2);
	}
		public static void gcd(int n1, int n2){
			int gcdValue = 1;
			
			for(int i = 1; i<=n1 && i<=n2; i++)
			{
				if(n1%i == 0 && n2%i == 0) 
				{
					gcdValue = i;
				}
			}
			System.out.println("Greatest Common Divisor for two number " 
			+ n1 + " and " + n2 + " is " + gcdValue + "." );
		}
	}
