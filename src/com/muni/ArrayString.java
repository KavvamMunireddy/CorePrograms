package com.muni;

import java.util.ArrayList;
import java.util.List;

public class ArrayString
{

	public static void main(String[] args)
	{

		String s="[AAA,BBB,CCC,empId,empName,empSal]";
		String s1="[111,Muni,30000]";
		for(int i=0;i<s.length();i++)
		//System.out.println(i);
		System.out.println(s);
		List list=new ArrayList();
		list.add("muni");
		list.add("reddy");
		list.add("reddy");
		list.add("reddy");
		list.add("muni");
		list.add("muni");
		//System.out.println(list);
		//String s2=s.replaceAll("[^a-z]", s);
		System.out.println(s);
				
	}
	
}
