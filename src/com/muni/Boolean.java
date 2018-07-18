package com.muni;


public class Boolean extends BitWise
{

	public static void main(String[] args) 
	{
	int x=20;int y=35,k=45;
	boolean b=(x>y);
	System.out.println(b);
	
	boolean c=(x==k);
	System.out.println(c);
	
	boolean d=(x<y);
	System.out.println(d);
	
	boolean e=((x<y)&&(y<k));
	System.out.println(e);
	}

}
