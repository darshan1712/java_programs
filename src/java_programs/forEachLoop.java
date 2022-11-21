package java_programs;

import java.util.Arrays;

public class forEachLoop 
{
	public static void main(String[] args) 
	{
		double[] myList ={11, 12,15, 17, 20, 22}; // see here curly braces are used to initiate an array
		System.out.println(Arrays.toString(myList)); // this is to print array as string
		
		for (double e : myList) 
		{
			System.out.println(e);
		}
	}
}
