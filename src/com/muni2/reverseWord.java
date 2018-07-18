package com.muni2;

import java.util.Scanner;

public class reverseWord
{
		//================ Each word Reverse =====================
		 static void reverseEachWordOfString(String inputString)
		    {
			 //first split the paragraph in word type by using split()
		        String[] words = inputString.split(" ");
		         
		        String reverseString ="";		         
		        for (int i = 0; i < words.length; i++) 
		        {
		            String word = words[i];
		           // System.out.println(words[i]+" ");
		            //identify index of each word
		            int k=Integer.parseInt(word.valueOf(i+1));
		           // System.out.println(k);
		            String reverseWord = "";
		            String sameword="";
		      	   if(k%2==0)
		            {
		            	for (int j = word.length()-1; j >= 0; j--) 
				        {		            	
		                reverseWord = reverseWord + word.charAt(j);
		            	}		            	 
		            }
		            else 
		            {
		            	sameword=sameword+word+"";
		            	//System.out.println(word+"  ");      
		            }
		            reverseString = reverseString+sameword+ reverseWord + " ";
		        }
		        System.out.println(inputString);	       
		        System.out.println("-------------------------");
		        System.out.println(reverseString);
		    }
		    public static void main(String[] args) 
		    {
		        Scanner s=new Scanner(System.in);
		        System.out.println("enter one line of para to see the reverse into the even word");
		        String inputString=s.nextLine();
		        reverseEachWordOfString(inputString);
		    }
}
