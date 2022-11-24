package java_programs;

public class LinearSearch {
	
	public static void main(String[] args)
	{
		int[] list = {1, 15, 25, 78, 89, 96};
		int i = linearSearch(list, 25);
		System.out.println(i);
		int j = linearSearch(list, 46);
		System.out.println(j);
	}
	
	public static int linearSearch(int[] list, int key)
	{
		for(int i=0; i<list.length - 1; i++)
		{
			if(list[i] == key)
			{
				return i;
			}
		}
		return -1;
	}
}
