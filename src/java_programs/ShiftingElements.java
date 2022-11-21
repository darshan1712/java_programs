package java_programs;

import java.util.Arrays;

public class ShiftingElements {

	public static void main(String[] args) 
	{
		double[] myList ={11, 12,15, 17, 20, 22};// see here curly braces are used to initiate an array
		System.out.println(Arrays.toString(myList));
		double firstData = myList[0];
		
		for (int i = 0; i < myList.length-1; i++)
		{
			myList[i] = myList[i+1];
		}
		myList[myList.length-1] = firstData;
		
		System.out.println(Arrays.toString(myList));
	}

}
