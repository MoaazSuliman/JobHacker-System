package week4.bonus;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TheNumberOfWordInString {
	public static int firstWay(String string, String word) {
		int count = 0;
		for (String s : string.split(" ")) {
			if (s.equals(word))
				count++;
		}
		return count;
	}

	public static int secondWay(String string, String word) {
		return (string.split(word)).length;
	}

	public static int thirdWay(String string, String word) {
		int count = 0;
	    StringTokenizer tokenizer = new StringTokenizer(string);
	    while (tokenizer.hasMoreTokens()) {
	        String token = tokenizer.nextToken();
	        if (token.equalsIgnoreCase(word)) {
	            count++;
	        }
	    }
	    return count;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String string = input.nextLine();
		String word = input.next();
		System.out.println(firstWay(string, word));
		System.out.println(secondWay(string, word));
		System.out.println(thirdWay(string, word));
	}

}
