package week3Day2Assigment;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {

		// Here is the input
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		//       output= 7;

		
		 //* Pseudo Code: 
		 //* a) Create a empty Set Using TreeSet
		  TreeSet<Integer> treeSet = new TreeSet<Integer>();
		  
		 //* b) Declare for loop iterator from 0 to data.length and add into Set
		  for(int i=0;i<=data.length-1;i++)
		  {
			  treeSet.add(data[i]);
		  }
		 //* c) converted Set into List
		  System.out.println("TreeSet Elements are----> "+treeSet);
		 //* d) Print the second last element from List
		 List<Integer> intList = new ArrayList<Integer>(treeSet);
		 int size = intList.size();
		 System.out.println("Second Largest Element----> "+intList.get(size-2));


	}
}