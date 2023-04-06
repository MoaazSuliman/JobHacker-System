package week1;

import java.util.Scanner;

public class ArrayFill {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		int counter = 0;
		int arr[] = new int[1000];
		for (int i = 0; i < 1000; i++) {
			arr[i] = counter++;
			if (counter == t) {
				counter = 0;
			}

		}
		for (int i = 0; i < 1000; i++) {
			System.out.println("N[" + i + "] = " + arr[i]);
		}
	}
}
