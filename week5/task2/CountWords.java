package week5.task2;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CountWords {

	public static void main(String[] args) {
//		/JobHackerComminuty/src/week5/task2/CountWords.java
//		/JobHackerComminuty/src/week5/task2/Lincoln.txt
		String filePath = "src/week5/task2/Lincoln.txt";

		try {
			String string = Files.readString(Paths.get(filePath));
			System.out.println(string);
			String[] split = string.split(" ");
			System.out.println("The Words Count In This File Is = " + split.length);
		} catch (Exception e) {
			System.out.println("In Catch");
			System.out.println(e.getMessage());
		}
	}
}
