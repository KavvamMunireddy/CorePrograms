package com.muni2;

public class diamond1
{

	public static void main(String[] args)
	{
		for(int i=0;i<=5;i++)
		{
			for(int k=0;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int k=5;k>=0;k--)
		{
			for(int m=0;m<=k;m++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
