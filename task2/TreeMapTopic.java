package week7.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapTopic {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int tt = input.nextInt();

		while (((((((((((((((tt-- > 0))))))))))))))) {
			int q = input.nextInt();
			TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
			char c;
			int x, y;
			while (((((((((((((((q-- > 0))))))))))))))) {
				c = input.next().charAt(0);
				if (c == 'a') { // insertion.
					x = input.nextInt();
					y = input.nextInt();
					map.put(x, y);
				} else if (c == 'b') { // if key exist print it's value else -1.
					x = input.nextInt();
					System.out.println(map.containsKey(x) ? map.get(x) : "-1");
				} else if (c == 'c') {// remove element.
					System.out.println(map.size());
				} else if (c == 'd') { // delete by key.
					x = input.nextInt();
					map.remove(x);
				} else if (c == 'e')// print map sorted key.
					for (Integer key : map.keySet())
						System.out.println(key);

			}

		}

	}
}
