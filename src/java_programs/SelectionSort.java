package java_programs;

import java.util.Arrays;

public class SelectionSort 
{
	public static void main(String[] args)
	{
		double[] list = {2, 9, 5, 4, 8, 1, 6};
		double[] i = selectionSort(list);
		System.out.println(Arrays.toString(i));
	}

	public static double[] selectionSort(double[] list)
	{
		for(int i=0; i<list.length; i++) 
		{
			for(int j=i+1; j<list.length; j++)
			{
				if(list[i]>list[j])
				{
					double temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
		}
		return list;
	}

}