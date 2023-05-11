package week5.task3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class CalcTheSunAndAverageFromFile {

//	private static int[] getFileNumbers() {
//		return null;
//	}

	private static void readFromWebFile() throws IOException {

		String inputFile = "http://liveexample.pearsoncmg.com/data/Scores.txt";
		String outputFile = "src/week5/task2/Scores.txt";

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(new URL(inputFile).openStream()));
				BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
			String line;
			while ((line = reader.readLine()) != null) {
				writer.write(line);
//				String[] words = line.split("\\s+"); 
//				for (String word : words) {
//					writer.write(word);
//					writer.newLine();
//				}
			}
		} catch (IOException e) {
			System.out.println(e.getCause());
			System.err.println("Failed to read/write file: " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		try {
			readFromWebFile();
			System.out.println("Done");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// This Doesn't Work When I Debug ==> Every Thing Is Work But The Current File
		// Doen't Take Any Numbers But In
		// The Debug Show Me He Takes.
		// I Tried More Than One Way:( .

		/* I Know I Should Solve It And I'm Sorry For That. */
		/* I Have Exams Every Day In This Week And There Exam After 2 hours. */
	}
}
