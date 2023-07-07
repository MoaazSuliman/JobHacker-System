package week7.task4;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Dictionary {
	private static HashMap<Character, String> map = new HashMap<>();

	public static void main(String[] args) {
		// this will be added to map.
		putIntoMap('b', "be careful from learning java!");
		// this will be added to map.
		putIntoMap('a', "a java developer should be senior to can get job");
		// this will not added to map.
		putIntoMap('a', "a java developer should be senior to can get job");

		// print map in increasing order.
		printMapInIncreasingOrder();
		
		

	}

	private static boolean putIntoMap(char a, String string) {
		if (string.charAt(0) != a)
			return false;
		map.put(a, string);
		return true;

	}

	private static void printMapInIncreasingOrder() {
		// tree map to be sorted.
		TreeMap<Character, String> tree = new TreeMap<Character, String>(map);
		for (Map.Entry<Character, String> entry : tree.entrySet()) {
			char key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key => " + key + " Value => " + value);
		}
		System.out.println();
	}

	private static void printKeyByGivenValue(String words) {
		// This Is Simple Trick.
		// I am Sure From The Last The Key Will Always Will Be As The First Character In
		// The String.
		System.out.println(words.charAt(0));

	}
}
