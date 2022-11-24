package java_programs;

public class BinarySearch {

	public static void main(String[] args) 
	{
		int[] list = {1, 15, 25, 78, 89, 96};
		int i = binarySearch(list, 89);
		System.out.println(i);
		int j = binarySearch(list, 25);
		System.out.println(j);
		int k = binarySearch(list, 11);
		System.out.println(k);
	}
	
	public static int binarySearch(int[] list, int key)
	{
		int low = 0;
		int high = list.length - 1;
		
		int mid = (low + high) / 2;
		
		if(key < list[mid])
		{
			high = mid - 1;
		}
		else if (key == list[mid])
		{
			return mid;
		}
		else
		{
			low = mid + 1;
		}
		
		for(int i = low; i<= high; i++)
		{
			if(list[i] == key)
			{
				return i;
			}
		}
		return -1;
	}

}
