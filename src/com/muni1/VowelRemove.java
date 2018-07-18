package com.muni1;

import java.util.Scanner;

public class VowelRemove 
{
	public static void main(String args[])
	   {
	       String strOrig, strNew;
	       Scanner scan = new Scanner(System.in);
	       
	       System.out.print("Enter a String : ");
	       strOrig = scan.nextLine();
	       
	       System.out.print("Removing Vowels from The String  " +strOrig+  "\n");
	       strNew = strOrig.replaceAll("[aeiouAEIOU]", "");
		   
	       System.out.print("Now the String is : "+strNew);
	              
	       System.out.println();
	       System.out.println("======Manual Method========");
	       String str, r;
	       
	       System.out.print("Enter a String : ");
	       str = scan.nextLine();

	       System.out.print("Removing Vowels from String [" +str+ "]\n");
	       r = removeVowels(str);
		   
	       System.out.print("Vowels Removed from the Entered String Successfully..!!\nNow the String is :\n");
	       System.out.print(r);
	   }

	   private static String removeVowels(String s)
	   {
	     String finalString = "";
	     int i;

	     for(i=0; i<s.length(); i++)
	     {
	       if (!isVowel(Character.toLowerCase(s.charAt(i))))
	       {
	         finalString = finalString + s.charAt(i);
	       }
	     }
	     return finalString;
	   }

	   private static boolean isVowel(char c)
	   {
	     String vowels = "aeiou";
	     int i;
	     for(i=0; i<5; i++)
	     {
	       if(c == vowels.charAt(i))
	       {
	         return true;
	       }
	     }
	     return false;
	   }

}
