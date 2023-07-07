package week7.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class LinkedHashSetTopic {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tt = input.nextInt();
		while (((((((((((((((tt-- > 0))))))))))))))) {
			int q = input.nextInt();
			LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
			char c;
			int x;
			while (((((((((((((((q-- > 0))))))))))))))) {
				c = input.next().charAt(0);

				if (c == 'a') { // insertion.
					x = input.nextInt();
					set.add(x);
				} else if (c == 'b') { // print sort arr.
					ArrayList<Integer> list = new ArrayList<>(set);
					Collections.sort(list);
					System.out.println(list);
				} else if (c == 'c') {// remove element.
					x = input.nextInt();
					set.remove(x);
				} else if (c == 'd') { // if this element exist.
					x = input.nextInt();
					System.out.println(set.contains(x) ? "1" : "-1");
				} else if (c == 'e')// print size.
					System.out.println(set.size());
				else { // C== 'f'==> iterate in set and print it in insertion order.
					set.forEach(e -> System.out.print(e+" "));
					System.out.println();
				}
			}

		}

	}
}
