package week4.task2;

import java.util.Scanner;

public class Palindrome {

	public static boolean isPalindrome1(String string) {
		int index = string.length() - 1;
		for (int i = 0; i < string.length() / 2; i++, index--) {
			if (string.charAt(index) != string.charAt(i))
				return false;
		}
		return true;
	}

	public static boolean isPalindrome2(String string) {
		StringBuilder stringBuilder = new StringBuilder(string);
		stringBuilder.reverse();
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != stringBuilder.charAt(i))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String string = input.next();

		System.out.println(isPalindrome1(string));
		System.out.println(isPalindrome2(string));
	}
}
