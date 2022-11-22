package java_programs;

public class CountLettersInArray {

	public static void main(String[] args) 
	{
		
		char[] randomCharater = randomCharacterArray();
		displayRandomCharacterArray(randomCharater);
		int[] countChar = characterCountArray(randomCharater);
		displayCharacterCount(countChar);
	}

	//method, that will create 100 random character array
	public static char[] randomCharacterArray()
	{
		char[] chars = new char[100];
		
		for(int i = 0; i < chars.length; i++)
		{
			chars[i] = GenerateRandomCharacter.getRandomCharacter('a', 'z');
		}
		return chars;
	}

	//method that display display random character array
	public static void displayRandomCharacterArray(char[] chars)
	{
		for(int i = 0; i<chars.length; i++)
		{
			if((i + 1) % 20 == 0) 
			{
				System.out.println(chars[i]);
			}
			else
			{
				System.out.print(chars[i] + " ");
			}
		}
	}
	
	//method that will create array for each character count in an array
	public static int[] characterCountArray(char[] chars)
	{
		int[] countChars = new int[26];
		
		for(int i=0; i<chars.length; i++)
		{
			countChars[chars[i]-'a']++;
		}
		return countChars;
	}
	
	//method that will display each charater count array
	public static void displayCharacterCount(int[] countChars)
	{
		System.out.println();
		for(int i = 0; i<countChars.length; i++)
		{
			if((i+1) % 10 == 0)
			{
				System.out.println((char)(i + 'a') + "-" +countChars[i]);
			}
			else
			{
				System.out.print((char)(i + 'a') + "-" +countChars[i] + " ");
			}
		}
	}
	
}
