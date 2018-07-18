package com.muni2;

public class StringDivisible 
{
	public static String m1() 
	{
		String s="capgemini";
		for(int i=1;i<=15;i++)
		{
			if(i%3==0)
			{
				if(i%5==0)
				{
					System.out.println("capgemini");
				}
				else 
				{
					System.out.println("cap");
				}
			}
			
			else if(i%5==0)
			{
				System.out.println("gemini");
			}
			else
			{
				System.out.println(i);
			}
		}
		return "s";
	} 
	public static void main(String[] args) 
	{
		m1();
		
	}

}
