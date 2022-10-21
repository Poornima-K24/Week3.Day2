package week3.Day2Assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class FindSecondLargest 
{
	public static void main(String[] args) 
	{
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		
		TreeSet<Integer> treeint=new TreeSet<Integer>(); 
		for(int i=0;i<data.length;i++)
		{
			treeint.add(data[i]);
		}
		System.out.println(treeint);
		
		
		List<Integer> listint = new ArrayList<Integer>(treeint);
		int secondnumber= listint.get(listint.size() - 2);
		System.out.println("Second largest number: ");
		System.out.println(secondnumber);
		
		
		
		
	}

	
}
