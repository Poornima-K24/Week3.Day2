package week3.Day2Assignment2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesCharacter 
{
	public static void main(String[] args) 
	{
		String name = "PayPal India";
		char[] charconvert = name.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
		for (char c : charconvert) 
		{
			if (Character.isWhitespace(c))
				continue;

			boolean add = charSet.add(c);
			
			if(add==false)
			{
				dupCharSet.add(c);
			}

		}

		System.out.println("Character Set " + charSet);
		System.out.println("Duplicate Character Set " + dupCharSet);

		List<Character> listchar = new ArrayList<Character>(dupCharSet);
		//List<Character> listcharset = new ArrayList<Character>(charSet);
		//System.out.println("List"+listcharset);
		for (int i = 0; i < listchar.size(); i++) 
		{
			char ch1 = listchar.get(i);
			if (Character.isWhitespace(ch1))
				continue;
				charSet.remove(listchar.get(i));
			
		}
		System.out.println("After Removing Duplicates");
		System.out.println("Character Set " + charSet);
		System.out.println("Duplicate Character Set " + dupCharSet);

	}
}
