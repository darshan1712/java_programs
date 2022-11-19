package java_programs;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generateRandomNumbers(65, 90);
		generateRandomNumbers(65, 90);
		generateRandomNumbers(65, 90);
		generateRandomNumbers(65, 90);
		generateRandomNumbers(65, 90);
		generateRandomNumbers(65, 90);
		generateRandomNumbers(65, 90);
		generateRandomNumbers(65, 90);
		generateRandomNumbers(65, 90);
		generateRandomNumbers(65, 90);
		generateRandomNumbers(65, 90);
		generateRandomNumbers(65, 90);
		generateRandomNumbers(65, 90);
		generateRandomNumbers(65, 90);
		generateRandomNumbers(65, 90);
		generateRandomNumbers(65, 90);
		generateRandomNumbers(65, 90);
		generateRandomNumbers(65, 90);
		generateRandomNumbers(65, 90);
		generateRandomNumbers(65, 90);

	}

	public static void generateRandomNumbers(int n1, int n2) 
	{
		int number = n1 + (int)(Math.random() * ((n2-n1)+1));
		System.out.println(number);
	}
}
