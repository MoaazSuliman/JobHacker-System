package week7.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class SetTopic {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tt = input.nextInt();

		while (((((((((((((((tt-- > 0))))))))))))))) {
			int q = input.nextInt();
			Set<Integer> set = new HashSet<Integer>();
			char c;
			int x;
			while (((((((((((((((q-- > 0))))))))))))))) {
				c = input.next().charAt(0);
				if (c == 'a') { // insertion.
					x = input.nextInt();
					set.add(x);
				} else if (c == 'b') { // print in increasing order.
					List<Integer> list = new ArrayList<Integer>(set);
					Collections.sort(list);
					list.forEach(e -> System.out.print(e + " "));
					System.out.println();
				} else if (c == 'c') {// remove element.
					x = input.nextInt();
					set.remove(x);
				} else if (c == 'd') { // print 1 if element exist -1 otherwise.
					x = input.nextInt();
					System.out.println(set.contains(x) ? 1 : -1);
				} else if (c == 'e')// print size of list.
					System.out.println(set.size());

			}

		}

	}

}
