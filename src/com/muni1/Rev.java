package com.muni1;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Rev
{
		public static void main(String args[]) throws FileNotFoundException, IOException {
		//original string
		String str = "you got a job";
		System.out.println("Original String: " + str);
		//reversed string using Stringbuffer
		String reverseStr = new StringBuffer(str).reverse().toString();
		System.out.println("Reverse String in Java using StringBuffer: " + reverseStr);
		//iterative method to reverse String in Java
		
		{
		StringBuilder strBu = new StringBuilder();
		char[] strChars = str.toCharArray();
		for (int i = strChars.length - 1; i >= 0; i--) {
		 strBu=strBu.append(strChars[i]);
		}
		System.out.println("Reverse String in Java using Iteration: " +strBu);

		}
		}
}
