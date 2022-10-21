package week3.Day2Assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesWords
{
	public static void main(String[] args) 
	{
		
		
		String name="We learn java basics as part of java sessions in java week1";
		
		Set<String> output = new HashSet<String>();
		
		System.out.println(name);
		
		String singleword[];
	
		singleword=name.split(" ");
		
		
		
		for(int i=0;i<singleword.length;i++)
		{
			System.out.println(singleword[i]);
			output.add(singleword[i]);		
			
		}
		System.out.println(output);
		
		List<String> stringname= new ArrayList<String>(output);
		Collections.sort(stringname);
		Collections.reverse(stringname);
		System.out.println(stringname);
		/*System.out.println("----");
		List<String> stringname= new ArrayList<String>(output);
		System.out.println(stringname);
		Collections.reverse(stringname);
		System.out.println("After reverse");
		System.out.println("------");
		System.out.println(stringname);*/
		
	}
}
