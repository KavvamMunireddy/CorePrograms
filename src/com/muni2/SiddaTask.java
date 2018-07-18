package com.muni2;

public class SiddaTask 
{
	public static void main(String[] args) 
	{
		String docno="2,3,5";
		String docvalues="sidda,2000,200,null,muni,3000,400,null,reddy,5000,500,null";
		System.out.println("Docno  name  sal  pf");
		for(int i=0;i<docno.length();i++)
		{
			System.out.println(docno.charAt(i));
			System.out.println(docvalues.charAt(i));
		}
		
	}
}
