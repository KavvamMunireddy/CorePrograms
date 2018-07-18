package com.muni;

public class StringType 
{
	public static void main(String[] args) 
	{
		String s="Muni";
		String s1="Reddy";
		String sum=s+""+s1;
		System.out.println(sum);
		StringBuffer br=new StringBuffer(sum);
		String k=br.reverse().toString();
		System.out.println(k);
		System.out.println(br.capacity());
		System.out.println(br.length());
		System.out.println(br.toString());
		
			
		System.out.println(br.codePointAt(1));
		System.out.println(br.codePointAt(2));
		System.out.println(br.codePointAt(3));
		System.out.println(br.codePointAt(4));
		System.out.println(br.codePointAt(5));
		System.out.println(br.codePointAt(6));
		System.out.println(br.codePointAt(7));
		System.out.println(br.codePointAt(8));
		System.out.println(br.hashCode());
		System.out.println("================");
		double b=32;
		boolean c=(b>0);
		System.out.println(c);
		if(b<0)
		{
			System.out.println("b lessthan zero");
		}
		else if(b>0)
		{
			System.out.println("b greaterthan zero ");
		}
		else
			System.out.println("b is zero");
		System.out.println("===============");
		int j=2;
		switch(j){
		case 1:System.out.println("one");
		break;
		case 2:System.out.println("two");
		case 3:System.out.println("three");
		break;
		case 4:System.out.println("four");
		case 6:System.out.println("six");
		default :System.out.println("unknow");
		
		}
		System.out.println("=============");
		System.out.println("Even Numbers::");
		for(int l=1;l<10;l++)
		{
			if(l%2==0){
			
			System.out.println(l);
			}
			
			
		}
		System.out.println("Odd Numbers::");
		for(int l=1;l<10;l++)
		{
			if(l%2!=0){
			
			System.out.println(l);
			}
			
			
		}
		System.out.println("Prime Numbers::");
		for(int l=1;l<=103;l++)
		{
			int count=0;
			for(int h=1;h<=l;h++)
			{
			if(l%h==0)
			{
			count++;
			}
			}
			if(count==2)
				System.out.println(l);
		}
		
		
	}

}
