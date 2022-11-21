package java_programs;

import java.util.Arrays;

public class RandomShuffling {

	public static void main(String[] args) 
	{		
		double[] myList ={11, 12,15, 17, 20};// see here curly braces are used to initiate an array
		
		System.out.println(Arrays.toString(myList));
		
		for (int i = myList.length - 1; i > 0;  i--)
		{
			int toShuffle = (int) (Math.random() * i-1);
			double temp = myList[toShuffle];
			myList[toShuffle] = myList[i];
			myList[i] = temp;
		}
		System.out.println(Arrays.toString(myList));
	}

}
