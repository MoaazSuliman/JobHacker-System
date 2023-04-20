package week4.task1;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String string = input.next();
		/* First Way */
		System.out.println("This Is The First Way: ");
		for (int i = string.length() - 1; i >= 0; i--) {
			System.out.print(string.charAt(i));
		}
		System.out.println();
		/* Second Way */
		StringBuilder stringBuilder = new StringBuilder(string);
		System.out.println("Second Way \n" + stringBuilder.reverse());

	}
}
