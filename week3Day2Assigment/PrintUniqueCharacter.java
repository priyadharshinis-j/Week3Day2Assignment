package week3Day2Assigment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class PrintUniqueCharacter {
	//PrintUniqueCharacter
	/*
	 * Problem
	 * 
	 * a) Take your name as input
	 * b) Print all unique characters only (any order)
	 * 
	 * Input:  babu
	 * Output: a u 
	 * 
	 */

	/*
	 * Psuedocode
	 * 
	 * a) Convert String to Character array
	 * b) Create a new Set -> HashSet
	 * c) Add each character to the Set and if it is already there, remove it
	 * d) Finally, print the set
	 * 
	 */
	public void printUniqueCharacter(String name)
	{
		char[] nameArray = name.toCharArray();
		//System.out.println(Arrays.toString(nameArray));
		Set<Character> nameSet = new HashSet<Character>();
		Set<Character> repSet = new HashSet<Character>();
		for(int i=0;i<=nameArray.length-1;i++)
		{
			boolean result = nameSet.add(nameArray[i]);
			if(result==false)
			{
				repSet.add(nameArray[i]);
			}
		}
		
		
		List<Character> repCharList = new ArrayList<Character>(repSet);
		for(int i=0;i<=repSet.size()-1;i++) 
		{
			if(nameSet.contains(repCharList.get(i)))
			{
				nameSet.remove(repCharList.get(i));
			}
		}
		System.out.println("<<Unique Characters>>");
		System.out.println("======================");
		
		System.out.println(nameSet);
		
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name to find unique characters ");
		System.out.println("==========================================");
		
		String name = sc.nextLine();
		
		PrintUniqueCharacter uniqueCharacter = new PrintUniqueCharacter();
		
		uniqueCharacter.printUniqueCharacter(name);
		
		sc.close();
		
	}
}
