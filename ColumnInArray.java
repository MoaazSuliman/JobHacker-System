package week1;

import java.util.Scanner;

public class ColumnInArray {
	static final int Number = 12;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		char c = input.next().charAt(0);
		double arr[][] = new double[Number][Number];
		double result = 0;
		for (int i = 0; i < Number; i++) {
			for (int j = 0; j < Number; j++) {
				arr[i][j] = input.nextDouble();
			}
		}
		for (int i = 0; i < Number; i++) {
			for (int j = 0; j < Number; j++) {
				if (j == x) {
					result += arr[i][j];
				}
			}
		}
		if (c == 'S') {
			System.out.printf("%.1f\n", result);
		} else {
			System.out.printf("%.1f\n", result / Number);
		}
	}
}
