package week1;

import java.util.Scanner;

public class HieghstAndPosition {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int index = -1;
		int max = -1;
		for (int i = 0; i < 100; i++) {
			int x = input.nextInt();
			if (x > max) {
				index = i + 1;
				max = x;
			}
		}
		System.out.println(max);
		System.out.println(index);
	}

}
