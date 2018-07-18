package com.muni3;

public class Repea 
{
	public static void main(String[] args)
	{
		int count=0;
		String s="MUNIUREDDYT";
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[j]==c[i])
				{
					System.out.println(c[j]);
				}
				
			}
			
		}
		switch(count){    
		case 12:    
		 //code to be executed;    
		 break;  //optional  
		case (int) 2.2:    
		 //code to be executed;    
		 break;  //optional  
		case 5:    
			 //code to be executed;    
			 break; 
		    
		default:
		}
	}

}
