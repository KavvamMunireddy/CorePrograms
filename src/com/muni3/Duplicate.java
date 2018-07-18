package com.muni3;

import java.util.HashSet;
import java.util.Set;

public class Duplicate
{
	public static void main(String[] args)
	{
		String str[]={"DD","Muni","CC","CC","BB","AA","BB","AA","AA","AA","DD","BB","CC","AA","CC","BB","AA","AA","AA"};
		Set s=new HashSet();
		for(int i=0;i<str.length;i++)
		{
			if(!s.add(str[i])){}
					//System.out.println(str[i]);
			else
				
				System.out.println(str[i]);
		}
	}
}
