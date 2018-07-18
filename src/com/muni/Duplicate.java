
package com.muni;
import java.util.ArrayList;

public class Duplicate
{	
	public static void main(String args[])
	{	    
		String s1=new String("anil");
		String s2=s1.replace('n','i');
		s1.concat("reddy");
		System.out.println(s1);
		System.out.println((s1+s2).charAt(5));
	  ArrayList al = new ArrayList();	    
	    al.add("java");
	    al.add('a');
	    al.add('b');
	    al.add('a');
	    al.add("java");
	    al.add(10.3);
	    al.add(15);
	    al.add('c');
	    al.add(14);
	    al.add("java");
	    al.add(12);
	    al.add("java");
	    al.add(10.3);
	    al.add('c');
	    al.add('d');
	    al.add("java");
	    al.add(12);
	    al.add("java");
	    al.add(10.3);
	    al.add('c');
	System.out.println("Before Remove Duplicate elements: "+al+" ");	 
	for(int i=0;i<al.size();i++)
	{	
		for(int j=i+1;j<al.size();j++)
		{
	      if(al.get(i).equals(al.get(j)))
	      {	    	 
	    	 al.remove(j);
	      }
	    }	 
	 }	 
	 System.out.println("After Removing duplicate elements:"+al);
	 //
	}	 
}


