package com.muni;

public class Revers {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		String str = "Prameela Madhu Experience in debugging and maintenance of Java JEE applications";
		System.out.println(str);
		System.out.println("=============Full reverse string=================");
		// one way
		StringBuilder br = new StringBuilder(str);
		String reverse = br.reverse().toString();
		System.out.println(reverse);
		System.out.println("==============================");
		// first split the string
		String[] words = str.split(" ");
		String reverseString = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			// System.out.println(words[i]+" ");
			int k = Integer.parseInt(word.valueOf(i + 1));
			// System.out.println(k);
			String reverseWord = "";
			String sameword = "";
			if (k % 2 == 0) {

				for (int j = word.length() - 1; j >= 0; j--) {
					reverseWord = reverseWord + word.charAt(j);
				}
			} else {
				sameword = sameword + word + "";
				// System.out.println(word+" ");
			}
			reverseString = reverseString + sameword + reverseWord + " ";
		}

		System.out.println(reverseString);

		System.out.println("-------------------------");
	}

}
// }
