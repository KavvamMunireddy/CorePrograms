package com.muni3;

import java.util.Scanner;

public class DuplicateRemoveChar {
	private static char ch;
	private static String ans = "";

	public static void main(String args[]) {
		Scanner sca = new Scanner(System.in);
		System.out.print("Enter any word : ");
		String s = sca.nextLine();
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			if (ch != ' ')
				ans = ans + ch;
			s = s.replace(ch, ' '); // Replacing all occurrence of the current
									// character by a space
			System.err.println("Character::" + ch);
		}
		System.out.println("Word after removing duplicate characters : " + ans);
	}
}
