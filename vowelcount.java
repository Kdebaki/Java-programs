//Implement a java program to count the number of Vowels, Consonants and Digits in given String.
package week7;
public class vowelcount 
{
	static void CountCharacterType(String str)
	{
		byte vowelCount=0,consonantCount=0,digitCount=0,SplChars=0;
		for(Short i=0;i<str.length();i++) 
		{
			char ch=str.charAt(i);
			if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
			{
				ch=Character.toLowerCase(ch);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					vowelCount++;
				else
					consonantCount++;
			}
			else if(ch>='0'&&ch<='9')
				digitCount++;
			else
				SplChars++;
		}
		System.out.println("The total number of vowels in the given String:"+vowelCount);
		System.out.println("The total number of consonants in the given String:"+consonantCount);
		System.out.println("The total number of digit in the given String:"+digitCount);
		System.out.println("The total number of Special Character in the given String:"+SplChars);
	}
	static public void main(String[]args) {
		String str=("Habit-2:Begin with an end in your mind./nStephen R.Covey author of 7 habit of Effective People,suggest that effictive individuals have a clear vision of| their desire destination before embarking on any endeavor.");
		CountCharacterType(str);
	}
}