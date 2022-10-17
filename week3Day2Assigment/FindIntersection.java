package week3Day2Assigment;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	/*
	 * Pseudo Code
	 *input: int[] a={3,2,11,4,6,7};
	 *        int[] b={1,2,8,4,9,7};
	 *output:2,4,7
	 *
	 * a) Declare An Array for {3,2,11,4,6,7};	 
	 * b) Declare another Array for {1,2,8,4,9,7};
	 * c) create a two empty Lists - list1 & list2
	 * c) Declare for loop iterator from 0 to array a.length and add into list1
	 * d) Declare for loop iterator from 0 to array b.length and add into another list2
	 * e) Compare Both list1 & list2 using a nested for loop
	 *    1)Print the matching number
	 *  
	 */
	
	public static void main(String[] args)
	{
		int[] a={3,2,11,4,6,7};
		int[] b={1,2,8,4,9,7};
		List<Integer> intList1 = new ArrayList<Integer>();
		List<Integer> intList2 = new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			intList1.add(a[i]);
		}
		System.out.println("First List ===> "+intList1);
		
		for(int i=0;i<b.length;i++)
		{
			intList2.add(b[i]);
		}
		System.out.println("Second List ===> "+intList2);
		System.out.println("============================");
		System.out.println("<<Intersected values are>> ");
		System.out.println("============================");
		for(int i=0;i<intList1.size();i++)
		{
			for(int j=0;j<intList2.size();j++)
			{
				if(intList1.get(i).equals(intList2.get(j)))
				{
					System.out.println(intList1.get(j));
				}
			}
		}
	}

}
