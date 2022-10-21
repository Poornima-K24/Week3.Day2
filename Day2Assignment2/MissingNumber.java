package week3.Day2Assignment2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber 
{
	public static void main(String[] args) 
	{
		
		int[] data = {1,2,3,4,5,7,9};
		
		int length = data.length;
		
		Set<Integer> setint= new TreeSet<Integer>();//remove duplicate entries
		for(int i=0;i<data.length;i++)
		{
			setint.add(data[i]);
		}
		
		System.out.println(setint);
		List<Integer> intvalue = new ArrayList<Integer>(setint);
		for(int i=0;i<=length-1;i++)
		{
			if(intvalue.get(i)+1==intvalue.get(i+1))
			{
				continue;
			}
			else
			{
				int numbermissed=intvalue.get(i)+1;
				System.out.println("missing number in array list"+numbermissed);
			}
		}
		
		
		
	}
	
	
}
