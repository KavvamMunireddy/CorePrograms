package com.muni;

public class Swap2Strings {

	public static void main(String[] args) {
		String str="Munireddy";
		String str1="Kavvam";
//		first need to concat 2 strings
		System.out.println("Str:: "+str+", Str_1:: "+str1);
		
		str=str+str1;
		
		str1 =str.substring(0, str.length()-str1.length());
		
		str = str.substring(str1.length());
		
		System.out.println("After_Str:: "+str+", Str_1:: "+str1);
	}
}
