package com.muni;

import java.util.Scanner;

public class Reverse2
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a name");
		String str=s.next();
		StringBuffer br=new StringBuffer(str);
		String str2=br.reverse().toString();
		System.out.println("ReveseName::"+str2);
		
	
	}

}
