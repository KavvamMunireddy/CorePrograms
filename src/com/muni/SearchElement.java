package com.muni;

import java.util.Scanner;

public class SearchElement
{

	

	public static void main(String[] args) 
	{
		int size,i;
		int arr[] = new int[50];
	       Scanner scan = new Scanner(System.in);
		   
	       System.out.print("Enter Array Size : ");
	       size = scan.nextInt();
		   
	       System.out.print("Enter Array Elements : ");
	       for(i=0; i<size; i++)
	       {
	           arr[i] = scan.nextInt();
	       
	       }
			System.out.println("enter find the value");
			int search=scan.nextInt();
			for(i=0; i<size; i++)
		      {
				if(arr[i]==search)
				{				
					System.out.println(search+"  is present location  "+(i+1));
				}
		      }			
	}

}
