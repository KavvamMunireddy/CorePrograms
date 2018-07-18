



package com.muni;

import java.util.Scanner;

public class Fibonacci{ 
public static void main(String[] args) 
	{
	int i=0,j=1;
	Scanner s=new Scanner(System.in);
	System.out.println("enter a number");
	int k=s.nextInt();
	System.out.println("Fibonacci::"+i);
	System.out.println("Fibonacci::"+j);
	System.out.println("========================");
	for(int c=0;c<=k;c++)
	{
		c=i+j;
		i=j;
		j=c;
		
		System.out.println("Fibonacci::"+c);
	}
	System.out.println("=========================");
	}

}
