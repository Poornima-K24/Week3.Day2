package week3.Day2Assignment2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicateNumbers
{
	public static void main(String[] args) 
	{
		int[] data = {4,3,6,29,29,1,8,4,7,8};
		boolean value= false;
		List<Integer> listnumber= new ArrayList<Integer>();
		Set<Integer> output = new HashSet<Integer>();
		System.out.println("Duplicate numbers:");
		for(int i=0;i<data.length;i++)
		{
			value=output.add(data[i]);
			if(value==false)
			{
				System.out.println(data[i]);
			}
		}	
		
	}
}
