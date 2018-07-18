package com.muni;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class FindDup
{
	public static void main(String args[])
	{
		String[] args1={"12","11","14","11","15","16","17","AA","BB","AA"};
		Set s = new HashSet();
		for (int i = 0; i < args1.length; i++)
		{
			if (!s.add(args1[i]))
		System.out.println("Duplicate detected: " +	args1[i]);
		}
		//System.out.println(s.size() +" distinct words detected: " +s);
		System.out.println("========== LIST ==============");
		List l = new ArrayList();
		//for (int i = 0; i < args1.length; i++)
		//if(!l.add(args1[i]));
		//Collections.shuffle(l, new Random());
		System.out.println(l);
		
	}
}
