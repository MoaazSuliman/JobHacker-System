package week1;

import java.util.Scanner;

public class EvenOddPositiveNegative {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int positive = 0, negative = 0, odd = 0, even = 0;
		for (int i = 0; i < 5; i++) {
			int x = input.nextInt();
			if (x % 2 == 0)
				even++;
			else
				odd++;
			if (x > 0)
				positive++;
			else if (x < 0)
				negative++;
		}
		System.out.println(even + " valor(es) par(es)");
		System.out.println(odd + " valor(es) impar(es)");
		System.out.println(positive + " valor(es) positivo(s)");
		System.out.println(negative + " valor(es) negativo(s)");
	}

}
