package week1;

import java.util.Scanner;

public class ArrayChange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arr[] = new int[20];
		for (int i = 19; i >= 0; i--) {
			arr[i] = input.nextInt();
		}
		for (int i = 0; i < 20; i++) {
			System.out.println("N[" + i + "] = " + arr[i]);
		}
	}
}
