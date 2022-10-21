package week3.Day2Assignment2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection 
{
	public static void main(String[] args)
	{
		List<String> company= Arrays.asList("HCL", "Wipro",  "Aspire Systems", "CTS"); 
		System.out.println("Before the sorting of string value");
		System.out.println(company);
		Collections.sort(company);
		System.out.println("After sorting");
		System.out.println(company);
		Collections.reverse(company);
		System.out.println("After sorting in reverse");
		System.out.println(company);
	}
}
