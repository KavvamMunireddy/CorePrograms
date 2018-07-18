package com.muni;

import java.util.UUID;

public class BitWise 
{
	public static void main(String[] args) 
	{
		int x=10&8;
		int y=10|8;
		int z=10^8;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		int a=40<<3;
		System.out.println(a);
		int a1=23<<2;
		System.out.println(a1);
		
		/*int a4=40>>3;
		System.out.println(a4);
		int a3=40>>2;
		System.out.println(a3);
		int a2=40>>6;
		System.out.println(a2);
		
		int a7=40>>>3;
		System.out.println(a7);
		int a6=40>>>2;
		System.out.println(a6);
		int a5=40>>>1;
		System.out.println(a5);
		System.out.println(a3=a6);*/
		
		UUID uuid=UUID.randomUUID();
		System.out.println("=================="+uuid.toString());
	}

}
