package com.muni2;

import java.util.Scanner;

public class RevePolindrom 
{
	public static void main(String[] args) 
	{
		
		 Scanner in = new Scanner(System.in);
		 
	      System.out.println("Enter a string to check if it is a palindrome");
	      String original = in.nextLine();
	      StringBuffer br=new StringBuffer(original);
	      String reverse=br.reverse().toString();
		if(original.equals(reverse))
		{
			System.out.println(original+" is a polindrom");
		}
		else{
			System.out.println(original+" is not a polindrom");
			
		}
		System.out.println("===========================");
			{
			 String str[] = "He is the one ".split(" ");
			    String finalStr="";
			        for(int i = str.length-1; i>= 0 ;i--)
			        {
			            finalStr += str[i]+" ";
			        }
			        System.out.println(finalStr);
			    }// input:: He is the one ::: output::: "one the is He" 
			
			
		
	}

}