package com.muni3;

public class PrimeNumbers
{
	public static void main(String[] args)throws NumberFormatException 
	{		

	
	Integer k=299622422;
	{
	
		double cou=0;
		for(double i=1;i<=10;i++)
		{
			if(k%i==0)
			{	
				cou++;
			}
		}
		if(cou==2)
		System.out.println(k+" is a prime Number  "+(k*k));
		}
	}

}
