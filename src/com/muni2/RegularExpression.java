package com.muni2;

public class RegularExpression 
{
	   public static void main( String args[] ) {
	     
	      //======  remove alphabets and special characters in a string  =============
	      String str = "aASDXS124-_tyz.78x152485";
	      str = str.replaceAll("[^\\d]","");
	      System.out.println(str);
	      //===========  remove numbers and special characters =======
	      String phoneNumberstr = "eStl: 00971-55 789-akfj0_999";      
	       phoneNumberstr = phoneNumberstr.replaceAll("[^a-z]","");
	      System.out.println(phoneNumberstr);
	   }
	}


