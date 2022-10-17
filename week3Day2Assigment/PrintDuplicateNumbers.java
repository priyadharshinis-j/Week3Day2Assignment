package week3Day2Assigment;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {

		int[] data = {4,3,6,8,29,1,2,4,7,8};

		/*
		 * Problem Statement : Print only duplicate values
		 * Expected output: 4 and 8
		 * 
		 * How to solve?
		 * 1) Regular for loop
		 * 2) Using Set
		 * 
		 * Using Set 
		 * 
		 * a) Add every element into Set
		 * b) If it is already there in the Set -> Print duplicate
		 * 
		 */

		System.out.println("Duplicate Element(s) (By using for loop)");
		System.out.println("======================================");
		for(int i =0;i<=data.length-1;i++)
		{  
			
			for(int j=i+1;j<=data.length-1;j++)
			{
				if(data[i]==data[j])
				{
					System.out.println(data[i]);				
				}
				
			}
		}
		System.out.println(Arrays.toString(data));
		
		System.out.println("Duplicate Element(s) (By using Set)");
		System.out.println("=================================");
		
		//List <Integer> intList = new ArrayList<Integer>(Arrays.asList(data));
		Set<Integer> hashTest = new HashSet<Integer>();
		for (int i=0;i<=data.length-1;i++) {
			
			boolean result = hashTest.add(data[i]);
			
			if(result)
			{
			continue;
			}
			else
			{
				System.out.println(data[i]);
			}
			
		}
		
		System.out.println(hashTest);
			
			
		}


	}



