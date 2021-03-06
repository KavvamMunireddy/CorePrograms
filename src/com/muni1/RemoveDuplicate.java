package com.muni1;

import java.util.Arrays;

public class RemoveDuplicate 
{
	    static void removeDuplicates(int[] ks)
	    {
	        System.out.println("Array With Duplicates : ");
	         
	        for (int i = 0; i < ks.length; i++)
	        {
	            System.out.print(ks[i]+"\t");
	        }
	         
	        //Assuming all elements in input array are unique
	         
	        int noOfUniqueElements = ks.length;
	         
	        //Comparing each element with all other elements
	         
	        for (int i = 0; i < noOfUniqueElements; i++) 
	        {
	            for (int j = i+1; j < noOfUniqueElements; j++)
	            {
	                //If any two elements are found equal
	                 
	                if(ks[i] == ks[j])
	                {
	                    //Replace duplicate element with last unique element
	                     
	                    ks[j] = ks[noOfUniqueElements-1];
	                     
	                    //Decrementing noOfUniqueElements
	                     
	                    noOfUniqueElements--;
	                     
	                    //Decrementing j
	                     
	                    j--;
	                }
	            }
	        }
	         
	        //Copying only unique elements of arrayWithDuplicates into arrayWithoutDuplicates
	         
	        int[] arrayWithoutDuplicates = Arrays.copyOf(ks, noOfUniqueElements);
	         
	        //Printing arrayWithoutDuplicates
	         
	        System.out.println();
	         
	        System.out.println("Array Without Duplicates : ");
	         
	        for (int i = 0; i < arrayWithoutDuplicates.length; i++)
	        {
	            System.out.print(arrayWithoutDuplicates[i]+"\t");
	        }
	         
	        System.out.println();
	         
	        System.out.println("==============================");
	    }
	     
	    public static void main(String[] args) 
	    {        
	        removeDuplicates(new int[] {4, 3, 2, 4, 9, 2});
	         
	       // removeDuplicates(new int[] {1, 2, 1, 2, 1, 2});
	         
	        //removeDuplicates(new int[] {15, 21, 11, 21, 51, 21, 11});
	         
	        //removeDuplicates(new int[] {7, 3, 21, 7, 34, 18, 3, 21});
	    }    
	{	
	String s=" ";
	StringBuffer sb=new StringBuffer();
	System.out.println(s.equals(sb));
	System.out.println(sb.equals(s));
	}
}
