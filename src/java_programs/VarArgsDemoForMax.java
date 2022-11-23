package java_programs;

public class VarArgsDemoForMax {

	public static void main(String[] args) {
		printMax(34, 2, 35, 55, 4, 9, 99);
		printMax(new double[]{1,2,3});
	}
	
	public static void printMax(double...numbers)//var Args used here
	{
		if(numbers.length == 0)
		{
			System.out.println("No argument passed");
			return;
		}
		double max = numbers[0];
		for(double e : numbers)//for-each loop used here
		{
			if(e>max) 
			{
				max = e;
			}
		}
		System.out.println("Maximum is : " + max);
	}

}
