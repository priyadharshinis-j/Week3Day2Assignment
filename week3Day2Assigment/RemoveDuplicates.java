package week3Day2Assigment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {		
		
//		Declare a String as PayPal India
		
		String text = "PayPal India";
		
//		Convert it into a character array
		
		char[] charArray = text.toCharArray();
	
		
//		Declare a Set as charSet for Character
		
		Set<Character> charSet = new HashSet<Character>();
		

//		Declare a Set as dupCharSet for duplicate Character
		
		Set<Character> dupCharSet = new HashSet<Character>();
		
//		Iterate character array and add it into charSet
		
		for(int i=0;i<=charArray.length-1;i++)
		{
			
			boolean result = charSet.add(charArray[i]);
		

//		if the character is already in the charSet then, add it to the dupCharSet
			if(result==false)
			{
				dupCharSet.add(charArray[i]);
			}
		}

//		Check the dupCharSet elements and remove those in the charSet
				
		if(charSet.containsAll(dupCharSet))
		{
			charSet.removeAll(dupCharSet);
		}
		 
		System.out.println("Set without duplicates");
		System.out.println("======================");
		System.out.println(charSet);
		List<Character> charList = new ArrayList<Character>(charSet);
		
//		Iterate using charSet
		for(int i=0;i<=charList.size()-1;i++)
		{

//		Check the iterator variable isn't equals to an empty space
		if(charList.get(i)==' ')
		{
			charList.remove(i);
		}
		}
//		print it
		System.out.println("After removing empty space");
		System.out.println("===========================");
		System.out.println(charList);

	}

	}

