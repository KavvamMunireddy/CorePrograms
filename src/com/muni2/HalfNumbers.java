package com.muni2;

public class HalfNumbers 
{
	public static void main(String[] args) 
	{
	String[] s={"Muni","B","C","D","E","F","G","H","I","J","K","L","Muni","B","C","D","E","F","G",
			    "H","I","J","K","L","Muni","B","C","D","E","F","G","H","I","J","Muni","B","C","D",
			    "Muni","B","C","D","E","F","G","H","I","J","K","L","Muni","B","C","D","E","F","G",
			    "H","I","J","K","L","Muni","B","C","D","E","F","G","H","I","J","Muni","B","C","D",
			    "Muni","B","C","D","E","F","G","H","I","J","K","L","Muni","B","C","D","E","F","G",
			    "H","I","J","K","L","Muni","B","C","D","E","F","G","H","I","J","Muni","B","C","D"};
	System.out.println(s.length);
	
	System.out.println();
	for(int k=0;k<s.length;k++)
	{
		System.out.print(s[k]+" ");		
		if(k==11)			
			break;
		continue;
	}
	System.out.println(" ");
	for(int k=12;k<s.length;k++)
	{
		System.out.print(s[k]+" ");
		if(k==23)
			break;
	}
	System.out.println(" ");
	for(int k=24;k<s.length;k++)
	{
		System.out.print(s[k]+" ");
		if(k==35)
			break;	
	}
	System.out.println("");
	for(int k=36;k<s.length;k++)
	{
		System.out.print(s[k]+" ");
		if(k==47)
			break;	
	}
	System.out.println("");
	for(int k=48;k<s.length;k++)
	{
		System.out.print(s[k]+" ");
		if(k==s.length)
			break;	
	}
	System.out.println("");
	for(int i=0;i<s.length/2;i++)
	{
		System.out.print(s[i]+" ");
	}
	System.out.println("");
	for(int k=s.length/2;k<s.length;k++)
	{
		System.out.print(s[k]+" ");
	}
	}	
}
