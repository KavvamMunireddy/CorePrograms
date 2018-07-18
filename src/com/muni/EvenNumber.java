package com.muni;

import java.util.Scanner;

public class EvenNumber
{

	public static void main(String[] args) 
	{
	int tot=0;
	Scanner s=new Scanner(System.in);
	System.out.println("enter minimu value::");
	int i=s.nextInt();
	System.out.println("enter maximum value::");
	int j=s.nextInt();
	for(int k=i;k<=j;k++)
	{
		if(k%2==0)
		{
			System.out.println("even::"+k);
			try{
			Thread.sleep(2000);
			}catch(Exception e){System.out.println(e);}
			tot=tot+k;
		}
		
		
		
	}
	System.out.println("================");
	System.out.println("sum of even numbers::"+tot);
	
	}

}
