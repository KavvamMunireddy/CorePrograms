package com.muni3;

public class HashCode 
{
	public static void main(String[] args) 
	{
		String s1="Aa";
		String s2="Aa";
		String s3=new String("Muni");
		String s="Muni";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode()==s2.hashCode());
		System.out.println(s3==s);
		System.out.println(s3.equals(s));
		System.out.println(s3.hashCode()==s.hashCode());
			
		
	}

}
