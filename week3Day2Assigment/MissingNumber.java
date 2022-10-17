package week3Day2Assigment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MissingNumber{
/*
	 * Problem 
	 * 
	 * There will be running number between 1 to 10
	 * One of the unique number will be missing
	 * Find the missing number
	 * 
	 * 
	 */
	
	/*
	 * Psuedocode
	 * 
	 * a) Remove the duplicates using Set
	 * b) Make sure the set is in the ascending order
	 * c) Iterate from the starting number and verify the next number is + 1
	 * d) If did not match, that is the number
	 * 
	 */
	public static void main(String[] args) {
		
	
	int[] numArray = {1,2,2,3,4,3,6,7,8,9,4,3,10};
	
	Set <Integer> hashSet = new HashSet <Integer>();
	
	for(Integer x:numArray)
	{
		hashSet.add(x);
	}
	System.out.println("The HashSet values are-----> "+hashSet);
	
	List <Integer> listArray = new ArrayList<Integer>(hashSet);
	
	for(int i=1;i<=10;i++)
	{
		if(i!=listArray.get(i-1))
		{
			System.out.println("Missing Number is----> " +i);
			break;
		}
		
	}

}
}