package week1;

import java.util.Scanner;

public class Multiplies {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		// To Replace Numbers If Second Number Are Greater Than The First Number...
		if (b > a) {
			int temp = b;
			b = a;
			a = temp;
		}
		if (a % b == 0)
			System.out.println("Sao Multiplos");
		else
			System.out.println("Nao sao Multiplos");
	}

}
