package com.muni;

public class SumOfDigits 
{
	static int sum=0;
	public int getNumber(int number)
	{
		if(number==0)
		{
			return sum;
		}
		else
		{
			sum+=(number%10);
			getNumber(number/10);
		}
		return sum;
	}

	public static void main(String[] args) 
	{
		SumOfDigits su=new SumOfDigits ();
		System.out.println("sum is:: " +sum);
		su.getNumber(13);
		
		
	}

}
