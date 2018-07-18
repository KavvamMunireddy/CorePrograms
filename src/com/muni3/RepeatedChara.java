package com.muni3;

import java.util.Scanner;

public class RepeatedChara 
{
	
	public static void main(String[] args) 
	{
			int  j, k;
	        String str;
	        char c, ch;
	        Scanner scan = new Scanner(System.in);
	        
	        System.out.print("Enter a String : ");
	        str=scan.nextLine();                                                       
	        for(c='A'; c<='z'; c++)
	        {
	        	//System.out.println(c+"  ");
	            k=0;
	            for(j=0; j<str.length(); j++)
	            {
	                ch = str.charAt(j);
	                if(ch == c)
	                {
	                    k++;
	                }
	            }
	            if(k>0)
	            {
	                System.out.println("The character " + c + " == " + k );
	            }
	        }
	}

}
