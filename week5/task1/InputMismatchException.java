package week5.task1;

import java.util.Scanner;

public class InputMismatchException {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b;
		while (true) {
			try {
				System.out.println("Enter The First Number : ");
				a = input.nextInt();
				break;
			} catch (java.util.InputMismatchException e) {
				System.out.println("Enter The First Number Again 'Not A String' : ");
				input.nextLine();
			}
		}
		while (true) {
			try {
				System.out.println("Enter The Second Number : ");
				b = input.nextInt();
				break;
			} catch (java.util.InputMismatchException e) {
				System.out.println("Enter The Second Number Again 'Not A String' : ");
				input.nextLine();
			}
		}

		System.out.println(a + " + " + b + " = " + (a + b));
	}

}
