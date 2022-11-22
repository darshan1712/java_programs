package java_programs;

public class GenerateRandomCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getRandomCharacter('a', 'z'));
		System.out.println(getRandomCharacter('G', 'Z'));
		System.out.println(getRandomCharacter('A', 'Z'));
		System.out.println(getRandomCharacter('0', '9'));
		System.out.println(getRandomCharacter('\u0000', '\uFFFF')); 
		//Above one is not working as accepted.
		//It was followed from example 6.10(Random Character), 
		//please go through this unicode/decimal concept when have time

	}
	
	public static char getRandomCharacter(char ch1, char ch2)
	{
		return (char) (ch1 + (Math.random() * ((ch2 - ch1) + 1)));
	}
	
	

}
