package com.muni2;

import java.util.Scanner;

public class ReverseWord1 
{
	
	@SuppressWarnings("static-access")
	static void reverse(String s1)
	{
		String  reverseString="";
		String[] str=s1.split(" ");
		for(int i=0;i<str.length;i++)
		{
			//System.out.print(str[i]);
			String str1=str[i];
			int j=Integer.parseInt(str1.valueOf(i+1));
			String reverseWord = "";
            String sameword="";
			if(j%2==1)
			{
				for(int k=str1.length()-1;k>=0;k--)
				{
					 reverseWord = reverseWord + str1.charAt(k);
				}
			}
			else
			{
				sameword=sameword+str1+"";
			}
			 reverseString = reverseString+sameword+reverseWord + " ";
		}
		System.out.println(reverseString);
		
	}
	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a small paragraph to see result");
	String s1=s.nextLine();
	reverse(s1);
		
	}

}
