package week1;
import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("MEDIA = %.1f\n",
				(input.nextDouble() / 10 * 2 + input.nextDouble() / 10 * 3 + input.nextDouble() / 10 * 5));
	}

}
