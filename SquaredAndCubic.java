package week1;

import java.util.Scanner;

public class SquaredAndCubic {


		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int x = input.nextInt();

			for (int i = 1; i <= x; i++) {
				System.out.println(i + " " + (int) Math.pow(i, 2) + " " + (int) Math.pow(i, 3) * 1 / 1);
			}
		}

}
